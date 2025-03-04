// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.AadProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AadProfileTests {
    @Test
    public void testDeserialize() {
        AadProfile model =
            BinaryData
                .fromString(
                    "{\"adminGroupObjectIDs\":[\"ahmgkbrp\",\"y\",\"hibnuqqkpika\",\"rgvtqag\"],\"clientAppID\":\"uynhijg\",\"enableAzureRbac\":false,\"managed\":true,\"serverAppID\":\"iarbutrcvpna\",\"tenantID\":\"mhjrunmpxttdbhr\",\"serverAppSecret\":\"l\"}")
                .toObject(AadProfile.class);
        Assertions.assertEquals("l", model.serverAppSecret());
        Assertions.assertEquals("ahmgkbrp", model.adminGroupObjectIDs().get(0));
        Assertions.assertEquals("uynhijg", model.clientAppId());
        Assertions.assertEquals(false, model.enableAzureRbac());
        Assertions.assertEquals(true, model.managed());
        Assertions.assertEquals("iarbutrcvpna", model.serverAppId());
        Assertions.assertEquals("mhjrunmpxttdbhr", model.tenantId());
    }

    @Test
    public void testSerialize() {
        AadProfile model =
            new AadProfile()
                .withServerAppSecret("l")
                .withAdminGroupObjectIDs(Arrays.asList("ahmgkbrp", "y", "hibnuqqkpika", "rgvtqag"))
                .withClientAppId("uynhijg")
                .withEnableAzureRbac(false)
                .withManaged(true)
                .withServerAppId("iarbutrcvpna")
                .withTenantId("mhjrunmpxttdbhr");
        model = BinaryData.fromObject(model).toObject(AadProfile.class);
        Assertions.assertEquals("l", model.serverAppSecret());
        Assertions.assertEquals("ahmgkbrp", model.adminGroupObjectIDs().get(0));
        Assertions.assertEquals("uynhijg", model.clientAppId());
        Assertions.assertEquals(false, model.enableAzureRbac());
        Assertions.assertEquals(true, model.managed());
        Assertions.assertEquals("iarbutrcvpna", model.serverAppId());
        Assertions.assertEquals("mhjrunmpxttdbhr", model.tenantId());
    }
}
