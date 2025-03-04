// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.data.schemaregistry;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.test.TestBase;
import com.azure.data.schemaregistry.models.SchemaFormat;
import com.azure.identity.DefaultAzureCredentialBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;

import static com.azure.data.schemaregistry.Constants.PLAYBACK_ENDPOINT;
import static com.azure.data.schemaregistry.Constants.PLAYBACK_TEST_GROUP;
import static com.azure.data.schemaregistry.Constants.RESOURCE_LENGTH;
import static com.azure.data.schemaregistry.Constants.SCHEMA_REGISTRY_GROUP;
import static com.azure.data.schemaregistry.Constants.SCHEMA_REGISTRY_JSON_FULLY_QUALIFIED_NAMESPACE;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Tests for {@link SchemaFormat#JSON} using {@link SchemaRegistryAsyncClient}.
 */
public class SchemaRegistryAsyncClientJsonTests extends TestBase {
    static final String SCHEMA_CONTENT = "{ \"$id\": \"https://example.com/person.schema.json\", \"$schema\": \"https://json-schema.org/draft/2020-12/schema\", \"title\": \"Person\", \"type\": \"object\", \"properties\": { \"firstName\": { \"type\": \"string\", \"description\": \"The person's first name.\" }, \"lastName\": { \"type\": \"string\", \"description\": \"The person's last name.\" }, \"age\": { \"description\": \"Age in years which must be equal to or greater than zero.\", \"type\": \"integer\", \"minimum\": 0 } } }";

    private SchemaRegistryClientBuilder builder;
    private SchemaRegistryAsyncClientTestsBase testBase;

    @Override
    protected void beforeTest() {
        TokenCredential tokenCredential;
        String endpoint;
        String schemaGroup;
        if (interceptorManager.isPlaybackMode()) {
            tokenCredential = mock(TokenCredential.class);
            schemaGroup = PLAYBACK_TEST_GROUP;

            // Sometimes it throws an "NotAMockException", so we had to change from thenReturn to thenAnswer.
            when(tokenCredential.getToken(any(TokenRequestContext.class))).thenAnswer(invocationOnMock -> {
                return Mono.fromCallable(() -> {
                    return new AccessToken("foo", OffsetDateTime.now().plusMinutes(20));
                });
            });

            endpoint = PLAYBACK_ENDPOINT;
        } else {
            tokenCredential = new DefaultAzureCredentialBuilder().build();
            endpoint = System.getenv(SCHEMA_REGISTRY_JSON_FULLY_QUALIFIED_NAMESPACE);
            schemaGroup = System.getenv(SCHEMA_REGISTRY_GROUP);

            assertNotNull(endpoint, "'endpoint' cannot be null in LIVE/RECORD mode.");
            assertNotNull(schemaGroup, "'schemaGroup' cannot be null in LIVE/RECORD mode.");
        }

        builder = new SchemaRegistryClientBuilder()
            .credential(tokenCredential)
            .fullyQualifiedNamespace(endpoint);

        if (interceptorManager.isPlaybackMode()) {
            builder.httpClient(interceptorManager.getPlaybackClient());
        } else {
            builder.addPolicy(new RetryPolicy())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .addPolicy(interceptorManager.getRecordPolicy());
        }

        testBase = new SchemaRegistryAsyncClientTestsBase(schemaGroup, SchemaFormat.JSON);
    }

    @Override
    protected void afterTest() {
        Mockito.framework().clearInlineMock(this);
    }

    /**
     * Verifies that we can register a schema and then get it by its schemaId.
     */
    @Test
    public void registerAndGetSchema() {
        // Arrange
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryAsyncClient client1 = builder.buildAsyncClient();
        final SchemaRegistryAsyncClient client2 = builder.buildAsyncClient();

        // Act & Assert
        testBase.registerAndGetSchema(client1, client2, schemaName, SCHEMA_CONTENT);
    }

    /**
     * Verifies that we can register a schema and then get it by its schemaId. Then add another version of it, and get
     * that version.
     */
    @Test
    public void registerAndGetSchemaTwice() {
        // Arrange
        final String schemaContentModified = "{ \"$id\": \"https://example.com/person.schema.json\", \"$schema\": \"https://json-schema.org/draft/2020-12/schema\", \"title\": \"Person\", \"type\": \"object\", \"properties\": { \"firstName\": { \"type\": \"string\", \"description\": \"The person's first name.\" }, \"lastName\": { \"type\": \"string\", \"description\": \"The person's last name.\" }, \"age\": { \"description\": \"Age in years which must be equal to or greater than 1.\", \"type\": \"integer\", \"minimum\": 1 } } }";
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryAsyncClient client1 = builder.buildAsyncClient();
        final SchemaRegistryAsyncClient client2 = builder.buildAsyncClient();

        // Act & Assert
        testBase.registerAndGetSchemaTwice(client1, client2, schemaName, SCHEMA_CONTENT, schemaContentModified);
    }

    /**
     * Verifies that we can register a schema and then get it by its schema group, name, and content.
     */
    @Test
    public void registerAndGetSchemaId() {
        // Arrange
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryAsyncClient client1 = builder.buildAsyncClient();
        final SchemaRegistryAsyncClient client2 = builder.buildAsyncClient();

        // Act & Assert
        testBase.registerAndGetSchemaId(client1, client2, schemaName, SCHEMA_CONTENT);
    }


    /**
     * Verifies that an error is returned if we try to register an invalid schema.
     */
    @Test
    public void registerBadRequest() {
        // Arrange
        final String invalidContent = "{ \"$id\": \"https://example.com/person.schema.json\", \"$schema\": \"https://json-schema.org/draft/2020-12/schema\", \"title\": 5\"Person2\", \"type\": \"object\", \"properties\": { \"firstName\": { \"type\": \"string\", \"description\": \"The person's first name.\" }, \"lastName\": { \"type\": \"string\", \"description\": \"The person's last name.\" }, \"age\": { \"description\": \"Age in years which must be equal to or greater than zero.\", \"type\": \"integer\", \"minimum\": 0 } } }";
        final String schemaName = testResourceNamer.randomName("sch", RESOURCE_LENGTH);
        final SchemaRegistryAsyncClient client1 = builder.buildAsyncClient();

        // Act & Assert
        testBase.registerBadRequest(client1, schemaName, invalidContent);
    }
}
