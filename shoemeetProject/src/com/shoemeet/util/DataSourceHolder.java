package com.shoemeet.util;

public class DataSourceHolder {
	
	//线程本地环境
	private static ThreadLocal<String> dataSources = new ThreadLocal<String>();
	//设置数据源
	public static void setDataSource(String customerType) {
	    dataSources.set(customerType);
	}
	//获取数据源
	public static String getDataSource() {
	    return (String) dataSources.get();
	}
	//清除数据源
	public static void clearDataSource() {
	    dataSources.remove();
	}
	
	public static void setMaster () {
		dataSources.set("dataSource1");
	}
	
	public static void setSlave1 () {
		dataSources.set("dataSource2");
	}
	
	public static void setSlave2 () {
		dataSources.set("dataSource3");
	}
}
