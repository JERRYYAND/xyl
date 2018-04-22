package com.xyl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyl.RequestURLConstant;
import com.xyl.service.TestService;


/**
 * 端口；9300
 * @author xyl
 *
 */
@RestController
public class TestController {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
	private TestService testService;

    @PostMapping(value=RequestURLConstant.hello_word_service_R,consumes="application/json",produces="application/json")
	public String queryHelloWord(@RequestBody String body){
    	log.debug("rest>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return testService.queryHelloWord(body);
	}
	
}
















