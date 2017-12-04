package com.app.dao;

import com.app.entity.Image;
import com.app.entity.Service;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface ServiceDao {

    List<Service> getsubListById(String id);
    List<Service> getdetailListById(String id);
    List<Image> loginImage(String parm);
    List<Image> advertImage(String parm);
}
