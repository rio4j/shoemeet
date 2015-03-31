package com.shoemeet.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shoemeet.dao.IBaseDao;

@Repository("masterBaseDao")
public class MasterBaseDaoImpl<T> implements IBaseDao<T> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int addObject(T t) {
		System.out.println("aaa");
		jdbcTemplate.execute("insert into b (a, b) value (6,6)"); 
		return 0;
	}

}
