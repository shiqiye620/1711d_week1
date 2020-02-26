package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Brand;
import com.bw.bean.Commodity;
import com.bw.bean.Condition;
import com.bw.bean.Type;
import com.bw.service.CommodityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/*
 * 123456
 * */
@Controller
public class CommodityController {
	
	@Autowired
	private CommodityService service;
	
	@RequestMapping("list")
	private String list(Model m,Condition con) {
		if(con.getPageNum()==null || "".equals(con.getPageNum())) {
			con.setPageNum(1);
		}
		if(con.getT_name()!=null || "".equals(con.getT_name())) {
			con.setT_name(con.getT_name().trim());
		}
		if(con.getB_name()!=null || "".equals(con.getB_name())) {
			con.setB_name(con.getB_name().trim());
		}
		PageHelper.startPage(con.getPageNum(), 2);
		 List<Commodity> list=service.list(con); 
		 PageInfo<Commodity> page = new PageInfo<Commodity>(list);
		 m.addAttribute("page", page);
		 m.addAttribute("con", con);
		 
		return "list";
	}
	
	@ResponseBody
	@RequestMapping("getBList.do")
	private Object getBList() {
		
		 List<Brand> obj=service.getBList(); 
		 return obj;
		
	}
	@ResponseBody
	@RequestMapping("getTList.do")
	private Object getTList() {
		
		 List<Type> objj=service.getTList(); 
		 
		return objj;
	}
	
	@RequestMapping("toAdd")
	private Object toAdd() {
		return "add";
	}
	
	@RequestMapping("add.do")
	private String add(Commodity com) {
		System.out.println(com);
		boolean flag=service.add(com);
		if(flag==true) {
			return "redirect:list";
		}else {
			return "error";
		}
		
	}
}
