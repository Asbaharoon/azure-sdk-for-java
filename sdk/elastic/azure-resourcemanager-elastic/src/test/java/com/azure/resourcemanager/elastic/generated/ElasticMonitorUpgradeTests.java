// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.ElasticMonitorUpgrade;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ElasticMonitorUpgradeTests {
    @Test
    public void testDeserialize() {
        ElasticMonitorUpgrade model =
            BinaryData.fromString("{\"version\":\"y\"}").toObject(ElasticMonitorUpgrade.class);
        Assertions.assertEquals("y", model.version());
    }

    @Test
    public void testSerialize() {
        ElasticMonitorUpgrade model = new ElasticMonitorUpgrade().withVersion("y");
        model = BinaryData.fromObject(model).toObject(ElasticMonitorUpgrade.class);
        Assertions.assertEquals("y", model.version());
    }
}
