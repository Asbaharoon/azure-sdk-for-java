// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dataprotection.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ClientDiscoveryResponse
 *
 * <p>Operations List response which contains list of available APIs.
 */
@Fluent
public final class ClientDiscoveryResponse {
    /*
     * Link to the next chunk of Response.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * List of available operations.
     */
    @JsonProperty(value = "value")
    private List<ClientDiscoveryValueForSingleApiInner> value;

    /** Creates an instance of ClientDiscoveryResponse class. */
    public ClientDiscoveryResponse() {
    }

    /**
     * Get the nextLink property: Link to the next chunk of Response.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next chunk of Response.
     *
     * @param nextLink the nextLink value to set.
     * @return the ClientDiscoveryResponse object itself.
     */
    public ClientDiscoveryResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: List of available operations.
     *
     * @return the value value.
     */
    public List<ClientDiscoveryValueForSingleApiInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of available operations.
     *
     * @param value the value value to set.
     * @return the ClientDiscoveryResponse object itself.
     */
    public ClientDiscoveryResponse withValue(List<ClientDiscoveryValueForSingleApiInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
