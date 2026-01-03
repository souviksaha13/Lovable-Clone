package com.sahasouvik.projects.Lovable_Clone.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse user
) {
}
