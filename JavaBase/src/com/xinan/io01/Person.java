package com.xinan.io01;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private int personId;
	private String name;
	private String pass;

	public Person() { // 无参构造器
	}

	public Person(int personId, String name, String pass) { // 有参构造器
		this.personId = personId;
		this.name = name;
		this.pass = pass;
	}
	public String toString(){
		return "personId"+personId+"\tname"+name+"\tpass"+pass;
	}
}
