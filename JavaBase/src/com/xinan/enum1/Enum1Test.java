package com.xinan.enum1;

public class Enum1Test {
	public static void main(String[] args) {
		for (Enum1 e1 : Enum1.values()) {
			System.out.println(e1.getAge()+" "+e1.getName());
		}
		Enum1.MON.isRest();
		Enum1.TUE.isRest();
		//System.out.println(Enum1.MON.valueOf("3"));
		System.out.println(Enum1.TUE.getAge());
		System.out.println(Enum1.TUE.setAge(20));
		System.out.println(Enum1.TUE.getAge());//???????????????
	}
}
