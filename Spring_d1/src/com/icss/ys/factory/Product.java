package com.icss.ys.factory;

public class Product {
	private String name;
	private int price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//展示
	public void show(){
		System.out.println("最近有商品上架");
	}
	
}
