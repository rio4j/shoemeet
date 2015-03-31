package com.shoemeet.util;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

public class DynamiacInterceptor implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

	// service方法执行之前被调用
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("切入点: " + target.getClass().getName() + "类中" + method.getName() + "方法");
		if (method.getName().startsWith("add")) {
			DataSourceHolder.setDataSource("dataSource1");
		} else if (method.getName().startsWith("query")) {
			DataSourceHolder.setDataSource("dataSource2");
		} else if(method.getName().startsWith("append")) {
			DataSourceHolder.setDataSource("dataSource3");
		} else {
			DataSourceHolder.setDataSource("dataSource1");
		}
	}

	// service方法执行完之后被调用
	public void afterReturning(Object arg0, Method method, Object[] args, Object target) throws Throwable {
		
		
	}

	// 抛出Exception之后被调用
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
		System.out.println("出现异常,切换到: slave");
	}

}
