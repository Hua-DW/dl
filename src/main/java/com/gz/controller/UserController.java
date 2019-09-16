package com.gz.controller;


import com.gz.bean.User;
import com.gz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/getUser",method = RequestMethod.POST)
    public String getUser(@RequestParam("username")String username,
                          @RequestParam("passward")String passward,
                          HttpServletRequest request, HttpServletResponse response){
        User user=userService.getUser(username);
        request.getSession().setAttribute("user", user);
        if (user == null) {
            System.out.println("没有用户");
            return "error";
        } else if (user.getPassword().equals(passward)) {
            request.getSession().setAttribute("user", user);
            return "success";
        } else {
            System.out.println("密码错误");
            return "error";
        }
    }
}
