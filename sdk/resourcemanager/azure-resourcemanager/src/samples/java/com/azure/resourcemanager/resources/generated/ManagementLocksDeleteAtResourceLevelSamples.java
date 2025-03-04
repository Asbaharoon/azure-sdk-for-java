// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for ManagementLocks DeleteAtResourceLevel. */
public final class ManagementLocksDeleteAtResourceLevelSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2017-04-01/examples/ManagementLocks_DeleteAtResourceLevel.json
     */
    /**
     * Sample code: Delete management lock at resource level.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteManagementLockAtResourceLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .managementLockClient()
            .getManagementLocks()
            .deleteAtResourceLevelWithResponse(
                "resourcegroupname",
                "Microsoft.Storage",
                "parentResourcePath",
                "storageAccounts",
                "teststorageaccount",
                "testlock",
                Context.NONE);
    }
}
