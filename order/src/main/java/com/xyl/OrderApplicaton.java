package com.xyl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableCircuitBreaker
//@SpringCloudApplication相对于上面三注解

@SpringCloudApplication
@EnableFeignClients
@MapperScan("com.xyl.dao")
public class OrderApplicaton {

	public static void main(String[] args) {
		new SpringApplicationBuilder(OrderApplicaton.class).web(true).run(args);

	}

}
