// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.identity;

import com.azure.core.credential.TokenCredential;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.identity.implementation.IdentityLogOptionsImpl;
import com.azure.identity.implementation.util.IdentityConstants;
import com.azure.identity.implementation.util.IdentityUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;

import static com.azure.identity.ManagedIdentityCredential.AZURE_FEDERATED_TOKEN_FILE;

/**
 * Fluent credential builder for instantiating a {@link DefaultAzureCredential}.
 *
 * @see DefaultAzureCredential
 */
public class DefaultAzureCredentialBuilder extends CredentialBuilderBase<DefaultAzureCredentialBuilder> {
    private static final ClientLogger LOGGER = new ClientLogger(DefaultAzureCredentialBuilder.class);

    private String tenantId;
    private String managedIdentityClientId;
    private String workloadIdentityClientId;
    private String managedIdentityResourceId;
    private List<String> additionallyAllowedTenants = IdentityUtil
        .getAdditionalTenantsFromEnvironment(Configuration.getGlobalConfiguration().clone());


    /**
     * Creates an instance of a DefaultAzureCredentialBuilder.
     */
    public DefaultAzureCredentialBuilder() {
        this.identityClientOptions.setIdentityLogOptionsImpl(new IdentityLogOptionsImpl(true));
    }

    /**
     * Sets the tenant id of the user to authenticate through the {@link DefaultAzureCredential}. If unset, the value
     * in the AZURE_TENANT_ID environment variable will be used. If neither is set, the default is null
     * and will authenticate users to their default tenant.
     *
     * @param tenantId the tenant ID to set.
     * @return An updated instance of this builder with the tenant id set as specified.
     */
    public DefaultAzureCredentialBuilder tenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }


    /**
     * Specifies the Azure Active Directory endpoint to acquire tokens.
     * @param authorityHost the Azure Active Directory endpoint
     * @return An updated instance of this builder with the authority host set as specified.
     */
    public DefaultAzureCredentialBuilder authorityHost(String authorityHost) {
        this.identityClientOptions.setAuthorityHost(authorityHost);
        return this;
    }


    /**
     * Specifies the KeePass database path to read the cached credentials of Azure toolkit for IntelliJ plugin.
     * The {@code databasePath} is required on Windows platform. For macOS and Linux platform native key chain /
     * key ring will be accessed respectively to retrieve the cached credentials.
     *
     * <p>This path can be located in the IntelliJ IDE.
     * Windows: File -&gt; Settings -&gt; Appearance &amp; Behavior -&gt; System Settings -&gt; Passwords. </p>
     *
     * @param databasePath the path to the KeePass database.
     * @throws IllegalArgumentException if {@code databasePath} is either not specified or is empty.
     * @return An updated instance of this builder with the KeePass database path set as specified.
     */
    public DefaultAzureCredentialBuilder intelliJKeePassDatabasePath(String databasePath) {
        if (CoreUtils.isNullOrEmpty(databasePath)) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("The KeePass database path is either empty or not configured."
                                                   + " Please configure it on the builder."));
        }
        this.identityClientOptions.setIntelliJKeePassDatabasePath(databasePath);
        return this;
    }

    /**
     * Specifies the client ID of user assigned or system assigned identity, when this credential is running
     * in an environment with managed identities. If unset, the value in the AZURE_CLIENT_ID environment variable
     * will be used. If neither is set, the default value is null and will only work with system assigned
     * managed identities and not user assigned managed identities.
     *
     * Only one of managedIdentityClientId and managedIdentityResourceId can be specified.
     *
     * @param clientId the client ID
     * @return the DefaultAzureCredentialBuilder itself
     */
    public DefaultAzureCredentialBuilder managedIdentityClientId(String clientId) {
        this.managedIdentityClientId = clientId;
        return this;
    }

    /**
     * Specifies the client ID of Azure AD app to be used for AKS workload identity authentication.
     * if unset, {@link DefaultAzureCredentialBuilder#managedIdentityClientId(String)} will be used.
     * If both values are unset, the value in the AZURE_CLIENT_ID environment variable
     * will be used. If none are set, the default value is null and Workload Identity authentication will not be attempted.
     *
     * @param clientId the client ID
     * @return the DefaultAzureCredentialBuilder itself
     */
    public DefaultAzureCredentialBuilder workloadIdentityClientId(String clientId) {
        this.workloadIdentityClientId = clientId;
        return this;
    }

    /**
     * Specifies the resource ID of user assigned or system assigned identity, when this credential is running
     * in an environment with managed identities. If unset, the value in the AZURE_CLIENT_ID environment variable
     * will be used. If neither is set, the default value is null and will only work with system assigned
     * managed identities and not user assigned managed identities.
     *
     * Only one of managedIdentityResourceId and managedIdentityClientId can be specified.
     *
     * @param resourceId the resource ID
     * @return the DefaultAzureCredentialBuilder itself
     */
    public DefaultAzureCredentialBuilder managedIdentityResourceId(String resourceId) {
        this.managedIdentityResourceId = resourceId;
        return this;
    }

    /**
     * Specifies the ExecutorService to be used to execute the authentication requests.
     * Developer is responsible for maintaining the lifecycle of the ExecutorService.
     *
     * <p>
     * If this is not configured, the {@link ForkJoinPool#commonPool()} will be used which is
     * also shared with other application tasks. If the common pool is heavily used for other tasks, authentication
     * requests might starve and setting up this executor service should be considered.
     * </p>
     *
     * <p> The executor service and can be safely shutdown if the TokenCredential is no longer being used by the
     * Azure SDK clients and should be shutdown before the application exits. </p>
     *
     * @param executorService the executor service to use for executing authentication requests.
     * @return An updated instance of this builder with the executor service set as specified.
     */
    public DefaultAzureCredentialBuilder executorService(ExecutorService executorService) {
        this.identityClientOptions.setExecutorService(executorService);
        return this;
    }

    /**
     * For multi-tenant applications, specifies additional tenants for which the credential may acquire tokens.
     * Add the wildcard value "*" to allow the credential to acquire tokens for any tenant the application is installed.
     *
     * @param additionallyAllowedTenants the additionally allowed tenants.
     * @return An updated instance of this builder with the tenant id set as specified.
     */
    @SuppressWarnings("unchecked")
    public DefaultAzureCredentialBuilder additionallyAllowedTenants(String... additionallyAllowedTenants) {
        this.additionallyAllowedTenants = IdentityUtil.resolveAdditionalTenants(Arrays.asList(additionallyAllowedTenants));
        return this;
    }

    /**
     * For multi-tenant applications, specifies additional tenants for which the credential may acquire tokens.
     * Add the wildcard value "*" to allow the credential to acquire tokens for any tenant the application is installed.
     *
     * @param additionallyAllowedTenants the additionally allowed tenants.
     * @return An updated instance of this builder with the tenant id set as specified.
     */
    @SuppressWarnings("unchecked")
    public DefaultAzureCredentialBuilder additionallyAllowedTenants(List<String> additionallyAllowedTenants) {
        this.additionallyAllowedTenants = IdentityUtil.resolveAdditionalTenants(additionallyAllowedTenants);
        return this;
    }

    /**
     * Creates new {@link DefaultAzureCredential} with the configured options set.
     *
     * @return a {@link DefaultAzureCredential} with the current configurations.
     * @throws IllegalStateException if clientId and resourceId are both set.
     */
    public DefaultAzureCredential build() {
        loadFallbackValuesFromEnvironment();
        if (managedIdentityClientId != null && managedIdentityResourceId != null) {
            throw LOGGER.logExceptionAsError(
                new IllegalStateException("Only one of managedIdentityResourceId and managedIdentityClientId can be specified."));
        }
        if (!CoreUtils.isNullOrEmpty(additionallyAllowedTenants)) {
            identityClientOptions.setAdditionallyAllowedTenants(additionallyAllowedTenants);
        }
        return new DefaultAzureCredential(getCredentialsChain());
    }

    private void loadFallbackValuesFromEnvironment() {
        Configuration configuration = identityClientOptions.getConfiguration() == null
            ? Configuration.getGlobalConfiguration().clone() : identityClientOptions.getConfiguration();
        tenantId = CoreUtils.isNullOrEmpty(tenantId) ? configuration.get(Configuration.PROPERTY_AZURE_TENANT_ID) : tenantId;
        managedIdentityClientId = CoreUtils.isNullOrEmpty(managedIdentityClientId) ? configuration.get(Configuration.PROPERTY_AZURE_CLIENT_ID) : managedIdentityClientId;
    }

    private ArrayList<TokenCredential> getCredentialsChain() {
        WorkloadIdentityCredential workloadIdentityCredential = getWorkloadIdentityCredentialIfAvailable();
        ArrayList<TokenCredential> output = new ArrayList<TokenCredential>(workloadIdentityCredential != null ? 8 : 7);
        output.add(new EnvironmentCredential(identityClientOptions.clone()));
        if (workloadIdentityCredential != null) {
            output.add(workloadIdentityCredential);
        }
        output.add(new ManagedIdentityCredential(managedIdentityClientId, managedIdentityResourceId, identityClientOptions.clone()));
        output.add(new AzureDeveloperCliCredential(tenantId, identityClientOptions.clone()));
        output.add(new SharedTokenCacheCredential(null, IdentityConstants.DEVELOPER_SINGLE_SIGN_ON_ID,
            tenantId, identityClientOptions.clone()));
        output.add(new IntelliJCredential(tenantId, identityClientOptions.clone()));
        output.add(new AzureCliCredential(tenantId, identityClientOptions.clone()));
        output.add(new AzurePowerShellCredential(tenantId, identityClientOptions.clone()));
        return output;
    }

    private WorkloadIdentityCredential getWorkloadIdentityCredentialIfAvailable() {
        Configuration configuration = identityClientOptions.getConfiguration() == null
            ? Configuration.getGlobalConfiguration().clone() : identityClientOptions.getConfiguration();

        String tenantId = configuration.get(Configuration.PROPERTY_AZURE_TENANT_ID);
        String federatedTokenFilePath = configuration.get(AZURE_FEDERATED_TOKEN_FILE);
        String azureAuthorityHost = configuration.get(Configuration.PROPERTY_AZURE_AUTHORITY_HOST);
        String clientId = CoreUtils.isNullOrEmpty(workloadIdentityClientId) ? managedIdentityClientId : workloadIdentityClientId;
        if (!(CoreUtils.isNullOrEmpty(tenantId)
            || CoreUtils.isNullOrEmpty(federatedTokenFilePath)
            || CoreUtils.isNullOrEmpty(clientId)
            || CoreUtils.isNullOrEmpty(azureAuthorityHost))) {
            return new WorkloadIdentityCredential(tenantId, clientId, federatedTokenFilePath, identityClientOptions.setAuthorityHost(azureAuthorityHost).clone());
        }
        return null;
    }
}
