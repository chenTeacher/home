package com.app.service.impl;

import com.app.dao.ServiceDao;
import com.app.service.ServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("serviceService")
public class ServiceServiceImpl implements ServiceService{

    @Resource
    ServiceDao serviceDao;

    public List<com.app.entity.Service> getData() {
        return serviceDao.getData();
    }
}
