package com.shoemeet.service;

import org.springframework.stereotype.Service;

@Service
public interface IBaseService<T> {
	
	int addObject(T t);
	
}
