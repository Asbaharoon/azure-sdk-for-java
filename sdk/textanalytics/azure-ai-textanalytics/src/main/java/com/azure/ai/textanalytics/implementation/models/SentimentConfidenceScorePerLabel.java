// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the confidence scores between 0 and 1 across all sentiment classes: positive, neutral, negative. */
@Fluent
public final class SentimentConfidenceScorePerLabel {
    /*
     * Confidence score for positive sentiment
     */
    @JsonProperty(value = "positive", required = true)
    private double positive;

    /*
     * Confidence score for neutral sentiment
     */
    @JsonProperty(value = "neutral", required = true)
    private double neutral;

    /*
     * Confidence score for negative sentiment
     */
    @JsonProperty(value = "negative", required = true)
    private double negative;

    /** Creates an instance of SentimentConfidenceScorePerLabel class. */
    public SentimentConfidenceScorePerLabel() {}

    /**
     * Get the positive property: Confidence score for positive sentiment.
     *
     * @return the positive value.
     */
    public double getPositive() {
        return this.positive;
    }

    /**
     * Set the positive property: Confidence score for positive sentiment.
     *
     * @param positive the positive value to set.
     * @return the SentimentConfidenceScorePerLabel object itself.
     */
    public SentimentConfidenceScorePerLabel setPositive(double positive) {
        this.positive = positive;
        return this;
    }

    /**
     * Get the neutral property: Confidence score for neutral sentiment.
     *
     * @return the neutral value.
     */
    public double getNeutral() {
        return this.neutral;
    }

    /**
     * Set the neutral property: Confidence score for neutral sentiment.
     *
     * @param neutral the neutral value to set.
     * @return the SentimentConfidenceScorePerLabel object itself.
     */
    public SentimentConfidenceScorePerLabel setNeutral(double neutral) {
        this.neutral = neutral;
        return this;
    }

    /**
     * Get the negative property: Confidence score for negative sentiment.
     *
     * @return the negative value.
     */
    public double getNegative() {
        return this.negative;
    }

    /**
     * Set the negative property: Confidence score for negative sentiment.
     *
     * @param negative the negative value to set.
     * @return the SentimentConfidenceScorePerLabel object itself.
     */
    public SentimentConfidenceScorePerLabel setNegative(double negative) {
        this.negative = negative;
        return this;
    }
}
