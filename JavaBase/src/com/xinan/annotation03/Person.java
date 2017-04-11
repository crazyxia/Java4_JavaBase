package com.xinan.annotation03;

public abstract class Person {
	@HiWorld(19)
	private int age=18;
	public Person() {
	}
	public int getAge() {
		return age;
	}
	public void showInfo(){
		System.out.println("年龄:"+ age);
	}
}
