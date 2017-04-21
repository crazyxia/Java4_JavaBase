package com.xinan.generics;

public class TestPerson {

	public static void main(String[] args) {
		Person<String> person1=new Person<String>();
		person1.setPass("hellomoto");
		System.out.println(person1.getPass());
		
		Person<Integer> person2=new Person<Integer>();
		person2.setPass(2222);
		System.out.println(person2.getPass());
		
	}

}
