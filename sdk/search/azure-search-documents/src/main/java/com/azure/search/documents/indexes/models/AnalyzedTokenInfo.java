// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a token returned by an analyzer. */
@Immutable
public final class AnalyzedTokenInfo {
    /*
     * The token returned by the analyzer.
     */
    @JsonProperty(value = "token", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String token;

    /*
     * The index of the first character of the token in the input text.
     */
    @JsonProperty(value = "startOffset", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int startOffset;

    /*
     * The index of the last character of the token in the input text.
     */
    @JsonProperty(value = "endOffset", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int endOffset;

    /*
     * The position of the token in the input text relative to other tokens. The first token in the input text has
     * position 0, the next has position 1, and so on. Depending on the analyzer used, some tokens might have the same
     * position, for example if they are synonyms of each other.
     */
    @JsonProperty(value = "position", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private int position;

    /**
     * Creates an instance of AnalyzedTokenInfo class.
     *
     * @param token the token value to set.
     * @param startOffset the startOffset value to set.
     * @param endOffset the endOffset value to set.
     * @param position the position value to set.
     */
    @JsonCreator
    public AnalyzedTokenInfo(
        @JsonProperty(value = "token", required = true, access = JsonProperty.Access.WRITE_ONLY) String token,
        @JsonProperty(value = "startOffset", required = true, access = JsonProperty.Access.WRITE_ONLY)
            int startOffset,
        @JsonProperty(value = "endOffset", required = true, access = JsonProperty.Access.WRITE_ONLY) int endOffset,
        @JsonProperty(value = "position", required = true, access = JsonProperty.Access.WRITE_ONLY) int position) {
        this.token = token;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.position = position;
    }

    /**
     * Get the token property: The token returned by the analyzer.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Get the startOffset property: The index of the first character of the token in the input text.
     *
     * @return the startOffset value.
     */
    public int getStartOffset() {
        return this.startOffset;
    }

    /**
     * Get the endOffset property: The index of the last character of the token in the input text.
     *
     * @return the endOffset value.
     */
    public int getEndOffset() {
        return this.endOffset;
    }

    /**
     * Get the position property: The position of the token in the input text relative to other tokens. The first token
     * in the input text has position 0, the next has position 1, and so on. Depending on the analyzer used, some tokens
     * might have the same position, for example if they are synonyms of each other.
     *
     * @return the position value.
     */
    public int getPosition() {
        return this.position;
    }
}
