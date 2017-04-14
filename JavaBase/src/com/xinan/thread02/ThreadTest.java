package com.xinan.thread02;

public class ThreadTest {
	public static void main(String[] args){
		Account account=new Account("2536",1000);
		DrawMoneyRunnable drawMoneyRunnable=new DrawMoneyRunnable(account,700);
		Thread thread1=new Thread(drawMoneyRunnable);
		Thread thread2=new Thread(drawMoneyRunnable);
		thread1.start();
		thread2.start();
	}
}
