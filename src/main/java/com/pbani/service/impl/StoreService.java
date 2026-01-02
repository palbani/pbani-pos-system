package com.pbani.service.impl;

import com.pbani.model.Store;
import com.pbani.model.User;
import com.pbani.payload.dto.StoreDto;

import java.util.List;

public interface StoreService {

    StoreDto createStore(StoreDto storeDto, User user);
    StoreDto getStoreById(Long id);
    List<StoreDto> getAllStores();
    Store getStoreByAdmin();
    StoreDto getStoreByAdmin(Long id, StoreDto storeDto);
    StoreDto updateStore(Long id,StoreDto storeDto);
    StoreDto deleteStore(Long id);
    StoreDto getStoreByEmployee();

}
