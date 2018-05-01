package com.xyl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 分布式配置中心
 *
 * 配置中心 >>> 在分布式系统中，由于服务数量巨多，为了方便服务配置文件的统一管理，实时的更新，所以需要分布式配置中心组建，
 * 
 * 在springCloud中，有分布式配置中心组件spring cloud
 * config,它支持配置服务放在配置服务的内存中（本地），也支持放在远程GIT仓库中
 * 
 * 在 spring cloud config 组件中，分两个角色，一个是 config server ，一个是config client。
 * 
 * @author xyl
 * @time 2018年5月1日下午9:44:47
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
