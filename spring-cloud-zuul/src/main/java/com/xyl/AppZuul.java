package com.xyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 
 * @author xyl
 *@EnableZuulProxy:開啟網購
 *
 */
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class AppZuul {

	
	public static void main(String[] args) {
		SpringApplication.run(AppZuul.class, args);
	}
}
