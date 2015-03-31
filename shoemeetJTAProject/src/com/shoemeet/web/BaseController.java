package com.shoemeet.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoemeet.service.IBaseService;

@Controller
public class BaseController <T> {
	
	@Autowired
	private IBaseService<T> baseService;
	
	protected void addObject(T t) {
		baseService.addObject(t);
	}
}
