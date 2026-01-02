package com.pbani.model;


import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Embeddable
public class StoreContact {
    private String address;
    private String phone;

    //validation constraint, automatically creates MethodArgumentNotValidException to send back to postman/frontend
    @Email (message = "Please provide a valid email address")
    private String email;

}