package com.app.dao;

import com.app.entity.Goods;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GoodsDao {
  List<Goods> getGoodsAll();

  List<Goods> getGoodsByRc(String regionCode);

  List<Goods> getGoodsByTp(String type);

  List<Goods> getGoodsByStt(String state);
}
