package com.gz.service;

import com.gz.bean.User;
import com.gz.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String username){

        return userMapper.getUser(username);

    }

}
