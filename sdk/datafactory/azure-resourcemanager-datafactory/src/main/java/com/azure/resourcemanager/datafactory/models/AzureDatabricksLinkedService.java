// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureDatabricksLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Azure Databricks linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricks")
@Fluent
public final class AzureDatabricksLinkedService extends LinkedService {
    /*
     * Azure Databricks linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureDatabricksLinkedServiceTypeProperties innerTypeProperties =
        new AzureDatabricksLinkedServiceTypeProperties();

    /** Creates an instance of AzureDatabricksLinkedService class. */
    public AzureDatabricksLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Azure Databricks linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private AzureDatabricksLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     *
     * @return the domain value.
     */
    public Object domain() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().domain();
    }

    /**
     * Set the domain property: &lt;REGION&gt;.azuredatabricks.net, domain name of your Databricks deployment. Type:
     * string (or Expression with resultType string).
     *
     * @param domain the domain value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withDomain(Object domain) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withDomain(domain);
        return this;
    }

    /**
     * Get the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType
     * string).
     *
     * @return the accessToken value.
     */
    public SecretBase accessToken() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessToken();
    }

    /**
     * Set the accessToken property: Access token for databricks REST API. Refer to
     * https://docs.azuredatabricks.net/api/latest/authentication.html. Type: string (or Expression with resultType
     * string).
     *
     * @param accessToken the accessToken value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withAccessToken(SecretBase accessToken) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessToken(accessToken);
        return this;
    }

    /**
     * Get the authentication property: Required to specify MSI, if using Workspace resource id for databricks REST API.
     * Type: string (or Expression with resultType string).
     *
     * @return the authentication value.
     */
    public Object authentication() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authentication();
    }

    /**
     * Set the authentication property: Required to specify MSI, if using Workspace resource id for databricks REST API.
     * Type: string (or Expression with resultType string).
     *
     * @param authentication the authentication value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withAuthentication(Object authentication) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthentication(authentication);
        return this;
    }

    /**
     * Get the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     *
     * @return the workspaceResourceId value.
     */
    public Object workspaceResourceId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().workspaceResourceId();
    }

    /**
     * Set the workspaceResourceId property: Workspace resource id for databricks REST API. Type: string (or Expression
     * with resultType string).
     *
     * @param workspaceResourceId the workspaceResourceId value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withWorkspaceResourceId(Object workspaceResourceId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withWorkspaceResourceId(workspaceResourceId);
        return this;
    }

    /**
     * Get the existingClusterId property: The id of an existing interactive cluster that will be used for all runs of
     * this activity. Type: string (or Expression with resultType string).
     *
     * @return the existingClusterId value.
     */
    public Object existingClusterId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().existingClusterId();
    }

    /**
     * Set the existingClusterId property: The id of an existing interactive cluster that will be used for all runs of
     * this activity. Type: string (or Expression with resultType string).
     *
     * @param existingClusterId the existingClusterId value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withExistingClusterId(Object existingClusterId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withExistingClusterId(existingClusterId);
        return this;
    }

    /**
     * Get the instancePoolId property: The id of an existing instance pool that will be used for all runs of this
     * activity. Type: string (or Expression with resultType string).
     *
     * @return the instancePoolId value.
     */
    public Object instancePoolId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().instancePoolId();
    }

    /**
     * Set the instancePoolId property: The id of an existing instance pool that will be used for all runs of this
     * activity. Type: string (or Expression with resultType string).
     *
     * @param instancePoolId the instancePoolId value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withInstancePoolId(Object instancePoolId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withInstancePoolId(instancePoolId);
        return this;
    }

    /**
     * Get the newClusterVersion property: If not using an existing interactive cluster, this specifies the Spark
     * version of a new job cluster or instance pool nodes created for each run of this activity. Required if
     * instancePoolId is specified. Type: string (or Expression with resultType string).
     *
     * @return the newClusterVersion value.
     */
    public Object newClusterVersion() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterVersion();
    }

    /**
     * Set the newClusterVersion property: If not using an existing interactive cluster, this specifies the Spark
     * version of a new job cluster or instance pool nodes created for each run of this activity. Required if
     * instancePoolId is specified. Type: string (or Expression with resultType string).
     *
     * @param newClusterVersion the newClusterVersion value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterVersion(Object newClusterVersion) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterVersion(newClusterVersion);
        return this;
    }

    /**
     * Get the newClusterNumOfWorker property: If not using an existing interactive cluster, this specifies the number
     * of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted
     * Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools,
     * this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if
     * newClusterVersion is specified. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNumOfWorker value.
     */
    public Object newClusterNumOfWorker() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterNumOfWorker();
    }

    /**
     * Set the newClusterNumOfWorker property: If not using an existing interactive cluster, this specifies the number
     * of worker nodes to use for the new job cluster or instance pool. For new job clusters, this a string-formatted
     * Int32, like '1' means numOfWorker is 1 or '1:10' means auto-scale from 1 (min) to 10 (max). For instance pools,
     * this is a string-formatted Int32, and can only specify a fixed number of worker nodes, such as '2'. Required if
     * newClusterVersion is specified. Type: string (or Expression with resultType string).
     *
     * @param newClusterNumOfWorker the newClusterNumOfWorker value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterNumOfWorker(Object newClusterNumOfWorker) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterNumOfWorker(newClusterNumOfWorker);
        return this;
    }

    /**
     * Get the newClusterNodeType property: The node type of the new job cluster. This property is required if
     * newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property
     * is ignored. Type: string (or Expression with resultType string).
     *
     * @return the newClusterNodeType value.
     */
    public Object newClusterNodeType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterNodeType();
    }

    /**
     * Set the newClusterNodeType property: The node type of the new job cluster. This property is required if
     * newClusterVersion is specified and instancePoolId is not specified. If instancePoolId is specified, this property
     * is ignored. Type: string (or Expression with resultType string).
     *
     * @param newClusterNodeType the newClusterNodeType value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterNodeType(Object newClusterNodeType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterNodeType(newClusterNodeType);
        return this;
    }

    /**
     * Get the newClusterSparkConf property: A set of optional, user-specified Spark configuration key-value pairs.
     *
     * @return the newClusterSparkConf value.
     */
    public Map<String, Object> newClusterSparkConf() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterSparkConf();
    }

    /**
     * Set the newClusterSparkConf property: A set of optional, user-specified Spark configuration key-value pairs.
     *
     * @param newClusterSparkConf the newClusterSparkConf value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterSparkConf(Map<String, Object> newClusterSparkConf) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterSparkConf(newClusterSparkConf);
        return this;
    }

    /**
     * Get the newClusterSparkEnvVars property: A set of optional, user-specified Spark environment variables key-value
     * pairs.
     *
     * @return the newClusterSparkEnvVars value.
     */
    public Map<String, Object> newClusterSparkEnvVars() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterSparkEnvVars();
    }

    /**
     * Set the newClusterSparkEnvVars property: A set of optional, user-specified Spark environment variables key-value
     * pairs.
     *
     * @param newClusterSparkEnvVars the newClusterSparkEnvVars value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterSparkEnvVars(Map<String, Object> newClusterSparkEnvVars) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterSparkEnvVars(newClusterSparkEnvVars);
        return this;
    }

    /**
     * Get the newClusterCustomTags property: Additional tags for cluster resources. This property is ignored in
     * instance pool configurations.
     *
     * @return the newClusterCustomTags value.
     */
    public Map<String, Object> newClusterCustomTags() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterCustomTags();
    }

    /**
     * Set the newClusterCustomTags property: Additional tags for cluster resources. This property is ignored in
     * instance pool configurations.
     *
     * @param newClusterCustomTags the newClusterCustomTags value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterCustomTags(Map<String, Object> newClusterCustomTags) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterCustomTags(newClusterCustomTags);
        return this;
    }

    /**
     * Get the newClusterLogDestination property: Specify a location to deliver Spark driver, worker, and event logs.
     * Type: string (or Expression with resultType string).
     *
     * @return the newClusterLogDestination value.
     */
    public Object newClusterLogDestination() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterLogDestination();
    }

    /**
     * Set the newClusterLogDestination property: Specify a location to deliver Spark driver, worker, and event logs.
     * Type: string (or Expression with resultType string).
     *
     * @param newClusterLogDestination the newClusterLogDestination value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterLogDestination(Object newClusterLogDestination) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterLogDestination(newClusterLogDestination);
        return this;
    }

    /**
     * Get the newClusterDriverNodeType property: The driver node type for the new job cluster. This property is ignored
     * in instance pool configurations. Type: string (or Expression with resultType string).
     *
     * @return the newClusterDriverNodeType value.
     */
    public Object newClusterDriverNodeType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterDriverNodeType();
    }

    /**
     * Set the newClusterDriverNodeType property: The driver node type for the new job cluster. This property is ignored
     * in instance pool configurations. Type: string (or Expression with resultType string).
     *
     * @param newClusterDriverNodeType the newClusterDriverNodeType value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterDriverNodeType(Object newClusterDriverNodeType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterDriverNodeType(newClusterDriverNodeType);
        return this;
    }

    /**
     * Get the newClusterInitScripts property: User-defined initialization scripts for the new cluster. Type: array of
     * strings (or Expression with resultType array of strings).
     *
     * @return the newClusterInitScripts value.
     */
    public Object newClusterInitScripts() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterInitScripts();
    }

    /**
     * Set the newClusterInitScripts property: User-defined initialization scripts for the new cluster. Type: array of
     * strings (or Expression with resultType array of strings).
     *
     * @param newClusterInitScripts the newClusterInitScripts value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterInitScripts(Object newClusterInitScripts) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterInitScripts(newClusterInitScripts);
        return this;
    }

    /**
     * Get the newClusterEnableElasticDisk property: Enable the elastic disk on the new cluster. This property is now
     * ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the newClusterEnableElasticDisk value.
     */
    public Object newClusterEnableElasticDisk() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().newClusterEnableElasticDisk();
    }

    /**
     * Set the newClusterEnableElasticDisk property: Enable the elastic disk on the new cluster. This property is now
     * ignored, and takes the default elastic disk behavior in Databricks (elastic disks are always enabled). Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param newClusterEnableElasticDisk the newClusterEnableElasticDisk value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withNewClusterEnableElasticDisk(Object newClusterEnableElasticDisk) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withNewClusterEnableElasticDisk(newClusterEnableElasticDisk);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the policyId property: The policy id for limiting the ability to configure clusters based on a user defined
     * set of rules. Type: string (or Expression with resultType string).
     *
     * @return the policyId value.
     */
    public Object policyId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().policyId();
    }

    /**
     * Set the policyId property: The policy id for limiting the ability to configure clusters based on a user defined
     * set of rules. Type: string (or Expression with resultType string).
     *
     * @param policyId the policyId value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withPolicyId(Object policyId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPolicyId(policyId);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     *
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     *
     * @param credential the credential value to set.
     * @return the AzureDatabricksLinkedService object itself.
     */
    public AzureDatabricksLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDatabricksLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model AzureDatabricksLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDatabricksLinkedService.class);
}
