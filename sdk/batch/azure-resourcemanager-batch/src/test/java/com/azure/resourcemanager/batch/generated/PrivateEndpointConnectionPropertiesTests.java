// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.PrivateEndpointConnectionProperties;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.batch.models.PrivateLinkServiceConnectionStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionPropertiesTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Cancelled\",\"privateEndpoint\":{\"id\":\"olthqtrgqjbp\"},\"groupIds\":[\"s\",\"n\",\"gvfcj\",\"wzo\"],\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"felluwfzitonpe\",\"actionsRequired\":\"pjkjlxofpdv\"}}")
                .toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("felluwfzitonpe", model.privateLinkServiceConnectionState().description());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionProperties model =
            new PrivateEndpointConnectionProperties()
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                        .withDescription("felluwfzitonpe"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProperties.class);
        Assertions
            .assertEquals(
                PrivateLinkServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("felluwfzitonpe", model.privateLinkServiceConnectionState().description());
    }
}
