package com.xinan.test02;
/*四、上机试题：
打印乘法口诀表到文件中。
要求：
A.创建一个普通类，类里有一个普通的方法，打印乘法口诀表的方法；
B.在另一个测试类中，创建一个实现Runnable接口的线程；
C.在run()方法中，使用反射唤醒打印乘法口诀表的方法；
D.启动线程，打印乘法口诀表到文件中！*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Multiplication {
	public static void multiplict() throws IOException {// 乘法口诀表的打印
		PrintStream printStream = new PrintStream("D:\\乘法口诀表.txt");
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				printStream.print(j + "*" + i + "=" + i * j + " ");
			}
			printStream.println(" ");
		}
	}
}