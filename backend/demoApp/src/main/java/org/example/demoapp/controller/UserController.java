package org.example.demoapp.controller;

import org.example.demoapp.entity.LoginRequest;
import org.example.demoapp.entity.User;
import org.example.demoapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        try {
            if (userService.emailExists(user.getEmail())) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Email already exists");
            }
            User registeredUser = userService.registerUser(user);
            if (registeredUser == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: Email already registered");
            }
            return ResponseEntity.ok(registeredUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error: " + e.getMessage());
        }
    }


    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody LoginRequest loginRequest) {
        User user = userService.authenticateUser(loginRequest.getEmail(), loginRequest.getPassword());
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }
    }

}
