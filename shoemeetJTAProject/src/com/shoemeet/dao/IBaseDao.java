package com.shoemeet.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface IBaseDao<T> {
	
	int addObject(T t);

}
