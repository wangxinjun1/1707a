package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.mapper.GoodsMapper;
import com.bw.pojo.Brand;
import com.bw.pojo.Goods;
import com.bw.pojo.GoodsKind;
@Service
public class GoodsServiceImpl implements GoodsService{
	@Resource
	public GoodsMapper mapper;
	public List<Goods> list() {
		return mapper.list();
	}
	public void add(Goods goods) {
		mapper.add(goods);
		
	}
	public List<Brand> questBrand() {
		
		return mapper.questBrand();
	}
	public List<GoodsKind> questGoodsKind() {
		
		return mapper.questGoodsKind();
	}
	public boolean del(Integer gid) {
		Integer num=mapper.del(gid);
		return num>0?true : false;
	}

}
