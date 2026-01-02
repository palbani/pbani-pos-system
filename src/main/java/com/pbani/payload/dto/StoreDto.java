package com.pbani.payload.dto;

import com.pbani.domain.StoreStatus;
import com.pbani.model.StoreContact;

import java.time.LocalDateTime;

public class StoreDto {
    private Long id;

    private String brand;


    private UserDto storeAdmin;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String description;

    private String storeType;

    private StoreStatus status;

    private StoreContact contact;
}
