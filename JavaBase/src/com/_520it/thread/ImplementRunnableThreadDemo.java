package com._520it.thread;

/**通过实现runnable接口创建线程
 * @author crazyxia
 *
 */
public class ImplementRunnableThreadDemo implements Runnable {

	@Override
	public void run() {//重写run方法
		for(int i =0;i<100;i++){
			System.out.println("当前线程为"+Thread.currentThread().getName()+i);
		}
		
		
	}
	
}
