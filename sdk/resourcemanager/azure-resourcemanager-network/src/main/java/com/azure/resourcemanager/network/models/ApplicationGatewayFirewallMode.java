// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Web application firewall mode. */
public final class ApplicationGatewayFirewallMode extends ExpandableStringEnum<ApplicationGatewayFirewallMode> {
    /** Static value Detection for ApplicationGatewayFirewallMode. */
    public static final ApplicationGatewayFirewallMode DETECTION = fromString("Detection");

    /** Static value Prevention for ApplicationGatewayFirewallMode. */
    public static final ApplicationGatewayFirewallMode PREVENTION = fromString("Prevention");

    /**
     * Creates or finds a ApplicationGatewayFirewallMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayFirewallMode.
     */
    @JsonCreator
    public static ApplicationGatewayFirewallMode fromString(String name) {
        return fromString(name, ApplicationGatewayFirewallMode.class);
    }

    /**
     * Gets known ApplicationGatewayFirewallMode values.
     *
     * @return known ApplicationGatewayFirewallMode values.
     */
    public static Collection<ApplicationGatewayFirewallMode> values() {
        return values(ApplicationGatewayFirewallMode.class);
    }
}
