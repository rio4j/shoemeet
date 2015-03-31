package com.shoemeet.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shoemeet.dao.IBaseDao;

@Repository("baseDao")
public class BaseDaoImpl<T> implements IBaseDao<T> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addObject(T t) {
		jdbcTemplate.execute("insert into d (a,b) value(9,9)");
		return 0;
	}
}
