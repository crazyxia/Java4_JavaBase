package com._520it.thread;

/**
 * 此为通过继承方式创建线程
 * @author crazyxia
 *
 */
public class ExtendThreadDemo extends Thread{

	@Override
	public void run() {//重写run方法
		for (int i=0;i<100;i++){
			System.out.println("当前线程"+Thread.currentThread().getName()+i);
		}
	}
	
}
