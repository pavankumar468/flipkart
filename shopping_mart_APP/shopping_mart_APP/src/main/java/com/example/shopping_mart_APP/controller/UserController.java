package com.example.shopping_mart_APP.controller;

import com.example.shopping_mart_APP.model.User;
import com.example.shopping_mart_APP.service.serviceinterface.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceInterface userservice;

    @PostMapping("/registerUser")
    public ResponseEntity<User> registerUser(String userName, String email, String password)throws RuntimeException{
       User user = userservice.registerUser(userName,email,password);
        return new ResponseEntity<>(user, HttpStatus.CREATED);

    }


}
