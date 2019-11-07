package com.bw.mapper;

import java.util.List;

import com.bw.pojo.Brand;
import com.bw.pojo.Goods;
import com.bw.pojo.GoodsKind;

public interface GoodsMapper {
	public List<Goods> list();

	public void add(Goods goods);

	public List<Brand> questBrand();

	public List<GoodsKind> questGoodsKind();

	public Integer del(Integer gid);
}
