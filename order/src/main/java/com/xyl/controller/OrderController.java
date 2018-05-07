package com.xyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyl.server.OrderServie;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	@Autowired
	private OrderServie orderServie;
	@RequestMapping(value="/info")
	public String getOrderInfo() {
		String selectOrderInfo = orderServie.selectOrderInfo();
		return selectOrderInfo;
	}

}
