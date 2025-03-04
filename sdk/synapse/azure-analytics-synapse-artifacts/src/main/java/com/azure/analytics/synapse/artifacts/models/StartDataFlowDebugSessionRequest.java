// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Request body structure for starting data flow debug session. */
@Fluent
public final class StartDataFlowDebugSessionRequest {
    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * Data flow instance.
     */
    @JsonProperty(value = "dataFlow")
    private DataFlowResource dataFlow;

    /*
     * List of Data flows
     */
    @JsonProperty(value = "dataFlows")
    private List<DataFlowResource> dataFlows;

    /*
     * List of datasets.
     */
    @JsonProperty(value = "datasets")
    private List<DatasetResource> datasets;

    /*
     * List of linked services.
     */
    @JsonProperty(value = "linkedServices")
    private List<LinkedServiceResource> linkedServices;

    /*
     * Staging info for debug session.
     */
    @JsonProperty(value = "staging")
    private Object staging;

    /*
     * Data flow debug settings.
     */
    @JsonProperty(value = "debugSettings")
    private Object debugSettings;

    /*
     * The type of new Databricks cluster.
     */
    @JsonProperty(value = "incrementalDebug")
    private Boolean incrementalDebug;

    /** Creates an instance of StartDataFlowDebugSessionRequest class. */
    public StartDataFlowDebugSessionRequest() {}

    /**
     * Get the sessionId property: The ID of data flow debug session.
     *
     * @return the sessionId value.
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * Set the sessionId property: The ID of data flow debug session.
     *
     * @param sessionId the sessionId value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the dataFlow property: Data flow instance.
     *
     * @return the dataFlow value.
     */
    public DataFlowResource getDataFlow() {
        return this.dataFlow;
    }

    /**
     * Set the dataFlow property: Data flow instance.
     *
     * @param dataFlow the dataFlow value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setDataFlow(DataFlowResource dataFlow) {
        this.dataFlow = dataFlow;
        return this;
    }

    /**
     * Get the dataFlows property: List of Data flows.
     *
     * @return the dataFlows value.
     */
    public List<DataFlowResource> getDataFlows() {
        return this.dataFlows;
    }

    /**
     * Set the dataFlows property: List of Data flows.
     *
     * @param dataFlows the dataFlows value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setDataFlows(List<DataFlowResource> dataFlows) {
        this.dataFlows = dataFlows;
        return this;
    }

    /**
     * Get the datasets property: List of datasets.
     *
     * @return the datasets value.
     */
    public List<DatasetResource> getDatasets() {
        return this.datasets;
    }

    /**
     * Set the datasets property: List of datasets.
     *
     * @param datasets the datasets value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setDatasets(List<DatasetResource> datasets) {
        this.datasets = datasets;
        return this;
    }

    /**
     * Get the linkedServices property: List of linked services.
     *
     * @return the linkedServices value.
     */
    public List<LinkedServiceResource> getLinkedServices() {
        return this.linkedServices;
    }

    /**
     * Set the linkedServices property: List of linked services.
     *
     * @param linkedServices the linkedServices value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setLinkedServices(List<LinkedServiceResource> linkedServices) {
        this.linkedServices = linkedServices;
        return this;
    }

    /**
     * Get the staging property: Staging info for debug session.
     *
     * @return the staging value.
     */
    public Object getStaging() {
        return this.staging;
    }

    /**
     * Set the staging property: Staging info for debug session.
     *
     * @param staging the staging value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setStaging(Object staging) {
        this.staging = staging;
        return this;
    }

    /**
     * Get the debugSettings property: Data flow debug settings.
     *
     * @return the debugSettings value.
     */
    public Object getDebugSettings() {
        return this.debugSettings;
    }

    /**
     * Set the debugSettings property: Data flow debug settings.
     *
     * @param debugSettings the debugSettings value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setDebugSettings(Object debugSettings) {
        this.debugSettings = debugSettings;
        return this;
    }

    /**
     * Get the incrementalDebug property: The type of new Databricks cluster.
     *
     * @return the incrementalDebug value.
     */
    public Boolean isIncrementalDebug() {
        return this.incrementalDebug;
    }

    /**
     * Set the incrementalDebug property: The type of new Databricks cluster.
     *
     * @param incrementalDebug the incrementalDebug value to set.
     * @return the StartDataFlowDebugSessionRequest object itself.
     */
    public StartDataFlowDebugSessionRequest setIncrementalDebug(Boolean incrementalDebug) {
        this.incrementalDebug = incrementalDebug;
        return this;
    }
}
