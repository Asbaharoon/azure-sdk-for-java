// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.PrivateEndpoint;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointTests {
    @Test
    public void testDeserialize() {
        PrivateEndpoint model = BinaryData.fromString("{\"id\":\"fxxypininmayhuy\"}").toObject(PrivateEndpoint.class);
    }

    @Test
    public void testSerialize() {
        PrivateEndpoint model = new PrivateEndpoint();
        model = BinaryData.fromObject(model).toObject(PrivateEndpoint.class);
    }
}
