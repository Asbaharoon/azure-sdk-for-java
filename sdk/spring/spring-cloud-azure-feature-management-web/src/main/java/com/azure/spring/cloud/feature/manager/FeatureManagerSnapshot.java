// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.feature.manager;

import java.util.HashMap;

import reactor.core.publisher.Mono;

/**
 * Holds information on Feature Management properties and can check if a given feature is enabled. Returns the same
 * value in the same request.
 */
public class FeatureManagerSnapshot {

    private final FeatureManager featureManager;

    private final HashMap<String, Boolean> requestMap;

    /**
     * Used to evaluate whether a feature is enabled or disabled. When setup with the <code>@RequestScope</code> it will
     * return the same value for all checks of the given feature flag.
     * @param featureManager FeatureManager
     */
    public FeatureManagerSnapshot(FeatureManager featureManager) {
        this.featureManager = featureManager;
        this.requestMap = new HashMap<>();
    }

    /**
     * Checks to see if the feature is enabled. If enabled it check each filter, once a single filter returns true it
     * returns true. If no filter returns true, it returns false. If there are no filters, it returns true. If feature
     * isn't found it returns false.
     * <p>
     * If isEnabled has already been called on this feature in this request, it will return the same value as it did
     * before.
     *
     * @param feature Feature being checked.
     * @return state of the feature
     */
    public Mono<Boolean> isEnabledAsync(String feature) {
        if (requestMap.get(feature) != null) {
            return Mono.just(requestMap.get(feature));
        }

        return featureManager.isEnabledAsync(feature).doOnSuccess((enabled) -> requestMap.put(feature, enabled));
    }
}
