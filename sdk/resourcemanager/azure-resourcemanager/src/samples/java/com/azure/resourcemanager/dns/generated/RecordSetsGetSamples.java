// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dns.models.RecordType;

/** Samples for RecordSets Get. */
public final class RecordSetsGetSamples {
    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetNSRecordset.json
     */
    /**
     * Sample code: Get NS recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getNSRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.NS, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetAAAARecordset.json
     */
    /**
     * Sample code: Get AAAA recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAAAARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.AAAA, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetSRVRecordset.json
     */
    /**
     * Sample code: Get SRV recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSRVRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.SRV, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetCaaRecordset.json
     */
    /**
     * Sample code: Get CAA recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getCAARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.CAA, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetCNAMERecordset.json
     */
    /**
     * Sample code: Get CNAME recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getCNAMERecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.CNAME, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetPTRRecordset.json
     */
    /**
     * Sample code: Get PTR recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPTRRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "0.0.127.in-addr.arpa", "1", RecordType.PTR, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetTXTRecordset.json
     */
    /**
     * Sample code: Get TXT recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getTXTRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.TXT, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetARecordset.json
     */
    /**
     * Sample code: Get A recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.A, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetMXRecordset.json
     */
    /**
     * Sample code: Get MX recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getMXRecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "record1", RecordType.MX, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/dns/resource-manager/Microsoft.Network/stable/2018-05-01/examples/GetSOARecordset.json
     */
    /**
     * Sample code: Get SOA recordset.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getSOARecordset(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .dnsZones()
            .manager()
            .serviceClient()
            .getRecordSets()
            .getWithResponse("rg1", "zone1", "@", RecordType.SOA, Context.NONE);
    }
}
