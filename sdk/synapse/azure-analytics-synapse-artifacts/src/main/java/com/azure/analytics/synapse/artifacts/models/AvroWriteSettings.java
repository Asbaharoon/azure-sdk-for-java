// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Avro write settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AvroWriteSettings")
@Fluent
public final class AvroWriteSettings extends FormatWriteSettings {
    /*
     * Top level record name in write result, which is required in AVRO spec.
     */
    @JsonProperty(value = "recordName")
    private String recordName;

    /*
     * Record namespace in the write result.
     */
    @JsonProperty(value = "recordNamespace")
    private String recordNamespace;

    /*
     * Limit the written file's row count to be smaller than or equal to the specified count. Type: integer (or
     * Expression with resultType integer).
     */
    @JsonProperty(value = "maxRowsPerFile")
    private Object maxRowsPerFile;

    /*
     * Specifies the file name pattern <fileNamePrefix>_<fileIndex>.<fileExtension> when copy from non-file based store
     * without partitionOptions. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileNamePrefix")
    private Object fileNamePrefix;

    /** Creates an instance of AvroWriteSettings class. */
    public AvroWriteSettings() {}

    /**
     * Get the recordName property: Top level record name in write result, which is required in AVRO spec.
     *
     * @return the recordName value.
     */
    public String getRecordName() {
        return this.recordName;
    }

    /**
     * Set the recordName property: Top level record name in write result, which is required in AVRO spec.
     *
     * @param recordName the recordName value to set.
     * @return the AvroWriteSettings object itself.
     */
    public AvroWriteSettings setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }

    /**
     * Get the recordNamespace property: Record namespace in the write result.
     *
     * @return the recordNamespace value.
     */
    public String getRecordNamespace() {
        return this.recordNamespace;
    }

    /**
     * Set the recordNamespace property: Record namespace in the write result.
     *
     * @param recordNamespace the recordNamespace value to set.
     * @return the AvroWriteSettings object itself.
     */
    public AvroWriteSettings setRecordNamespace(String recordNamespace) {
        this.recordNamespace = recordNamespace;
        return this;
    }

    /**
     * Get the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     *
     * @return the maxRowsPerFile value.
     */
    public Object getMaxRowsPerFile() {
        return this.maxRowsPerFile;
    }

    /**
     * Set the maxRowsPerFile property: Limit the written file's row count to be smaller than or equal to the specified
     * count. Type: integer (or Expression with resultType integer).
     *
     * @param maxRowsPerFile the maxRowsPerFile value to set.
     * @return the AvroWriteSettings object itself.
     */
    public AvroWriteSettings setMaxRowsPerFile(Object maxRowsPerFile) {
        this.maxRowsPerFile = maxRowsPerFile;
        return this;
    }

    /**
     * Get the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     *
     * @return the fileNamePrefix value.
     */
    public Object getFileNamePrefix() {
        return this.fileNamePrefix;
    }

    /**
     * Set the fileNamePrefix property: Specifies the file name pattern
     * &lt;fileNamePrefix&gt;_&lt;fileIndex&gt;.&lt;fileExtension&gt; when copy from non-file based store without
     * partitionOptions. Type: string (or Expression with resultType string).
     *
     * @param fileNamePrefix the fileNamePrefix value to set.
     * @return the AvroWriteSettings object itself.
     */
    public AvroWriteSettings setFileNamePrefix(Object fileNamePrefix) {
        this.fileNamePrefix = fileNamePrefix;
        return this;
    }
}
