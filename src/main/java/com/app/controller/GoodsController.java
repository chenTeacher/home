package com.app.controller;


import com.app.entity.Goods;
import com.app.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品相关
 */

@Controller
@RequestMapping("/goods/")
public class GoodsController {

   @Resource(name = "goodsService")
   private GoodsService goodsService;


    /**
     * 功能描述：
     *
     *
     */
    @RequestMapping("")
    @ResponseBody
    public List method(){

        List<Goods> goodsList=goodsService.getData();

        return goodsList;
    }


}
