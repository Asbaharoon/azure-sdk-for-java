// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The AnalyzeTextJobState model. */
@Fluent
public final class AnalyzeTextJobState extends JobState {
    /*
     * The tasks property.
     */
    @JsonProperty(value = "tasks", required = true)
    private TasksStateTasks tasks;

    /*
     * if showStats=true was specified in the request this field will contain information about the request payload.
     */
    @JsonProperty(value = "statistics")
    private RequestStatistics statistics;

    /** Creates an instance of AnalyzeTextJobState class. */
    public AnalyzeTextJobState() {}

    /**
     * Get the tasks property: The tasks property.
     *
     * @return the tasks value.
     */
    public TasksStateTasks getTasks() {
        return this.tasks;
    }

    /**
     * Set the tasks property: The tasks property.
     *
     * @param tasks the tasks value to set.
     * @return the AnalyzeTextJobState object itself.
     */
    public AnalyzeTextJobState setTasks(TasksStateTasks tasks) {
        this.tasks = tasks;
        return this;
    }

    /**
     * Get the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @return the statistics value.
     */
    public RequestStatistics getStatistics() {
        return this.statistics;
    }

    /**
     * Set the statistics property: if showStats=true was specified in the request this field will contain information
     * about the request payload.
     *
     * @param statistics the statistics value to set.
     * @return the AnalyzeTextJobState object itself.
     */
    public AnalyzeTextJobState setStatistics(RequestStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setDisplayName(String displayName) {
        super.setDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setCreatedDateTime(OffsetDateTime createdDateTime) {
        super.setCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setExpirationDateTime(OffsetDateTime expirationDateTime) {
        super.setExpirationDateTime(expirationDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setLastUpdatedDateTime(OffsetDateTime lastUpdatedDateTime) {
        super.setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setStatus(State status) {
        super.setStatus(status);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setErrors(List<Error> errors) {
        super.setErrors(errors);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnalyzeTextJobState setNextLink(String nextLink) {
        super.setNextLink(nextLink);
        return this;
    }
}
