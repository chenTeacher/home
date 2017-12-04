package com.app.controller;

import com.app.entity.Goods;
import com.app.entity.Image;
import com.app.entity.Service;
import com.app.service.ServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
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
     * 功能描述：通过一级服务的id获取对于的子列表
     *
     *
     */
    @RequestMapping("getsublist.do")
    @ResponseBody
    public List getsubListById(String id){
        List<Service> list=serviceService.getsubListById(id);
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
    public List getLoginImage(String parm){
        List<Image> list=serviceService.loginImage(parm);
        return list;
    }



    /**
     * 功能描述：获取广告图片
     *
     *
     */
    @RequestMapping("getAdvertImage")
    @ResponseBody
    public List getAdvertImage(String parm){
        List<Image> list=serviceService.advertImage(parm);
        return list;
    }


}
