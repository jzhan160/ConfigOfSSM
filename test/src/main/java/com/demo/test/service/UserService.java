package com.demo.test.service;

import com.demo.test.model.User;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface UserService {

     User selectUser(Integer userId);
     List<User> selectAllUsers();

}