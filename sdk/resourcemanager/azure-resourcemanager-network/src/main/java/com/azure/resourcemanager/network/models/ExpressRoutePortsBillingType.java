// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The billing type of the ExpressRoutePort resource. */
public final class ExpressRoutePortsBillingType extends ExpandableStringEnum<ExpressRoutePortsBillingType> {
    /** Static value MeteredData for ExpressRoutePortsBillingType. */
    public static final ExpressRoutePortsBillingType METERED_DATA = fromString("MeteredData");

    /** Static value UnlimitedData for ExpressRoutePortsBillingType. */
    public static final ExpressRoutePortsBillingType UNLIMITED_DATA = fromString("UnlimitedData");

    /**
     * Creates or finds a ExpressRoutePortsBillingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressRoutePortsBillingType.
     */
    @JsonCreator
    public static ExpressRoutePortsBillingType fromString(String name) {
        return fromString(name, ExpressRoutePortsBillingType.class);
    }

    /**
     * Gets known ExpressRoutePortsBillingType values.
     *
     * @return known ExpressRoutePortsBillingType values.
     */
    public static Collection<ExpressRoutePortsBillingType> values() {
        return values(ExpressRoutePortsBillingType.class);
    }
}
