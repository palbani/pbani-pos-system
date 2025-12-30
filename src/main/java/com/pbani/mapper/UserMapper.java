package com.pbani.mapper;

import com.pbani.model.User;
import com.pbani.payload.dto.UserDto;

public class UserMapper {

    //method return type is UserDto and the method name is toDTO
    public static UserDto toDTO(User savedUser) {
        UserDto userDto = new UserDto();


        userDto.setId(savedUser.getId());
        userDto.setEmail(savedUser.getEmail());
        userDto.setRole(savedUser.getRole());
        userDto.setCreatedAt(savedUser.getCreatedAt());
        userDto.setUpdatedAt(savedUser.getUpdatedAt());
        userDto.setLastLogin(savedUser.getLastLogin());
        userDto.setPhone(savedUser.getPhone());


        return userDto;


    }
}
