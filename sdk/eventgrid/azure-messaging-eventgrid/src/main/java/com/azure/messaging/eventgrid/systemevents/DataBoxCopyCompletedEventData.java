// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.DataBox.CopyCompleted event. */
@Fluent
public final class DataBoxCopyCompletedEventData {
    /*
     * Serial Number of the device associated with the event. The list is comma
     * separated if more than one serial number is associated.
     */
    @JsonProperty(value = "serialNumber")
    private String serialNumber;

    /*
     * Name of the current Stage
     */
    @JsonProperty(value = "stageName")
    private DataBoxStageName stageName;

    /*
     * The time at which the stage happened.
     */
    @JsonProperty(value = "stageTime")
    private OffsetDateTime stageTime;

    /**
     * Get the serialNumber property: Serial Number of the device associated with the event. The list is comma separated
     * if more than one serial number is associated.
     *
     * @return the serialNumber value.
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Set the serialNumber property: Serial Number of the device associated with the event. The list is comma separated
     * if more than one serial number is associated.
     *
     * @param serialNumber the serialNumber value to set.
     * @return the DataBoxCopyCompletedEventData object itself.
     */
    public DataBoxCopyCompletedEventData setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * Get the stageName property: Name of the current Stage.
     *
     * @return the stageName value.
     */
    public DataBoxStageName getStageName() {
        return this.stageName;
    }

    /**
     * Set the stageName property: Name of the current Stage.
     *
     * @param stageName the stageName value to set.
     * @return the DataBoxCopyCompletedEventData object itself.
     */
    public DataBoxCopyCompletedEventData setStageName(DataBoxStageName stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * Get the stageTime property: The time at which the stage happened.
     *
     * @return the stageTime value.
     */
    public OffsetDateTime getStageTime() {
        return this.stageTime;
    }

    /**
     * Set the stageTime property: The time at which the stage happened.
     *
     * @param stageTime the stageTime value to set.
     * @return the DataBoxCopyCompletedEventData object itself.
     */
    public DataBoxCopyCompletedEventData setStageTime(OffsetDateTime stageTime) {
        this.stageTime = stageTime;
        return this;
    }
}
