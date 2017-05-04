package com.xinan.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("大爷，请输入两个数");
		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("您输入的两个数的商为:" + num1 / num2);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("ArithmeticException被捕获");
		} catch (InputMismatchException ime) {
			//ime.printStackTrace();
			//System.out.println(ime.getMessage());
			//System.out.println("InputMismatchException被捕获");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception被捕获");
		}
	}
}
