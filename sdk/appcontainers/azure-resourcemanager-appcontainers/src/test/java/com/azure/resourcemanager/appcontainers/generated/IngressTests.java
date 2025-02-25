// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.Action;
import com.azure.resourcemanager.appcontainers.models.BindingType;
import com.azure.resourcemanager.appcontainers.models.CustomDomain;
import com.azure.resourcemanager.appcontainers.models.Ingress;
import com.azure.resourcemanager.appcontainers.models.IngressTransportMethod;
import com.azure.resourcemanager.appcontainers.models.IpSecurityRestrictionRule;
import com.azure.resourcemanager.appcontainers.models.TrafficWeight;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IngressTests {
    @Test
    public void testDeserialize() {
        Ingress model =
            BinaryData
                .fromString(
                    "{\"fqdn\":\"rqhakauha\",\"external\":true,\"targetPort\":706986266,\"exposedPort\":949379958,\"transport\":\"http\",\"traffic\":[{\"revisionName\":\"cugicjoox\",\"weight\":554056666,\"latestRevision\":true,\"label\":\"ucww\"}],\"customDomains\":[{\"name\":\"vbvmeu\",\"bindingType\":\"SniEnabled\",\"certificateId\":\"vyhzceuojgjrwj\"},{\"name\":\"eiotwmcdytdx\",\"bindingType\":\"Disabled\",\"certificateId\":\"xnrj\"},{\"name\":\"wgqwgxhn\",\"bindingType\":\"SniEnabled\",\"certificateId\":\"x\"}],\"allowInsecure\":true,\"ipSecurityRestrictions\":[{\"name\":\"cg\",\"description\":\"wndnhj\",\"ipAddressRange\":\"auwhvylwzbtdhx\",\"action\":\"Allow\"}]}")
                .toObject(Ingress.class);
        Assertions.assertEquals(true, model.external());
        Assertions.assertEquals(706986266, model.targetPort());
        Assertions.assertEquals(949379958, model.exposedPort());
        Assertions.assertEquals(IngressTransportMethod.HTTP, model.transport());
        Assertions.assertEquals("cugicjoox", model.traffic().get(0).revisionName());
        Assertions.assertEquals(554056666, model.traffic().get(0).weight());
        Assertions.assertEquals(true, model.traffic().get(0).latestRevision());
        Assertions.assertEquals("ucww", model.traffic().get(0).label());
        Assertions.assertEquals("vbvmeu", model.customDomains().get(0).name());
        Assertions.assertEquals(BindingType.SNI_ENABLED, model.customDomains().get(0).bindingType());
        Assertions.assertEquals("vyhzceuojgjrwj", model.customDomains().get(0).certificateId());
        Assertions.assertEquals(true, model.allowInsecure());
        Assertions.assertEquals("cg", model.ipSecurityRestrictions().get(0).name());
        Assertions.assertEquals("wndnhj", model.ipSecurityRestrictions().get(0).description());
        Assertions.assertEquals("auwhvylwzbtdhx", model.ipSecurityRestrictions().get(0).ipAddressRange());
        Assertions.assertEquals(Action.ALLOW, model.ipSecurityRestrictions().get(0).action());
    }

    @Test
    public void testSerialize() {
        Ingress model =
            new Ingress()
                .withExternal(true)
                .withTargetPort(706986266)
                .withExposedPort(949379958)
                .withTransport(IngressTransportMethod.HTTP)
                .withTraffic(
                    Arrays
                        .asList(
                            new TrafficWeight()
                                .withRevisionName("cugicjoox")
                                .withWeight(554056666)
                                .withLatestRevision(true)
                                .withLabel("ucww")))
                .withCustomDomains(
                    Arrays
                        .asList(
                            new CustomDomain()
                                .withName("vbvmeu")
                                .withBindingType(BindingType.SNI_ENABLED)
                                .withCertificateId("vyhzceuojgjrwj"),
                            new CustomDomain()
                                .withName("eiotwmcdytdx")
                                .withBindingType(BindingType.DISABLED)
                                .withCertificateId("xnrj"),
                            new CustomDomain()
                                .withName("wgqwgxhn")
                                .withBindingType(BindingType.SNI_ENABLED)
                                .withCertificateId("x")))
                .withAllowInsecure(true)
                .withIpSecurityRestrictions(
                    Arrays
                        .asList(
                            new IpSecurityRestrictionRule()
                                .withName("cg")
                                .withDescription("wndnhj")
                                .withIpAddressRange("auwhvylwzbtdhx")
                                .withAction(Action.ALLOW)));
        model = BinaryData.fromObject(model).toObject(Ingress.class);
        Assertions.assertEquals(true, model.external());
        Assertions.assertEquals(706986266, model.targetPort());
        Assertions.assertEquals(949379958, model.exposedPort());
        Assertions.assertEquals(IngressTransportMethod.HTTP, model.transport());
        Assertions.assertEquals("cugicjoox", model.traffic().get(0).revisionName());
        Assertions.assertEquals(554056666, model.traffic().get(0).weight());
        Assertions.assertEquals(true, model.traffic().get(0).latestRevision());
        Assertions.assertEquals("ucww", model.traffic().get(0).label());
        Assertions.assertEquals("vbvmeu", model.customDomains().get(0).name());
        Assertions.assertEquals(BindingType.SNI_ENABLED, model.customDomains().get(0).bindingType());
        Assertions.assertEquals("vyhzceuojgjrwj", model.customDomains().get(0).certificateId());
        Assertions.assertEquals(true, model.allowInsecure());
        Assertions.assertEquals("cg", model.ipSecurityRestrictions().get(0).name());
        Assertions.assertEquals("wndnhj", model.ipSecurityRestrictions().get(0).description());
        Assertions.assertEquals("auwhvylwzbtdhx", model.ipSecurityRestrictions().get(0).ipAddressRange());
        Assertions.assertEquals(Action.ALLOW, model.ipSecurityRestrictions().get(0).action());
    }
}
