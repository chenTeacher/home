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
   */
  @RequestMapping("all")
  @ResponseBody
  public List getAllList() {
    List<Goods> goodsList = goodsService.getGoodsAll();
    return goodsList;
  }

  /**
   * 功能描述：
   */
  @RequestMapping("rc")
  @ResponseBody
  public List getGoodsByRc() {
    List<Goods> goodsList = goodsService.getGoodsByRc("");
    return goodsList;
  }

  /**
   * 功能描述：
   */
  @RequestMapping("tp")
  @ResponseBody
  public List getGoodsByTp() {
    List<Goods> goodsList = goodsService.getGoodsByTp("");
    return goodsList;
  }

  /**
   * 功能描述：
   */
  @RequestMapping("stt")
  @ResponseBody
  public List getGoodsByStt() {
    List<Goods> goodsList = goodsService.getGoodsByStt("");
    return goodsList;
  }


}
