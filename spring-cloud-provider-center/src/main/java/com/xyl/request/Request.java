package com.xyl.request;

public class Request {
/**
 * 请求参数
 */
	private int memberId;//会员ID
	private long timestamp;//时间戳
	private String session;//会员session
	private String bizContent;//业务参数
	
	public Request(){}

	public int getMemberId() {
		return memberId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getSession() {
		return session;
	}

	public String getBizContent() {
		return bizContent;
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

	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	
	
}
