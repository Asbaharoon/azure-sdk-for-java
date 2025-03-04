// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.storagemover.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Project resource. */
@Fluent
public final class ProjectInner extends ProxyResource {
    /*
     * Project properties.
     */
    @JsonProperty(value = "properties")
    private ProjectProperties innerProperties;

    /*
     * Resource system metadata.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of ProjectInner class. */
    public ProjectInner() {
    }

    /**
     * Get the innerProperties property: Project properties.
     *
     * @return the innerProperties value.
     */
    private ProjectProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Resource system metadata.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the description property: A description for the Project.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description for the Project.
     *
     * @param description the description value to set.
     * @return the ProjectInner object itself.
     */
    public ProjectInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProjectProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of this resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
