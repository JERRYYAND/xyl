package com.xyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xyl.model.GetuiModel;
import com.xyl.server.OrderServie;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	@Autowired
	private OrderServie orderServie;
	@Transactional
	@GetMapping(value="/info")
	public GetuiModel getOrderInfo(@RequestParam Integer id) {
		GetuiModel gm = orderServie.selectOrderInfo(id);
		return gm;
	}

}
