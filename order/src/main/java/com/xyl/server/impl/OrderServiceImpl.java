package com.xyl.server.impl;

import org.springframework.stereotype.Service;

import com.xyl.server.OrderServie;
@Service
public class OrderServiceImpl implements OrderServie{

	@Override
	public String selectOrderInfo() {
		
		return "order-hello-word";
	}

}
