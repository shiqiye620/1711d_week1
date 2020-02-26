package com.bw.dao;

import java.util.List;

import com.bw.bean.Brand;
import com.bw.bean.Commodity;
import com.bw.bean.Condition;
import com.bw.bean.Type;


public interface CommodityDao {

	List<Commodity> list(Condition con);

	List<Brand> getBList();

	List<Type> getTList();

	boolean add(Commodity com);

	

}
