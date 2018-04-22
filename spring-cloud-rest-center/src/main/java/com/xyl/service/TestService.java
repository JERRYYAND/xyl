package com.xyl.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.xyl.RequestURLConstant;
import com.xyl.exception.TestServiceException;


/**
 * value来指定要调用的服务。这里表明要调用'spring-cloud-provider-center'
 * fallback是当程序错误的时候来回调的方法
 * @author  xyl
 *
 */
@FeignClient(value="spring-cloud-provider-center",fallback=TestServiceException.class)
public interface TestService {

	@PostMapping(value=RequestURLConstant.hello_word_service_R,consumes="application/json",produces="application/json")
	public String queryHelloWord(@RequestBody String body);
	}
