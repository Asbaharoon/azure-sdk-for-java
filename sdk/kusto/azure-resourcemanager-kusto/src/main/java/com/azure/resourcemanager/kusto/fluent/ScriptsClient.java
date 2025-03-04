// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.fluent.models.ScriptInner;
import com.azure.resourcemanager.kusto.models.ScriptCheckNameRequest;

/** An instance of this class provides access to all the operations defined in ScriptsClient. */
public interface ScriptsClient {
    /**
     * Returns the list of database scripts for given database.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database script operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScriptInner> listByDatabase(String resourceGroupName, String clusterName, String databaseName);

    /**
     * Returns the list of database scripts for given database.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto database script operation response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScriptInner> listByDatabase(
        String resourceGroupName, String clusterName, String databaseName, Context context);

    /**
     * Gets a Kusto cluster database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto cluster database script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScriptInner get(String resourceGroupName, String clusterName, String databaseName, String scriptName);

    /**
     * Gets a Kusto cluster database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kusto cluster database script along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScriptInner> getWithResponse(
        String resourceGroupName, String clusterName, String databaseName, String scriptName, Context context);

    /**
     * Creates a Kusto database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains the KQL to run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScriptInner>, ScriptInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, String databaseName, String scriptName, ScriptInner parameters);

    /**
     * Creates a Kusto database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains the KQL to run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScriptInner>, ScriptInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String scriptName,
        ScriptInner parameters,
        Context context);

    /**
     * Creates a Kusto database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains the KQL to run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScriptInner createOrUpdate(
        String resourceGroupName, String clusterName, String databaseName, String scriptName, ScriptInner parameters);

    /**
     * Creates a Kusto database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains the KQL to run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScriptInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String scriptName,
        ScriptInner parameters,
        Context context);

    /**
     * Updates a database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains to the KQL to run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScriptInner>, ScriptInner> beginUpdate(
        String resourceGroupName, String clusterName, String databaseName, String scriptName, ScriptInner parameters);

    /**
     * Updates a database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains to the KQL to run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ScriptInner>, ScriptInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String scriptName,
        ScriptInner parameters,
        Context context);

    /**
     * Updates a database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains to the KQL to run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScriptInner update(
        String resourceGroupName, String clusterName, String databaseName, String scriptName, ScriptInner parameters);

    /**
     * Updates a database script.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param parameters The Kusto Script parameters contains to the KQL to run.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a database script.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScriptInner update(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        String scriptName,
        ScriptInner parameters,
        Context context);

    /**
     * Deletes a Kusto principalAssignment.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String databaseName, String scriptName);

    /**
     * Deletes a Kusto principalAssignment.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String databaseName, String scriptName, Context context);

    /**
     * Deletes a Kusto principalAssignment.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String databaseName, String scriptName);

    /**
     * Deletes a Kusto principalAssignment.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the Kusto database script.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String databaseName, String scriptName, Context context);

    /**
     * Checks that the script name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the script.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameResultInner checkNameAvailability(
        String resourceGroupName, String clusterName, String databaseName, ScriptCheckNameRequest scriptName);

    /**
     * Checks that the script name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param scriptName The name of the script.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameResultInner> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        ScriptCheckNameRequest scriptName,
        Context context);
}
