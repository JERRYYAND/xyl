package com.xyl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 提供者:provider
 * 一个@SpringbootApplication相当于@Configuration,@EnableAutoConfiguration和 @ComponentScan
 */
@EnableEurekaClient
@SpringBootApplication
/**dao扫描*/
@MapperScan("com.xyl.dao")
public class StartProviderCenter {

	public static void main(String[] args) {
		
		new SpringApplicationBuilder(StartProviderCenter.class).web(true).run(args);

	}

}
