package com.telega.openAi;
import lombok.Builder;

import java.util.List;

@Builder
public record ChatHistory(
        List<Message> chatMessages
) {
}
