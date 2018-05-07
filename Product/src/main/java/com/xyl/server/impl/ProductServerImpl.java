package com.xyl.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyl.dao.ProductInfoMapper;
import com.xyl.model.ProductInfo;
import com.xyl.server.ProductServer;


@Service
public class ProductServerImpl implements ProductServer{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private  ProductInfoMapper productInfoMapper;
	@Override
	public String  selectProductInfo() {
		// ProductInfo pc = productInfoMapper.selectByPrimaryKey("157875196366160022");
		 //log.info("pc>>>>>>>>>>>>>>>>>>>>"+pc);
		return "product-hello-word";
	}

}
