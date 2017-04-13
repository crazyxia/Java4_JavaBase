package com.xinan.thread01;

/**
 * 通过直接继承Thread实现创建线程，重写run()方法
 * @author Administrator
 *
 */
public class MyThread extends Thread {
	private int i=0;
	@Override
	public void run() {
		for(i=0;i<100;i++){											//其返回对当前正在执行的线程对象的引用。
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
	
}
