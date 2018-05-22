package com.xyl.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyl.dao.GetuiMapper;
import com.xyl.model.GetuiModel;
import com.xyl.server.OrderServie;
@Service
public class OrderServiceImpl implements OrderServie{
	
	@Autowired
	private GetuiMapper getuiMapper;
	@Override
	public GetuiModel selectOrderInfo(Integer id) {
		 GetuiModel gm = getuiMapper.selectByCid(id);
		return gm;
	}

}
