package com._520it.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class User {
	public User() 		
	{
		System.out.println("无参构造器");
	}

	public User(String name) {
		System.out.println("含有name的构造器");
	}

	 private User(String name, int age) {
		 System.out.println("有参构造器"+name+age);
	}
	 public void doWork(){
		 System.out.println("doWork方法");
	 }
}

public class GetConstructorDemo {
	public static void main(String[] args) throws Exception {
	getOne();
	}

	public static void getOne() throws Exception {
		Class<?> clazz=User.class;//第一种方式
		//Class<?> clazz1=Class.forName("com._520it.reflect.User");//第二种方式
		//Class<?> clazz2=(new User().getClass());//第三种方式
		System.out.println(clazz);
		System.out.println("获取多个构造器");
		System.out.println("---------------------------------------------");
		Constructor[] con=clazz.getDeclaredConstructors();//getDeclaredConstructors表示的类声明的所有构造方法。
		for(Constructor c1:con){
			System.out.println(c1);
		}
		System.out.println("---------------------------------------------");
		con=clazz.getConstructors();//表示的类或接口声明的所有方法
		for(Constructor c2:con){
			System.out.println(c2);
		}

		System.out.println("---------------------------------------------");
		System.out.println("获取单个构造器");
		Constructor c3=clazz.getConstructor();
		Method method=clazz.getMethod("doWork");
		System.out.println(c3.newInstance());
		
		System.out.println(c3);
		System.out.println("---------------------------------------------");
		c3=clazz.getConstructor(String.class);
		System.out.println(c3.newInstance("李华"));
		System.out.println(c3);
		System.out.println("---------------------------------------------");
		c3=clazz.getDeclaredConstructor(String.class,int.class);
		c3.setAccessible(true);//使用私有化修饰，通过反射必须先设定可见
		System.out.println(c3.newInstance("lihua",36));
		System.out.println(c3);
		System.out.println("---------------------------------------------");
		
		
	}
}
