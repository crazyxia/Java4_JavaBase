package com.xinan.enum1;

public class TestEnum {

	public static void main(String[] args) {
		EnumTest test = EnumTest.TUE;
		switch (test) {
		case MON:
			System.out.println("今天是星期一");
			break;
		case TUE:
			System.out.println("今天是星期二");
			break;
		case WED:
			System.out.println("今天是星期三");
			break;
		case THU:
			System.out.println("今天是星期四");
			break;
		case FRI:
			System.out.println("今天是星期五");
			break;
		case SAT:
			System.out.println("今天是星期六");
			break;
		case SUN:
			System.out.println("今天是星期日");
			break;
		default:
			break;
		}
	}
}
