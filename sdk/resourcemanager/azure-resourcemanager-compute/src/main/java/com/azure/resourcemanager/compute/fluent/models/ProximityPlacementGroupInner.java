// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.models.InstanceViewStatus;
import com.azure.resourcemanager.compute.models.ProximityPlacementGroupPropertiesIntent;
import com.azure.resourcemanager.compute.models.ProximityPlacementGroupType;
import com.azure.resourcemanager.compute.models.SubResourceWithColocationStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Specifies information about the proximity placement group. */
@Fluent
public final class ProximityPlacementGroupInner extends Resource {
    /*
     * Describes the properties of a Proximity Placement Group.
     */
    @JsonProperty(value = "properties")
    private ProximityPlacementGroupProperties innerProperties;

    /*
     * Specifies the Availability Zone where virtual machine, virtual machine scale set or availability set associated
     * with the  proximity placement group can be created.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /** Creates an instance of ProximityPlacementGroupInner class. */
    public ProximityPlacementGroupInner() {
    }

    /**
     * Get the innerProperties property: Describes the properties of a Proximity Placement Group.
     *
     * @return the innerProperties value.
     */
    private ProximityPlacementGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the zones property: Specifies the Availability Zone where virtual machine, virtual machine scale set or
     * availability set associated with the proximity placement group can be created.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Specifies the Availability Zone where virtual machine, virtual machine scale set or
     * availability set associated with the proximity placement group can be created.
     *
     * @param zones the zones value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProximityPlacementGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProximityPlacementGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the proximityPlacementGroupType property: Specifies the type of the proximity placement group.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure
     * region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     *
     * @return the proximityPlacementGroupType value.
     */
    public ProximityPlacementGroupType proximityPlacementGroupType() {
        return this.innerProperties() == null ? null : this.innerProperties().proximityPlacementGroupType();
    }

    /**
     * Set the proximityPlacementGroupType property: Specifies the type of the proximity placement group.
     * &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Standard** : Co-locate resources within an Azure
     * region or Availability Zone. &lt;br&gt;&lt;br&gt; **Ultra** : For future use.
     *
     * @param proximityPlacementGroupType the proximityPlacementGroupType value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withProximityPlacementGroupType(
        ProximityPlacementGroupType proximityPlacementGroupType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProximityPlacementGroupProperties();
        }
        this.innerProperties().withProximityPlacementGroupType(proximityPlacementGroupType);
        return this;
    }

    /**
     * Get the virtualMachines property: A list of references to all virtual machines in the proximity placement group.
     *
     * @return the virtualMachines value.
     */
    public List<SubResourceWithColocationStatus> virtualMachines() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachines();
    }

    /**
     * Get the virtualMachineScaleSets property: A list of references to all virtual machine scale sets in the proximity
     * placement group.
     *
     * @return the virtualMachineScaleSets value.
     */
    public List<SubResourceWithColocationStatus> virtualMachineScaleSets() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineScaleSets();
    }

    /**
     * Get the availabilitySets property: A list of references to all availability sets in the proximity placement
     * group.
     *
     * @return the availabilitySets value.
     */
    public List<SubResourceWithColocationStatus> availabilitySets() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilitySets();
    }

    /**
     * Get the colocationStatus property: Describes colocation status of the Proximity Placement Group.
     *
     * @return the colocationStatus value.
     */
    public InstanceViewStatus colocationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().colocationStatus();
    }

    /**
     * Set the colocationStatus property: Describes colocation status of the Proximity Placement Group.
     *
     * @param colocationStatus the colocationStatus value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withColocationStatus(InstanceViewStatus colocationStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProximityPlacementGroupProperties();
        }
        this.innerProperties().withColocationStatus(colocationStatus);
        return this;
    }

    /**
     * Get the intent property: Specifies the user intent of the proximity placement group.
     *
     * @return the intent value.
     */
    public ProximityPlacementGroupPropertiesIntent intent() {
        return this.innerProperties() == null ? null : this.innerProperties().intent();
    }

    /**
     * Set the intent property: Specifies the user intent of the proximity placement group.
     *
     * @param intent the intent value to set.
     * @return the ProximityPlacementGroupInner object itself.
     */
    public ProximityPlacementGroupInner withIntent(ProximityPlacementGroupPropertiesIntent intent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ProximityPlacementGroupProperties();
        }
        this.innerProperties().withIntent(intent);
        return this;
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
