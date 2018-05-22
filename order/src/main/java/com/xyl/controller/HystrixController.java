package com.xyl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@DefaultProperties(defaultFallback="defaultFallback")
public class HystrixController {
	//设备超时时间，根据业务来判断，，，如果调用低三方时间长，超时时间可以设置长一点
//	@HystrixCommand(commandProperties= {@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="3000")})
	
	
//	@HystrixCommand(commandProperties= {
//			@HystrixProperty(name="circuitBreaker.enabled",value="true"),//熔断
//			@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="10"),
//			@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="10000"),
//			@HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value="60")})
	@HystrixCommand
	@GetMapping(value="/getProductList")
	public String getProductList(@RequestParam("number") Integer number) {
		if(number % 2==0) {
			return "SUCCESS>>>>>>>>>>>>>>>>>>>>>>>>>>>";
		}
		RestTemplate restTemplate=new RestTemplate();
		String forObject = restTemplate.getForObject("http://127.0.0.1:9112/product/list", String.class);
		return forObject;
//		 throw new RuntimeException("发生异常了>>>>>>>>>>>>>>>>");
	}
	
	@SuppressWarnings("unused")
	private String fallback() {
		return "太拥挤了，请稍后再试>>>>>>>>>>>>>>>>>>>";
	}
	
	@SuppressWarnings("unused")
	private String defaultFallback() {
		return "默认提示：：：：：太拥挤了，请稍后再试>>>>>>>>>>>>>>>>>>>";
	}	
}






