package com.example.backend.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegisterRequest(@NotBlank String username, @NotBlank @Email String email,
    @NotBlank @Size(min = 6, max = 12) String password) {
}
