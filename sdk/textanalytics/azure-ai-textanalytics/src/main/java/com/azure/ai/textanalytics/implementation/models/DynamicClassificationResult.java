// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DynamicClassificationResult model. */
@Fluent
public final class DynamicClassificationResult extends PreBuiltResult {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<DynamicClassificationResultDocumentsItem> documents;

    /** Creates an instance of DynamicClassificationResult class. */
    public DynamicClassificationResult() {}

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<DynamicClassificationResultDocumentsItem> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the DynamicClassificationResult object itself.
     */
    public DynamicClassificationResult setDocuments(List<DynamicClassificationResultDocumentsItem> documents) {
        this.documents = documents;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicClassificationResult setErrors(List<InputError> errors) {
        super.setErrors(errors);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicClassificationResult setStatistics(RequestStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicClassificationResult setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }
}
