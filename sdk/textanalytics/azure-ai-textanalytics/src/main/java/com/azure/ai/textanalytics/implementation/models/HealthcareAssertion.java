// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The HealthcareAssertion model. */
@Fluent
public final class HealthcareAssertion {
    /*
     * Describes any conditionality on the entity.
     */
    @JsonProperty(value = "conditionality")
    private Conditionality conditionality;

    /*
     * Describes the entities certainty and polarity.
     */
    @JsonProperty(value = "certainty")
    private Certainty certainty;

    /*
     * Describes if the entity is the subject of the text or if it describes someone else.
     */
    @JsonProperty(value = "association")
    private Association association;

    /** Creates an instance of HealthcareAssertion class. */
    public HealthcareAssertion() {}

    /**
     * Get the conditionality property: Describes any conditionality on the entity.
     *
     * @return the conditionality value.
     */
    public Conditionality getConditionality() {
        return this.conditionality;
    }

    /**
     * Set the conditionality property: Describes any conditionality on the entity.
     *
     * @param conditionality the conditionality value to set.
     * @return the HealthcareAssertion object itself.
     */
    public HealthcareAssertion setConditionality(Conditionality conditionality) {
        this.conditionality = conditionality;
        return this;
    }

    /**
     * Get the certainty property: Describes the entities certainty and polarity.
     *
     * @return the certainty value.
     */
    public Certainty getCertainty() {
        return this.certainty;
    }

    /**
     * Set the certainty property: Describes the entities certainty and polarity.
     *
     * @param certainty the certainty value to set.
     * @return the HealthcareAssertion object itself.
     */
    public HealthcareAssertion setCertainty(Certainty certainty) {
        this.certainty = certainty;
        return this;
    }

    /**
     * Get the association property: Describes if the entity is the subject of the text or if it describes someone else.
     *
     * @return the association value.
     */
    public Association getAssociation() {
        return this.association;
    }

    /**
     * Set the association property: Describes if the entity is the subject of the text or if it describes someone else.
     *
     * @param association the association value to set.
     * @return the HealthcareAssertion object itself.
     */
    public HealthcareAssertion setAssociation(Association association) {
        this.association = association;
        return this;
    }
}
