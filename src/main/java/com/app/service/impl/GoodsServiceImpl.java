package com.app.service.impl;

import com.app.dao.GoodsDao;
import com.app.entity.Goods;
import com.app.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
  @Resource
  private GoodsDao goodsDao;

  public List<Goods> getGoodsAll() {
    return goodsDao.getGoodsAll();
  }

  public List<Goods> getGoodsByRc(String regionCode) {
    return goodsDao.getGoodsByRc(regionCode);
  }

  public List<Goods> getGoodsByTp(String type) {
    return goodsDao.getGoodsByTp(type);
  }

  public List<Goods> getGoodsByStt(String state) {
    return goodsDao.getGoodsByStt(state);
  }
}
