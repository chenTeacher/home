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
   * 功能描述：获取全部商品列表
   */
  @RequestMapping("all")
  @ResponseBody
  public List getAllList() {
    List<Goods> goodsList = goodsService.getGoodsAll();
    return goodsList;
  }

  /**
   * 功能描述：根据商品城市获取商品列表
   * API_DEMO: 421100000000000 黄冈市
   */
  @RequestMapping("rc")
  @ResponseBody
  public List getGoodsByRc() {
    List<Goods> goodsList = goodsService.getGoodsByRc("421100000000000");
    return goodsList;
  }

  /**
   * 功能描述：根据商品类型获取商品列表
   * API_DEMO: SP_YP 优品
   */
  @RequestMapping("tp")
  @ResponseBody
  public List getGoodsByTp() {
    List<Goods> goodsList = goodsService.getGoodsByTp("SP_YP");
    return goodsList;
  }

  /**
   * 功能描述：根据商品状态获取商品列表
   * API_DEMO: CS_ZS 在售
   */
  @RequestMapping("stt")
  @ResponseBody
  public List getGoodsByStt() {
    List<Goods> goodsList = goodsService.getGoodsByStt("CS_ZS");
    return goodsList;
  }


}
