// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * encryptionType
 *
 * <p>Encryption type of the capacity pool, set encryption type for data at rest for this pool and all volumes in it.
 * This value can only be set when creating new pool.
 */
public final class EncryptionType extends ExpandableStringEnum<EncryptionType> {
    /** Static value Single for EncryptionType. */
    public static final EncryptionType SINGLE = fromString("Single");

    /** Static value Double for EncryptionType. */
    public static final EncryptionType DOUBLE = fromString("Double");

    /**
     * Creates or finds a EncryptionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EncryptionType.
     */
    @JsonCreator
    public static EncryptionType fromString(String name) {
        return fromString(name, EncryptionType.class);
    }

    /**
     * Gets known EncryptionType values.
     *
     * @return known EncryptionType values.
     */
    public static Collection<EncryptionType> values() {
        return values(EncryptionType.class);
    }
}
