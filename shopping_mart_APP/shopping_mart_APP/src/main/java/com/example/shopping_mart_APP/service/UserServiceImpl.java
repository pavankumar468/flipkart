package com.example.shopping_mart_APP.service;

import com.example.shopping_mart_APP.model.User;
import com.example.shopping_mart_APP.repository.User_Repository;
import com.example.shopping_mart_APP.service.serviceinterface.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface {
    @Autowired
    private User_Repository userRepo;


    @Override
    public User registerUser(String userName, String email, String password) {
        User user =  new User();
        user.setUser_name(userName);
        user.setEmail(email);
        user.setPassword(password);
        if(userRepo.findByUserName(userName) && userRepo.findByEmail(email)){
            return userRepo.save(user);
        }else{
            throw new RuntimeException("unable to register user ");
        }
    }
}
