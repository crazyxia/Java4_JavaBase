package com._520it.thread;

/**
 * 测试通过实现runnable接口完成的线程
 * 
 * @author crazyxia
 *
 */
public class TestImplementsRunnable {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println("当前线程：" + Thread.currentThread().getName());
			if(i==10){
				/*Runnable ThreadDemo=new ImplementRunnableThreadDemo(); //class ThreadDemo=
				                                                       //new ImplementRunnableThreadDemo();
																	   //创建一个接口的实现类
				Thread threadRunnableDemo=new Thread(ThreadDemo);*/
				Thread threadRunnableDemo=new Thread(new ImplementRunnableThreadDemo());
				threadRunnableDemo.start();
				
			}
		}
	}

}
