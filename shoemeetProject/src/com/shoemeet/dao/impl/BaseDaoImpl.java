package com.shoemeet.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.shoemeet.dao.IBaseDao;

@Repository("baseDao")
public class BaseDaoImpl<T> implements IBaseDao<T> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public static int i = 0;

	@Override
	public int addObject(T t) {
		if (i == 0) {
			jdbcTemplate.execute("insert into d(a,b) value(9,9)");
		} else if (i == 1) {
			jdbcTemplate.execute("insert into h(a,b) value(9,9)");
		} else if (i == 2) {
			jdbcTemplate.execute("insert into b(a,b) value(9,9)");
			i = 0;
		} 
		i ++;
		return 0;
	}
}
