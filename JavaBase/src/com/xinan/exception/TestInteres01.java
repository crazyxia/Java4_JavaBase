package com.xinan.exception;

/*
 * 一种解释：在return之前会执行finally里的代码，但是return之前a的值已经临时放在栈里了
finlly 执行之后会将之前的值取出来给return
ps:如果finally里有return，那么try里面的return就不会执行了
*
*/

public class TestInteres01 {
	public static void main(String[] args) {
		int ret = test1();
		System.out.println(ret);
	}

	public static int test1() {
		int a = 1;
		try {
			return a;// a的值
			// System.out.println(a);
		} finally {
			++a;
		}

	}
}
