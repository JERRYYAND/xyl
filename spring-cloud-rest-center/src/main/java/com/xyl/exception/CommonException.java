package com.xyl.exception;

public class CommonException {
	public String getErrorResponse(String url){
		StringBuffer sb = new StringBuffer();
		
		sb.append("{");
		
		sb.append("\"code\":9,");
		sb.append("\"memberId\":-1,");
		sb.append("\"msg\":\"error\",");
		sb.append("\"result\":\"\",");
		sb.append("\"session\":\"\",");
		sb.append("\"timestamp\":").append(System.currentTimeMillis()).append(",");
		sb.append("\"url\":\"").append(url).append("\"");
		sb.append("}");
		
		return sb.toString();
	}
}
