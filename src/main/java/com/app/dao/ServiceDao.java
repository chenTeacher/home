package com.app.dao;

import com.app.entity.Image;
import com.app.entity.Service;
import com.app.entity.ServiceOrder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ServiceDao {

    List<Service> getsubListByType(String type);
    List<Service> getdetailListById(String id);
    List<Image> loginImage();
    List<Image> advertImage();
    void saveOrder(ServiceOrder serviceOrder);
}
