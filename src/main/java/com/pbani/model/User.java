package com.pbani.model;

import com.pbani.domain.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {

    @Id //primary key of table, unique identifier
    private Long id;

    @Column(nullable = false) // usernames cannot be null when a new user is created
    private String fullName;

    @Column(nullable = false, unique = true)
    @Email(message = "Please provide a valid email address")
    private String email;

    private String phone;

    @Column(nullable = false)
    private UserRole role;

    private String password;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLogin;
}
