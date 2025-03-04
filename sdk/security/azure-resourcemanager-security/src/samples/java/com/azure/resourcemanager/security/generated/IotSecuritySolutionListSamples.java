// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for IotSecuritySolution List. */
public final class IotSecuritySolutionListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2019-08-01/examples/IoTSecuritySolutions/GetIoTSecuritySolutionsList.json
     */
    /**
     * Sample code: List IoT Security solutions by subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listIoTSecuritySolutionsBySubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.iotSecuritySolutions().list(null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2019-08-01/examples/IoTSecuritySolutions/GetIoTSecuritySolutionsListByIotHub.json
     */
    /**
     * Sample code: List IoT Security solutions by IoT Hub.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listIoTSecuritySolutionsByIoTHub(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .iotSecuritySolutions()
            .list(
                "properties.iotHubs/any(i eq"
                    + " \"/subscriptions/075423e9-7d33-4166-8bdf-3920b04e3735/resourceGroups/myRg/providers/Microsoft.Devices/IotHubs/FirstIotHub\")",
                Context.NONE);
    }
}
