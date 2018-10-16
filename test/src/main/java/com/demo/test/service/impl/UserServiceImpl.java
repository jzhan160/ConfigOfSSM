package com.demo.test.service.impl;

import com.demo.test.dao.UserDao;
import com.demo.test.model.User;
import com.demo.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User selectUser(Integer userId) {
        return userDao.selectUser(userId);
    }

    public List<User> selectAllUsers(){
        return userDao.selectAllUsers();
    }
}