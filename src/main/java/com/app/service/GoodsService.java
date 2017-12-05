package com.app.service;

import com.app.entity.Goods;

import java.util.List;

public interface GoodsService {
  List<Goods> getGoodsAll();

  List<Goods> getGoodsByRc(String regionCode);

  List<Goods> getGoodsByTp(String type);

  List<Goods> getGoodsByStt(String state);
}
