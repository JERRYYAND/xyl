package com.xyl.response;

public class Response {
/**
 * 响应参数
 */
	private int memberId;//会员ID
	private long timestamp;//时间戳
	private String session;//会员session
	private String code;//响应码
	private String msg;
	private Object result;
	private String url;
	
	public Response(){}

	public int getMemberId() {
		return memberId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getSession() {
		return session;
	}

	
	public String getMsg() {
		return msg;
	}

	public Object getResult() {
		return result;
	}

	public String getUrl() {
		return url;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public void setSession(String session) {
		this.session = session;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
