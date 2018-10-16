package com.demo.test.dao;

import com.demo.test.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserDao {
    User selectUser(Integer id);
    List<User> selectAllUsers();
}