package com.xyl.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyl.dao.ProductInfoMapper;
import com.xyl.model.ProductInfo;
import com.xyl.server.ProductServer;


@Service
public class ProductServerImpl implements ProductServer{
	@Autowired
	private  ProductInfoMapper productInfoMapper;
	@Override
	public String  selectProductInfo() {
		 //ProductInfo pc = productInfoMapper.selectByPrimaryKey("157875196366160022");
		return "hello-word";
	}

}
