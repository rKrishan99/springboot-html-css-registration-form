package org.example.demoapp.entity;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
