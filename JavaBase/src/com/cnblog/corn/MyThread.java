package com.cnblog.corn;

/**
 * 通过继承thread类，重写thread的run方法
 * @author crazyxia
 *
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+""+i);
		}
	}
	
}
