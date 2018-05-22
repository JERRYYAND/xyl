package com.xyl.server.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.xyl.server.ProductServer;


@Service(value="productServer")
public class ProductServerImpl implements ProductServer{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
//	@Autowired
//	private  ProductInfoMapper productInfoMapper;
	@Override
	public String  selectProductInfo() {
//		 ProductInfo pc = productInfoMapper.selectByPrimaryKey("157875227953464068");
//		 log.info("pc>>>>>>>>>>>>>>>>>>>>"+pc);
		return "product-hello-word";
	}

}
