package com.xinan.thread02;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Account {
	private String accountNO;//
	private double balance;// 账户余额
	public Account() {// 无参构造函数
	}
	public Account(String accountNO, double balance) {
		this.accountNO = accountNO;
		this.balance = balance;
	}
}
