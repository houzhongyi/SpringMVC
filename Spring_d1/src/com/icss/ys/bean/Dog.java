package com.icss.ys.bean;

public class Dog {
	private String name;
	
	public Dog(){
		
	}
	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("set方法被容器调用");
		this.name = name;
	}
	//小狗叫
	public void shout(){
		System.out.println("汪汪汪");
	}
}
