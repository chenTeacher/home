package com.app.dao;

import com.app.entity.Login;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginDao {
    List<Login> getData();
}
