// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.fluent.models.TaskRunInner;
import com.azure.resourcemanager.containerregistry.models.Architecture;
import com.azure.resourcemanager.containerregistry.models.Credentials;
import com.azure.resourcemanager.containerregistry.models.EncodedTaskRunRequest;
import com.azure.resourcemanager.containerregistry.models.OS;
import com.azure.resourcemanager.containerregistry.models.PlatformProperties;
import java.util.Arrays;

/** Samples for TaskRuns Create. */
public final class TaskRunsCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2019-06-01-preview/examples/TaskRunsCreate.json
     */
    /**
     * Sample code: TaskRuns_Create.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void taskRunsCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getTaskRuns()
            .create(
                "myResourceGroup",
                "myRegistry",
                "myRun",
                new TaskRunInner()
                    .withRunRequest(
                        new EncodedTaskRunRequest()
                            .withEncodedTaskContent("fakeTokenPlaceholder")
                            .withEncodedValuesContent("fakeTokenPlaceholder")
                            .withValues(Arrays.asList())
                            .withPlatform(
                                new PlatformProperties().withOs(OS.LINUX).withArchitecture(Architecture.AMD64))
                            .withCredentials(new Credentials()))
                    .withForceUpdateTag("test"),
                com.azure.core.util.Context.NONE);
    }
}
