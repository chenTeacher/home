package com.example.service;

import com.example.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface  UserService {
    /**
     * 通过userId获取用户信息
     * @param userId
     * @return
     */
    public User getUserById(String userId);
    /**
     *获取全部用户信息
     */
    public List<User> getUserALL();
}
