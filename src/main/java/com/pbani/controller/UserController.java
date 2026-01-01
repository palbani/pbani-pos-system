package com.pbani.controller;

import com.pbani.exceptions.UserException;
import com.pbani.mapper.UserMapper;
import com.pbani.model.User;
import com.pbani.payload.dto.UserDto;
import com.pbani.service.impl.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    //looks for a class with the @Servics or @Component annotation
    private final UserService userService;

    //Get request in postman
    @GetMapping("/profile")
    public ResponseEntity<UserDto> getUserProfile(
           @RequestHeader("Authorization") String token
    ) throws UserException {
       User user=userService.getUserFromJwtToken(token);

       return ResponseEntity.ok(UserMapper.toDTO(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(
            @RequestHeader("Authorization") String token,
            @PathVariable Long id
    ) throws UserException {
        User user=userService.getUserById(id);
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }
}
