// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** DatabricksSparkPython activity. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DatabricksSparkPython")
@JsonFlatten
@Fluent
public class DatabricksSparkPythonActivity extends ExecutionActivity {
    /*
     * The URI of the Python file to be executed. DBFS paths are supported. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.pythonFile", required = true)
    private Object pythonFile;

    /*
     * Command line parameters that will be passed to the Python file.
     */
    @JsonProperty(value = "typeProperties.parameters")
    private List<Object> parameters;

    /*
     * A list of libraries to be installed on the cluster that will execute the job.
     */
    @JsonProperty(value = "typeProperties.libraries")
    private List<Map<String, Object>> libraries;

    /** Creates an instance of DatabricksSparkPythonActivity class. */
    public DatabricksSparkPythonActivity() {}

    /**
     * Get the pythonFile property: The URI of the Python file to be executed. DBFS paths are supported. Type: string
     * (or Expression with resultType string).
     *
     * @return the pythonFile value.
     */
    public Object getPythonFile() {
        return this.pythonFile;
    }

    /**
     * Set the pythonFile property: The URI of the Python file to be executed. DBFS paths are supported. Type: string
     * (or Expression with resultType string).
     *
     * @param pythonFile the pythonFile value to set.
     * @return the DatabricksSparkPythonActivity object itself.
     */
    public DatabricksSparkPythonActivity setPythonFile(Object pythonFile) {
        this.pythonFile = pythonFile;
        return this;
    }

    /**
     * Get the parameters property: Command line parameters that will be passed to the Python file.
     *
     * @return the parameters value.
     */
    public List<Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Command line parameters that will be passed to the Python file.
     *
     * @param parameters the parameters value to set.
     * @return the DatabricksSparkPythonActivity object itself.
     */
    public DatabricksSparkPythonActivity setParameters(List<Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @return the libraries value.
     */
    public List<Map<String, Object>> getLibraries() {
        return this.libraries;
    }

    /**
     * Set the libraries property: A list of libraries to be installed on the cluster that will execute the job.
     *
     * @param libraries the libraries value to set.
     * @return the DatabricksSparkPythonActivity object itself.
     */
    public DatabricksSparkPythonActivity setLibraries(List<Map<String, Object>> libraries) {
        this.libraries = libraries;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity setPolicy(ActivityPolicy policy) {
        super.setPolicy(policy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity setDependsOn(List<ActivityDependency> dependsOn) {
        super.setDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatabricksSparkPythonActivity setUserProperties(List<UserProperty> userProperties) {
        super.setUserProperties(userProperties);
        return this;
    }
}
