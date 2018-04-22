package com.xyl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
/**
 * 通过当前service服务要调用到其他service服务的api接口时，可通过EnableFeignClients调用其他服务的api
 * Feign是一个声明式的WebService客户端
 * Feign可以与Eureka和Ribbon组合使用以支持负载均衡。
 * @author  xyl
 *
 */

@EnableHystrix
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class StartRestCenter {

	public static void main(String[] args) {
		new SpringApplicationBuilder(StartRestCenter.class).web(true).run(args);

	}

}
