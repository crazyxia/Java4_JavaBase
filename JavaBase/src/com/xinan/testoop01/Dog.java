package com.xinan.testoop01;

public class Dog extends Pet {
	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}

	public Dog(String name, int age, int love) {
		super(name, age, love);
	}
	public void eat(){
		System.out.println("小狗吃东西");
	}
	public void catchingFlyDisc(){
		System.out.println("小狗玩飞碟");
	}
}
