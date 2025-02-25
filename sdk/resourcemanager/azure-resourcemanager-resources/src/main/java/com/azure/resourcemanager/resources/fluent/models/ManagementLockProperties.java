// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.models.LockLevel;
import com.azure.resourcemanager.resources.models.ManagementLockOwner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The lock properties. */
@Fluent
public final class ManagementLockProperties {
    /*
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete,
     * ReadOnly. CanNotDelete means authorized users are able to read and
     * modify the resources, but not delete. ReadOnly means authorized users
     * can only read from a resource, but they can't modify or delete it.
     */
    @JsonProperty(value = "level", required = true)
    private LockLevel level;

    /*
     * Notes about the lock. Maximum of 512 characters.
     */
    @JsonProperty(value = "notes")
    private String notes;

    /*
     * The owners of the lock.
     */
    @JsonProperty(value = "owners")
    private List<ManagementLockOwner> owners;

    /**
     * Get the level property: The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly.
     * CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means
     * authorized users can only read from a resource, but they can't modify or delete it.
     *
     * @return the level value.
     */
    public LockLevel level() {
        return this.level;
    }

    /**
     * Set the level property: The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly.
     * CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means
     * authorized users can only read from a resource, but they can't modify or delete it.
     *
     * @param level the level value to set.
     * @return the ManagementLockProperties object itself.
     */
    public ManagementLockProperties withLevel(LockLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the notes property: Notes about the lock. Maximum of 512 characters.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: Notes about the lock. Maximum of 512 characters.
     *
     * @param notes the notes value to set.
     * @return the ManagementLockProperties object itself.
     */
    public ManagementLockProperties withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the owners property: The owners of the lock.
     *
     * @return the owners value.
     */
    public List<ManagementLockOwner> owners() {
        return this.owners;
    }

    /**
     * Set the owners property: The owners of the lock.
     *
     * @param owners the owners value to set.
     * @return the ManagementLockProperties object itself.
     */
    public ManagementLockProperties withOwners(List<ManagementLockOwner> owners) {
        this.owners = owners;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (level() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property level in model ManagementLockProperties"));
        }
        if (owners() != null) {
            owners().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagementLockProperties.class);
}
