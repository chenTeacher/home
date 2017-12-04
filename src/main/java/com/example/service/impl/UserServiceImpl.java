package com.example.service.impl;

import com.example.dao.UserMapper;
import com.example.pojo.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public User getUserById(String userId) {
        return this.userMapper.getUserById(userId);
    }

    public  List<User>  getUserALL() {
        return this.userMapper.getUserALL();
    }
}
