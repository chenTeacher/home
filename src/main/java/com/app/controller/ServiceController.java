package com.app.controller;

import com.app.entity.Goods;
import com.app.entity.Service;
import com.app.service.ServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 服务相关
 */

@Controller
@RequestMapping("/service/")
public class ServiceController {


    @Resource(name = "serviceService")
    private ServiceService serviceService;


    /**
     * 功能描述：
     *
     *
     */
    @RequestMapping("")
    @ResponseBody
    public List method(){

        List<Service> list=serviceService.getData();

        return list;
    }


}
