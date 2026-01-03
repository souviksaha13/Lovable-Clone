package com.sahasouvik.projects.Lovable_Clone.dto.project;

import com.sahasouvik.projects.Lovable_Clone.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
