package com.xinan.testoop01;

public abstract class Pet {
	String name;
	int age=50;
	private int love=100;
	public Pet(){}
	public Pet(String name){
		super();
		this.name=name;
	}
	public Pet(String name,int age,int love){
		super();
		this.name=name;
		this.age=age;
		this.love=love;
	}
	public final void print(){
		System.out.println("name "+name+"age"+age+"love"+love);
    }
	public void eat(){
		System.out.println("pet eat");
	}
}
