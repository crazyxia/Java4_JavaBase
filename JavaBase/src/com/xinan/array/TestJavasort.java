package com.xinan.array;

import java.util.Arrays;

public class TestJavasort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 7, 3, 6, 4 };
		System.out.println("数组排序前：");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "");
		}
		Arrays.sort(a);
		System.out.println("排序之后的顺序：");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+"");
			/* System.out.println(a[a.length-i-1] + "");可以实现倒序输出 */
		}
	}
}
