package com.xyl.model;

public class GetuiModel {

	private Integer memberId;

	private String cid;
	
	public GetuiModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GetuiModel(Integer memberId, String cid) {
		super();
		this.memberId = memberId;
		this.cid = cid;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

}
