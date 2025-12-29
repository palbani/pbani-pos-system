package com.pbani.payload.dto;

import com.pbani.domain.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;

//with this annotation Lombok automatically generates getters and setters
//creates method that returns a string representation of object, instead of memory address java gives by default
//equals and hashCode() it generates logic to compare two objects by their data
//creates constructor for any fields marked as final


@Data
public class UserDto {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
    private UserRole role;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLogin;
}
