// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.security.fluent.ApiCollectionOffboardingsClient;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ApiCollectionOffboardingsClient. */
public final class ApiCollectionOffboardingsClientImpl implements ApiCollectionOffboardingsClient {
    /** The proxy service used to perform REST calls. */
    private final ApiCollectionOffboardingsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of ApiCollectionOffboardingsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ApiCollectionOffboardingsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy
                .create(
                    ApiCollectionOffboardingsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterApiCollectionOffboardings to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterApiCol")
    public interface ApiCollectionOffboardingsService {
        @Headers({"Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/providers/Microsoft.Security/apiCollections/{apiCollectionId}")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> delete(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("apiCollectionId") String apiCollectionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Offboard an Azure API Management API from Defender for APIs
     *
     * <p>Offboard an Azure API Management API from Defender for APIs. The system will stop monitoring the operations
     * within the Azure API Management API for intrusive behaviors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String serviceName, String apiCollectionId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (apiCollectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter apiCollectionId is required and cannot be null."));
        }
        final String apiVersion = "2022-11-20-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serviceName,
                            apiCollectionId,
                            apiVersion,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Offboard an Azure API Management API from Defender for APIs
     *
     * <p>Offboard an Azure API Management API from Defender for APIs. The system will stop monitoring the operations
     * within the Azure API Management API for intrusive behaviors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Void>> deleteWithResponseAsync(
        String resourceGroupName, String serviceName, String apiCollectionId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (apiCollectionId == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter apiCollectionId is required and cannot be null."));
        }
        final String apiVersion = "2022-11-20-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .delete(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                serviceName,
                apiCollectionId,
                apiVersion,
                accept,
                context);
    }

    /**
     * Offboard an Azure API Management API from Defender for APIs
     *
     * <p>Offboard an Azure API Management API from Defender for APIs. The system will stop monitoring the operations
     * within the Azure API Management API for intrusive behaviors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> deleteAsync(String resourceGroupName, String serviceName, String apiCollectionId) {
        return deleteWithResponseAsync(resourceGroupName, serviceName, apiCollectionId)
            .flatMap(ignored -> Mono.empty());
    }

    /**
     * Offboard an Azure API Management API from Defender for APIs
     *
     * <p>Offboard an Azure API Management API from Defender for APIs. The system will stop monitoring the operations
     * within the Azure API Management API for intrusive behaviors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String apiCollectionId, Context context) {
        return deleteWithResponseAsync(resourceGroupName, serviceName, apiCollectionId, context).block();
    }

    /**
     * Offboard an Azure API Management API from Defender for APIs
     *
     * <p>Offboard an Azure API Management API from Defender for APIs. The system will stop monitoring the operations
     * within the Azure API Management API for intrusive behaviors.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param apiCollectionId A string representing the apiCollections resource within the Microsoft.Security provider
     *     namespace. This string matches the Azure API Management API name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String serviceName, String apiCollectionId) {
        deleteWithResponse(resourceGroupName, serviceName, apiCollectionId, Context.NONE);
    }
}
