package com.shoemeet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoemeet.dao.IBaseDao;
import com.shoemeet.service.IBaseService;

@Service("baseService")
public class BaseServiceImpl<T> implements IBaseService<T> {
	
	@Autowired
	private IBaseDao<T> baseDao;
	
	@Override
	public int addObject(T t) {
		baseDao.addObject(t);
		return 0;
	}
	
	@Override
	public int queryObject() {
		baseDao.addObject(null);
		return 0;
	}

	@Override
	public int appendObject() {
		baseDao.addObject(null);
		return 0;
	}
}
