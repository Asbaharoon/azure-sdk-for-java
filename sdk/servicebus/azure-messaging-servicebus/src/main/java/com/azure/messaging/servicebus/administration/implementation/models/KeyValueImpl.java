// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/** The KeyValue model. */
@JacksonXmlRootElement(
        localName = "KeyValueOfstringanyType",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Fluent
public final class KeyValueImpl {
    /*
     * The key property.
     */
    @JacksonXmlProperty(
            localName = "Key",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String key;

    /*
     * The value property.
     */
    @JacksonXmlProperty(
            localName = "Value",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String value;

    /**
     * Get the key property: The key property.
     *
     * @return the key value.
     */
    public String getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key property.
     *
     * @param key the key value to set.
     * @return the KeyValue object itself.
     */
    public KeyValueImpl setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the KeyValue object itself.
     */
    public KeyValueImpl setValue(String value) {
        this.value = value;
        return this;
    }
}
