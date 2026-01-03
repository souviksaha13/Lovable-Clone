package com.sahasouvik.projects.Lovable_Clone.dto.member;

import com.sahasouvik.projects.Lovable_Clone.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
