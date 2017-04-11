package com._520it.reflect;

class Person {
	public Person() {
		System.out.println("无参构造器");
	}

	public Person(String name) {
		System.out.println("含有name的构造器");
	}

	private Person(String name, int age) {
		System.out.println("有参构造器" + name + age);
	}

	public void doWork() {
		System.out.println("doWork方法");
	}
}

public class RefectDemo01 {
	public static void main(String[] args) throws Exception {
		// 三种方式获取clazz对象
		//Class<?> c1 = Class.forName("com._520it.reflect.Person");
		//Class<?> c2=Person.class;
        Class<?> c3=(new Person().getClass());
        
	}
}
