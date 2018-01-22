package com.icss.ys.traditional;

import com.icss.ys.bean.Boy;
import com.icss.ys.bean.Dog;

public class Test {
	public static void main(String[] args) {
		//创建狗对象
		Dog d = new Dog();
		//d.setName("小花");
		
		Dog d1 = new Dog();
		System.out.println(d == d1);
		
		//创建人对象
//		Boy b = new Boy();
//		b.setName("小明");
//		b.setAge(20);
//		//建立人和狗的依赖关系
//		b.setDog(d);
	}

}
