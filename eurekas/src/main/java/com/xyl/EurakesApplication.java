package com.xyl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurakesApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurakesApplication.class).web(true).run(args);
	}
}
