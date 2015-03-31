package com.shoemeet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoemeet.dao.IBaseDao;
import com.shoemeet.service.IBaseService;
import com.shoemeet.util.DataSourceHolder;

@Service("baseService")
public class BaseServiceImpl<T> implements IBaseService<T> {
	
	@Autowired
	private IBaseDao<T> baseDao;
	@Autowired
	private IBaseDao<T> dyBaseDao;
	@Autowired
	private IBaseDao<T> masterBaseDao;
	
	@Override
	public int addObject(T t) {
		DataSourceHolder.setDataSource("dataSource1");
		baseDao.addObject(t);
		DataSourceHolder.setDataSource("dataSource2");
		dyBaseDao.addObject(t);
		DataSourceHolder.setDataSource("dataSource3");
		masterBaseDao.addObject(t);
		return 0;
	}

}
