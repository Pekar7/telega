package com.telega.openAi;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Choice (
        @JsonProperty("message") Message message
) {}
