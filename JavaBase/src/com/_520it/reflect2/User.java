package com._520it.reflect2;

public class User {
	private String name="张三";
	int age;
	//定义构造器
	public User() {
		System.out.println("这是个无参的构造器");
	}
	public User(String name){
	
	}
	private User(String name,int age){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void method1(){
		System.out.println("无参公共方法");
	}
	public void method2(String name){
		System.out.println("含有"+name+"的公共方法");
	}
	private void method3(String name){
		System.out.println("含有"+name+"的私有方法");
	}
}
