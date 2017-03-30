package com.xinan.exception;

public class TestInteres01 {
	public static void main(String[] args) {
		int ret = test1();
		System.out.println(ret);
	}

	public static int test1() {
		int a = 1;
		try {
			return 
					++a;
			//System.out.println(a);
		} finally {
			++
			a;
		}

	}
}
