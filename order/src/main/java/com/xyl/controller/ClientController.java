package com.xyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyl.client.ProductClient;

import groovy.util.logging.Slf4j;

@RestController
@Slf4j
public class ClientController {
	@Autowired
	private ProductClient productClient;
	
	@GetMapping(value="/getProductMsg")
	public String getProductMsg() {
		//第一种方式
//		RestTemplate restTemplate=new RestTemplate();
//		restTemplate.getForObject(url:"http://localhost:9112/msg", String.class);
//		String response = restTemplate.getForObject("http://localhost:9112/msg", String.class);
		String response = productClient.msg();
		return response;
	}
	
}
