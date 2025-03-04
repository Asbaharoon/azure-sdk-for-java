// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.healthcareapis.fluent.OperationResultsClient;
import com.azure.resourcemanager.healthcareapis.fluent.models.OperationResultsDescriptionInner;
import com.azure.resourcemanager.healthcareapis.models.OperationResults;
import com.azure.resourcemanager.healthcareapis.models.OperationResultsDescription;

public final class OperationResultsImpl implements OperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(OperationResultsImpl.class);

    private final OperationResultsClient innerClient;

    private final com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager;

    public OperationResultsImpl(
        OperationResultsClient innerClient,
        com.azure.resourcemanager.healthcareapis.HealthcareApisManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationResultsDescription get(String locationName, String operationResultId) {
        OperationResultsDescriptionInner inner = this.serviceClient().get(locationName, operationResultId);
        if (inner != null) {
            return new OperationResultsDescriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationResultsDescription> getWithResponse(
        String locationName, String operationResultId, Context context) {
        Response<OperationResultsDescriptionInner> inner =
            this.serviceClient().getWithResponse(locationName, operationResultId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationResultsDescriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager() {
        return this.serviceManager;
    }
}
