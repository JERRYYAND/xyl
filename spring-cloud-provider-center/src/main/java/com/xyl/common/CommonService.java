package com.xyl.common;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.xyl.request.Request;
import com.xyl.response.Response;


/**
 * 公共的 service
 * @author  xyl
 *
 */
public class CommonService {
	
	public Request getRequest(String body) {
		return JSONObject.parseObject(body, Request.class);
	}
	public Response getResponse(Request request) {
		Response response = new Response();
		response.setCode("0");
		response.setMsg("");
		response.setMemberId(request.getMemberId());
		response.setSession(request.getSession());
		response.setTimestamp(request.getTimestamp());
		response.setResult("");
		response.setUrl("");
		return response;
	}
	
	/**
	 * 返回JSON
	 * @author  xyl
	 *
	 */
	public String toFastJson(Object obj) {
		String objStr = com.alibaba.fastjson.JSONObject.toJSONString(obj,
				SerializerFeature.WriteDateUseDateFormat,
				SerializerFeature.WriteMapNullValue);
		return objStr;
	}
}












