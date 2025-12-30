package com.sahasouvik.projects.Lovable_Clone.entity;

import com.sahasouvik.projects.Lovable_Clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls;   //  JSON array of tools called

    Integer tokensUsed;

    Instant createdAt;
}
