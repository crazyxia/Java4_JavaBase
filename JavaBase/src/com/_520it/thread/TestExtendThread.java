package com._520it.thread;

/**
 * 测试通过继承方式实现的线程
 * @author crazyxia
 *
 */
public class TestExtendThread {
	public static void main(String[] args){
		System.out.println("当前线程为"+Thread.currentThread().getName());
		for(int i=0;i<100;i++){
			System.out.println("当前线程为"+Thread.currentThread().getName()+i);
			if(i==50){
			Thread etd=new ExtendThreadDemo();
			etd.start();
			}
		}
	}
}
