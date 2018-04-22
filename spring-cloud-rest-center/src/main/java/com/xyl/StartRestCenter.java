package com.xyl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
/**
 * 通过当前service服务要调用到其他service服务的api接口时，可通过EnableFeignClients调用其他服务的api
 * Feign是一个声明式的WebService客户端
 * Feign可以与Eureka和Ribbon组合使用以支持负载均衡。
 * 
 * @EnableDiscoveryClient基于spring-cloud-commons,>>>>一种方便使用eureka 的注解，用其他的作为注册中心的话，可以用该注解
 * @EnableEurekaClient注解包含（@EnableDiscoveryClient）基于spring-cloud-netflix。>>>但是应用场景eureka较为单一
 * 
 * 
 * 1:如果选用的注册中心是eureka，那么就推荐@EnableEurekaClient
 * 2：如果是其他的注册中心，那么推荐使用@EnableDiscoveryClient。
 * @author  xyl
 *
 */

@EnableHystrix
@EnableFeignClients
//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class StartRestCenter {

	public static void main(String[] args) {
		new SpringApplicationBuilder(StartRestCenter.class).web(true).run(args);

	}

}
