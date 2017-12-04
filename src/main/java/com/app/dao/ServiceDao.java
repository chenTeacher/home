package com.app.dao;

import com.app.entity.Service;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceDao {

    List<Service> getsubListById(String id);
}
