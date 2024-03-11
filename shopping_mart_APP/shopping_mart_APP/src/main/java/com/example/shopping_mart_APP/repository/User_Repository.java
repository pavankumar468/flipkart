package com.example.shopping_mart_APP.repository;

import com.example.shopping_mart_APP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Repository extends JpaRepository<User,Long> {
    boolean findByUserName(String userName);

    boolean findByEmail(String email);
}
