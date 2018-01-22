package com.icss.ys.factory;

public class StaticFactory {
	//提供一个静态工厂方法
	public static Product getProduct(){
		return new Product();
	}

}
