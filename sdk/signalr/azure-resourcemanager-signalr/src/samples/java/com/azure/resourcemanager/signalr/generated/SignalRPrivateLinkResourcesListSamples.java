// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

import com.azure.core.util.Context;

/** Samples for SignalRPrivateLinkResources List. */
public final class SignalRPrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2022-08-01-preview/examples/SignalRPrivateLinkResources_List.json
     */
    /**
     * Sample code: SignalRPrivateLinkResources_List.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRPrivateLinkResourcesList(com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager.signalRPrivateLinkResources().list("myResourceGroup", "mySignalRService", Context.NONE);
    }
}
