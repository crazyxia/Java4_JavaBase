package com.xinan.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		boolean flag = false;
		do {
			try {
				System.out.println("请输入三角形的高");// 从控制台输入
				Scanner sc = new Scanner(System.in);
				int h = sc.nextInt();
				while (h < 0) {
					System.out.println("高度不能为负数");
					System.out.println("请重新输入三角形的高");// 从控制台输入
					h = sc.nextInt();
				}
				System.out.println("请输入三角形的偏移量");
				int n = sc.nextInt();

				// System.out.println("请输入三角形的偏移量");
				for (int i = 1; i <= h; i++) {
					for (int j = h + n; j >= i; j--) {
						System.out.print(" ");
					}
					for (int k = 1; k <= 2 * i - 1; k++) {
						if ((k == 1) || (k == 2 * i - 1)) {
							System.out.print("*");// 控制最外层*输出
						} else if (i == h) {
							System.out.print("*");// 控制最后一行*输出
						} else {
							System.out.print(" ");// 控制中心空格的输出
						}
					}
					System.out.println();
				}
				flag = false;
			} catch (InputMismatchException ime) {
				System.out.println("请输入一个正整数");
				flag = true;
			}
		} while (flag);
	}
}
