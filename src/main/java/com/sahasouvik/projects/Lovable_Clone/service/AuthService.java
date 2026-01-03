package com.sahasouvik.projects.Lovable_Clone.service;

import com.sahasouvik.projects.Lovable_Clone.dto.auth.AuthResponse;
import com.sahasouvik.projects.Lovable_Clone.dto.auth.LoginRequest;
import com.sahasouvik.projects.Lovable_Clone.dto.auth.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
