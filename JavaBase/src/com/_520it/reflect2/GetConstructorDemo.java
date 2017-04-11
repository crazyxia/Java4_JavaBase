package com._520it.reflect2;

import java.lang.reflect.Constructor;

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
		/*for(Constructor c1:con){
			Syste
		}
*/	}

}
