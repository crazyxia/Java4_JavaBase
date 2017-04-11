package com._520it.reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射获取构造器
 * 
 * 需求:通过反射来获取某一个类的构造器: 
 * 1 获取该类的字节码对象. 
 * 2从该字节码对象中去找需要获取的构造器.
 */
public class GetConstructorDemo {

	public static void main(String[] args) throws Exception {
	//三种方式获取clazz类
		Class clazz1=User.class;
		//Class clazz2=Class.forName("com._520it.reflect2.User");//这种方式需要抛出异常
		//Class clazz3=(new User().getClass());
		Constructor[] con=clazz1.getConstructors();//将所有的构造器方法放置在通过constructor数组中
		System.out.println("打印数组的长度："+con.length);
		for(Constructor c1:con){
			System.out.println(c1);
		}
		Constructor c1=clazz1.getDeclaredConstructor();
		User user1=(User) c1.newInstance();//获取一个实例对象
		System.out.println("-----------------------------");
		
		Method[] m=clazz1.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method);
		}
		Method m1=clazz1.getDeclaredMethod("method2",String.class);
		//m1.invoke(user1, "李华");//通过invoke唤醒方法，即调用方法
		Field f1=clazz1.getDeclaredField("name");
		f1.setAccessible(true);
		f1.set(user1, "王五");
		System.out.println(f1);
		System.out.println("----------------------------------");
		System.out.println(c1);
		Constructor c2=clazz1.getDeclaredConstructor(String.class);
		System.out.println(c2);
		Constructor c3=clazz1.getDeclaredConstructor(String.class,int.class);
		System.out.println(c3);
		
	}

}
