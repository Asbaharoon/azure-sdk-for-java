// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for ActionGroups List. */
public final class ActionGroupsListSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2022-06-01/examples/listActionGroups.json
     */
    /**
     * Sample code: List action groups at subscription level.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listActionGroupsAtSubscriptionLevel(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getActionGroups().list(Context.NONE);
    }
}
