package com.bw.service;

import java.util.List;

import com.bw.pojo.Brand;
import com.bw.pojo.Goods;
import com.bw.pojo.GoodsKind;

public interface GoodsService {
	public List<Goods> list();

	public void add(Goods goods);

	public List<Brand> questBrand();

	public List<GoodsKind> questGoodsKind();

	public boolean del(Integer gid);
}
