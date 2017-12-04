package com.app.controller;

import com.app.entity.Goods;
import com.app.entity.Service;
import com.app.service.ServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 服务相关
 */

@Controller
@RequestMapping("/service/")
public class ServiceController {


    @Resource(name = "serviceService")
    private ServiceService serviceService;


    /**
     * 功能描述：通过一级服务的id获取对于的子列表
     *
     *
     */
    @RequestMapping("getsublist")
    @ResponseBody
    public List getsubListById(String id){
        List<Service> list=serviceService.getsubListById(id);
        return list;
    }


}
