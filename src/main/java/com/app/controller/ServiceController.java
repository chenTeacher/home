package com.app.controller;

import com.app.entity.Goods;
import com.app.entity.Image;
import com.app.entity.Service;
import com.app.entity.ServiceOrder;
import com.app.service.ServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
     * 功能描述：通过一级服务的类别id 获取对应的子服务列表
     *
     *
     */
    @RequestMapping("getsublist")
    @ResponseBody
    public List getsubListById(String type){
        List<Service> list=serviceService.getsubListByType(type);
        return list;
    }



    /**
     * 功能描述：根据服务的id获取单个服务详情
     *
     *
     */
    @RequestMapping("getdetaillist")
    @ResponseBody
    public List getDetailListById(String id){
        List<Service> list=serviceService.getdetailListById(id);
        return list;
    }




    /**
     * 功能描述：获取登陆图片
     *
     *
     */
    @RequestMapping("getLoginImage")
    @ResponseBody
    public List getLoginImage(){
        List<Image> list=serviceService.loginImage();
        return list;
    }



    /**
     * 功能描述：获取广告图片
     *
     *
     */
    @RequestMapping("getAdvertImage")
    @ResponseBody
    public List getAdvertImage(){
        List<Image> list=serviceService.advertImage();
        return list;
    }



    /**
     * 功能描述：下达服务订单
     *
     *
     */
    @RequestMapping("serviceOrder")
    @ResponseBody
    public String saveOrder(ServiceOrder serviceOrder){


        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String datetime = sdf.format(date); //订单下达时间
        serviceOrder.setSC(datetime);

        String state ="false";

        try {
            serviceService.saveOrder(serviceOrder);
            state="success";
        }catch (Exception excpetion){
            excpetion.printStackTrace();
        }

        return state;
    }




}
