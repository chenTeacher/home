package com.app.service;

import com.app.entity.Image;
import com.app.entity.Service;

import java.util.List;

public interface ServiceService {

    List<Service> getsubListById(String id);
    List<Service> getdetailListById(String id);
    List<Image> loginImage(String parm);
    List<Image> advertImage(String parm);
}
