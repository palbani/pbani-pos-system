package com.pbani.service.impl;

import com.pbani.exceptions.UserException;
import com.pbani.model.User;

import java.util.List;

public interface UserService {

    //method signatures
    User getUserFromJwtToken(String jwt) throws UserException;
    User getCurrentUser() throws UserException;
    User getUserByEmail(String email) throws UserException;
    User getUserById(Long id) throws UserException, Exception;
    List<User> getAllUsers();
}
