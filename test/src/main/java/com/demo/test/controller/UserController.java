package com.demo.test.controller;
import com.demo.test.model.User;
 import com.demo.test.service.UserService;
 import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestMethod;
 import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/showUser",method = RequestMethod.GET)
    public ModelAndView selectUser() throws IOException {
        User user = this.userService.selectUser(1);
        ModelAndView mv = new ModelAndView("user");
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping("/showAllUsers")
    public ModelAndView selectAllUsers() throws IOException {
        List<User> userList = this.userService.selectAllUsers();
        ModelAndView mv = new ModelAndView("users");
        mv.addObject("userList",userList);
        return mv;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}