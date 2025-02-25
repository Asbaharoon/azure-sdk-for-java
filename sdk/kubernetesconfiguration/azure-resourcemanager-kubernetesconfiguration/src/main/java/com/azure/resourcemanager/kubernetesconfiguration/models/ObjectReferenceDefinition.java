// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object reference to a Kubernetes object on a cluster. */
@Fluent
public final class ObjectReferenceDefinition {
    /*
     * Name of the object
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Namespace of the object
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * Get the name property: Name of the object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the object.
     *
     * @param name the name value to set.
     * @return the ObjectReferenceDefinition object itself.
     */
    public ObjectReferenceDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace property: Namespace of the object.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: Namespace of the object.
     *
     * @param namespace the namespace value to set.
     * @return the ObjectReferenceDefinition object itself.
     */
    public ObjectReferenceDefinition withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
