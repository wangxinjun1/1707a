package com.bw.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.bw.pojo.Brand;
import com.bw.pojo.Goods;
import com.bw.pojo.GoodsKind;
import com.bw.service.GoodsService;
import com.bw.util.FileUtils;

@Controller
public class GoodsController {
	@Resource
	public GoodsService ser;
	@RequestMapping("/list")
	public String list(Model model){
		List<Goods> list = ser.list();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("/lookImg")
	public void lookImgg(String path,HttpServletRequest request,HttpServletResponse response){
		FileUtils.lookImg(path, request, response);
	}
	
	@RequestMapping("/add")
	public String add(Goods goods,HttpSession session,MultipartFile file) throws Exception, IOException{
		String upload = FileUtils.upload(file);
		goods.setGimg(upload);
		ser.add(goods);
		return "redirect:list";
	}
	
	@RequestMapping("/questlist")
	@ResponseBody
	public Map<String, Object> questlist(){
		Map<String, Object> map=new HashMap<String, Object>();
		List<Brand> brands=ser.questBrand();
		List<GoodsKind> goodskind = ser.questGoodsKind();
		
		map.put("brands", brands);
		map.put("goodskind", goodskind);
		
		System.out.println("*****"+brands);
		System.out.println("*****"+goodskind);
		return map;
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public boolean del(Integer gid){
		System.out.println(gid);
		boolean b=ser.del(gid);
		if(b){
			return true;
		}else{
			return false;
		}
	}
}
