package com.xyl.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyl.common.CommonService;
import com.xyl.request.Request;
import com.xyl.response.Response;
/**
 * 端口9201
 * @author xyl
 * @EnableAutoConfiguration:开启自动配置
 *
 */
@RestController
@EnableAutoConfiguration
public class TestService extends CommonService{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Transactional(rollbackFor=Exception.class)
	@PostMapping(value="/hello-word-service",consumes="application/json",produces="application/json")
	public String queryHelloWord(@RequestBody String body){
		Request request = getRequest(body);
		Response response = getResponse(request);
		response.setUrl("hello-word-service");
		log.debug("provider>>>>>>>>>>>>>>>>>>");

		return toFastJson(response);
	}
	

}
