// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** An object representing the task definition for an Abstractive Summarization task. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AbstractiveSummarization")
@Fluent
public final class AbstractiveSummarizationLROTask extends AnalyzeTextLROTask {
    /*
     * Supported parameters for the pre-build Abstractive Summarization task.
     */
    @JsonProperty(value = "parameters", required = true)
    private AbstractiveSummarizationTaskParameters parameters;

    /** Creates an instance of AbstractiveSummarizationLROTask class. */
    public AbstractiveSummarizationLROTask() {}

    /**
     * Get the parameters property: Supported parameters for the pre-build Abstractive Summarization task.
     *
     * @return the parameters value.
     */
    public AbstractiveSummarizationTaskParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Supported parameters for the pre-build Abstractive Summarization task.
     *
     * @param parameters the parameters value to set.
     * @return the AbstractiveSummarizationLROTask object itself.
     */
    public AbstractiveSummarizationLROTask setParameters(AbstractiveSummarizationTaskParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AbstractiveSummarizationLROTask setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }
}
