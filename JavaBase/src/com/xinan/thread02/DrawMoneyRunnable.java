package com.xinan.thread02;

public class DrawMoneyRunnable implements Runnable {
	private Account account;
	private double drawAmount;

	public DrawMoneyRunnable(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}

	/*@Override
	public synchronized void run() {
		if (account.getBalance() >= drawAmount) {
			System.out.println("取钱成功，取出钱数：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
	}

	public void run() {
		synchronized (account) {
			if (account.getBalance() >= drawAmount) {
				System.out.println("取钱成功，取出钱数：" + drawAmount);
				double balance = account.getBalance() - drawAmount;
				account.setBalance(balance);
				System.out.println("余额为：" + balance);
			}
		}
	}
*/
public void run(){
	if (account.getBalance() >= drawAmount) {
		System.out.println("取钱成功，取出钱数：" + drawAmount);
		double balance = account.getBalance() - drawAmount;
		account.setBalance(balance);
		System.out.println("余额为：" + balance);
	
	}
   }
}
