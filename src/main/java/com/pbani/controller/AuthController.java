package com.pbani.controller;

import com.pbani.exceptions.UserException;
import com.pbani.payload.dto.UserDto;
import com.pbani.payload.response.AuthResponse;
import com.pbani.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    //api endpoint: localhost:5000/auth/signup

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signupHandle(
            @RequestBody UserDto userDto
    ) throws UserException {
        return ResponseEntity.ok(
                //this should be .signup I believe?
                authService.register(userDto)
        );
    }

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> loginHandle(
            @RequestBody UserDto userDto
    ) throws UserException {
        return ResponseEntity.ok(
                authService.login(userDto)
        );
    }
}
