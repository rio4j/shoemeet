package com.shoemeet.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.shoemeet.service.IBaseService;

@Controller
public class BaseController <T> {
	
	@Autowired
	private IBaseService<T> baseService;
	
	protected void addObject(T t) {
		long d1 = System.currentTimeMillis();
		baseService.addObject(t);
		long d2 = System.currentTimeMillis();
		System.out.println("d : " + (d2 - d1));
		long h1 = System.currentTimeMillis();
		baseService.queryObject();
		long h2 = System.currentTimeMillis();
		System.out.println("h : " + (h2 - h1));
		long b1 = System.currentTimeMillis();
		baseService.appendObject();
		long b2 = System.currentTimeMillis();
		System.out.println("b : " + (b2 - b1));
	}
}
