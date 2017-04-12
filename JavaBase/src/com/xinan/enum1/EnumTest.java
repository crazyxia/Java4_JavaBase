package com.xinan.enum1;

public enum EnumTest {
	MON, TUE, WED, THU, FRI, SAT, SUN;

	public static void main(String[] args) {
		for (EnumTest e : EnumTest.values()){//values怎么得来的？
			System.out.println(e.toString());
		}
	}
}