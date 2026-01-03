package com.sahasouvik.projects.Lovable_Clone.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
