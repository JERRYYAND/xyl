package com.xyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyl.server.ProductServer;

/**
 * 
 * @author xyl
 * @time 2018年5月6日下午10:35:59
 *
 */
@RestController
@RequestMapping(value="/product")
public class ProductController {
	@Autowired
	private ProductServer productServer;

	/**
	 * 1.查询所有在架的商品
	 * 2.查询类目type列表
	 * 3.查询类目
	 * 4.构造数据
	 * @author xyl
	 * @time 2018年5月6日下午10:36:42
	 *
	 */
	@RequestMapping(value="/list")
	public String listProduct() {
		 String selectProductInfo = productServer.selectProductInfo();
		
		return selectProductInfo;
	}
	
	
}












