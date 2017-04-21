package com.xinan.test02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//创建线程的实现类
public class TestDemo implements Runnable {
	public static void main(String[] args) throws Exception {

		/*
		 * FileReader fReader = new FileReader(System.in); FileWriter fWriter =
		 * new FileWriter("乘法口诀表.txt");
		 * 
		 * BufferedReader bReader = new BufferedReader(fReader); BufferedWriter
		 * bWriter = new BufferedWriter(fWriter);
		 * 
		 * String s = bReader.readLine(); while (s != null) { bWriter.write(s);
		 * bWriter.newLine(); s = bReader.readLine(); }
		 * 
		 * bReader.close(); bWriter.close();
		 */
		Thread thread = new Thread(new TestDemo());// 通过实现runnanble接口创建线程
		thread.start();

	}

	@Override
	public void run() {
		try {
			reflect01();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void reflect01() throws Exception {
		Class<?> clazz = Multiplication.class;// 通过反射获取类
		Method method = clazz.getMethod("multiplict");
		Object obj = clazz.newInstance();
		method.invoke(obj);
	}

}
