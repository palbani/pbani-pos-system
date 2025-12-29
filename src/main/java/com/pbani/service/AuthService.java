package com.pbani.service;

import com.pbani.exceptions.UserException;
import com.pbani.payload.dto.UserDto;
import com.pbani.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse register(UserDto userDto) throws UserException;
    AuthResponse login(UserDto userDto) throws UserException;

}
