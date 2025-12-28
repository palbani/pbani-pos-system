package com.pbani.repository;

import com.pbani.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    //Because the User model has a field called email, Spring automatically generates the SQL query for this behind the scenes
    //Basically writing SELECT * FROM users WHERE email = ? at runtime
    User findByEmail(String email);
}
