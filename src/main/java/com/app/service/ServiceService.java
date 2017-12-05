package com.app.service;

import com.app.entity.Image;
import com.app.entity.Service;
import com.app.entity.ServiceOrder;

import java.util.List;

public interface ServiceService {

    List<Service> getsubListByType(String type);
    List<Service> getdetailListById(String id);
    List<Image> loginImage();
    List<Image> advertImage();
    void saveOrder(ServiceOrder serviceOrder);
}
