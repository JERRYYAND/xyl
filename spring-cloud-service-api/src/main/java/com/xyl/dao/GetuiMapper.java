package com.xyl.dao;

import com.xyl.model.GetuiModel;



public interface GetuiMapper {

	int deleteByPrimaryKey(Integer memberId);

	int insert(GetuiModel record);

	int insertSelective(GetuiModel record);

	GetuiModel selectByPrimaryKey(Integer memberId);
	
	GetuiModel getMemberIdByCid(String cid);
	

	int updateByPrimaryKeySelective(GetuiModel record);

	int updateByPrimaryKey(GetuiModel record);

	// 查CID，一条
	GetuiModel selectByCid(Integer mid);

}
