package com.icss.ys.test;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icss.ys.bean.Boy;
import com.icss.ys.bean.Dog;

public class TestSpring1 {
//	public static void main(String[] args) {
//		//读取核心配置文件
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//将容器自动创建的bean读取出来
//		Dog d = (Dog)ac.getBean("dog");
//		//调用对象的属性
//		System.out.println(d.getName());
//		//调用对象的方法
//		d.shout();
//	}

	public void testDI(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Boy boy = (Boy)ac.getBean("boy");
//		ac.close();//关闭容器
		
		//Boy boy1 = (Boy)ac.getBean("boy");
		//获得信息
		//System.out.println(boy.getName()+ "," + boy.getAge() * 2);
		//通过男孩 获得狗信息
		//System.out.println(boy.getDog().getName());
		
//		Product p = (Product)ac.getBean("product");
//		p.show();
		//System.out.println(boy == boy1);
		
	}
	@Test
	public void testSetter(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Dog d = (Dog)ac.getBean("dog");
		System.out.println(d.getName());
		Boy boy = (Boy)ac.getBean("boy");
		String[] s = boy.getPhones();
		for (String string : s) {
			System.out.println(string);
		}
		System.out.println("-------------------");
		ArrayList<String> a =  boy.getAddress();
		for (String string : a) {
			System.out.println(string);
		}
		System.out.println(boy.getDog().getName());
	}
}
