// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dns.models.RecordType;

/** Samples for RecordSets ListByType. */
public final class RecordSetsListByTypeSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListAAAARecordset.json
     */
    /**
     * Sample code: List AAAA recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAAAARecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.AAAA, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListSRVRecordset.json
     */
    /**
     * Sample code: List SRV recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSRVRecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.SRV, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListPTRRecordset.json
     */
    /**
     * Sample code: List PTR recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listPTRRecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "0.0.127.in-addr.arpa", RecordType.PTR, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListMXRecordset.json
     */
    /**
     * Sample code: List MX recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listMXRecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.MX, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListNSRecordset.json
     */
    /**
     * Sample code: List NS recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listNSRecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.NS, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListCNAMERecordset.json
     */
    /**
     * Sample code: List CNAME recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCNAMERecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.CNAME, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListARecordset.json
     */
    /**
     * Sample code: List A recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listARecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.A, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListSOARecordset.json
     */
    /**
     * Sample code: List SOA recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSOARecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.SOA, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListCaaRecordset.json
     */
    /**
     * Sample code: List CAA recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listCAARecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.CAA, null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/ListTXTRecordset.json
     */
    /**
     * Sample code: List TXT recordsets.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listTXTRecordsets(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .listByType("rg1", "zone1", RecordType.TXT, null, null, Context.NONE);
    }
}
