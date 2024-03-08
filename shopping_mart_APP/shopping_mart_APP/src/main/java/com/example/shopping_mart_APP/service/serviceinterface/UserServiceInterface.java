package com.example.shopping_mart_APP.service.serviceinterface;

import com.example.shopping_mart_APP.model.User;

public interface UserServiceInterface {
    User registerUser(String userName, String email, String password);
}
