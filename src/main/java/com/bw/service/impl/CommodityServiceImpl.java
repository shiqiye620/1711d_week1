package com.bw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Brand;
import com.bw.bean.Commodity;
import com.bw.bean.Condition;
import com.bw.bean.Type;
import com.bw.dao.CommodityDao;
import com.bw.service.CommodityService;
@Service
public class CommodityServiceImpl implements CommodityService{
	
	@Autowired
	private CommodityDao dao;

	@Override
	public List<Commodity> list(Condition con) {
		// TODO Auto-generated method stub
		return dao.list(con);
	}

	@Override
	public List<Brand> getBList() {
		// TODO Auto-generated method stub
		return dao.getBList();
	}

	@Override
	public List<Type> getTList() {
		// TODO Auto-generated method stub
		return dao.getTList();
	}

	@Override
	public boolean add(Commodity com) {
		// TODO Auto-generated method stub
		
		return dao.add(com);
	}

	
}
