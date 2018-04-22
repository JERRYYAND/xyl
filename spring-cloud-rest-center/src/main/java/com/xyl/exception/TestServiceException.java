package com.xyl.exception;

import org.springframework.stereotype.Component;

import com.xyl.RequestURLConstant;
import com.xyl.service.TestService;

/**
 * 编写程序错误时的回调类，实现接口(BaseService接口 )，在错误时回调
 * @author  xyl
 *
 */
@Component
public class TestServiceException extends CommonException implements TestService{

	@Override
	public String queryHelloWord(String body) {
	
		return getErrorResponse(RequestURLConstant.hello_word_service);
	}

}
