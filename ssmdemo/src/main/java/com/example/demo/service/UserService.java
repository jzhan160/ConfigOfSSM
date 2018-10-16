package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {

    int addUser(User user);

    User findUserById(Integer id);
}