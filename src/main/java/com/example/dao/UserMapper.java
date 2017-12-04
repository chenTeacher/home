package com.example.dao;

import com.example.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface UserMapper {

    List<User> getUserALL();

    User getUserById(String userid);
}