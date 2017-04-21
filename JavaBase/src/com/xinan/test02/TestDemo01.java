package com.xinan.test02;

public class TestDemo01 {
	public static void main(String[] args) {
		Thread thread = new Thread(new TestDemo());// 通过实现runnanble接口创建线程
		thread.start();
	}
}