// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Request body structure for deleting data flow debug session. */
@Fluent
public final class DeleteDataFlowDebugSessionRequest {
    /*
     * The ID of data flow debug session.
     */
    @JsonProperty(value = "sessionId")
    private String sessionId;

    /*
     * The data flow which contains the debug session.
     */
    @JsonProperty(value = "dataFlowName")
    private String dataFlowName;

    /** Creates an instance of DeleteDataFlowDebugSessionRequest class. */
    public DeleteDataFlowDebugSessionRequest() {}

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
     * @return the DeleteDataFlowDebugSessionRequest object itself.
     */
    public DeleteDataFlowDebugSessionRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * Get the dataFlowName property: The data flow which contains the debug session.
     *
     * @return the dataFlowName value.
     */
    public String getDataFlowName() {
        return this.dataFlowName;
    }

    /**
     * Set the dataFlowName property: The data flow which contains the debug session.
     *
     * @param dataFlowName the dataFlowName value to set.
     * @return the DeleteDataFlowDebugSessionRequest object itself.
     */
    public DeleteDataFlowDebugSessionRequest setDataFlowName(String dataFlowName) {
        this.dataFlowName = dataFlowName;
        return this;
    }
}
