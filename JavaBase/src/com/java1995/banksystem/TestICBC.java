package com.java1995.banksystem;

import java.util.Scanner;

public class TestICBC {
	public static void main(String[] args){
		System.out.println("请输入密码");//用户密码录入
		Scanner sc=new Scanner(System.in);//
		String keyword=sc.nextLine();
		IICBC icbc=new ICBCImpl();//通过实现类和接口，创建一个icbc
		boolean b1=icbc.testPassword(keyword);
		if(b1){
			icbc.checkBalance();//显示余额
			System.out.println("您输入的密码正确,请输入您要取金额");
			double getmoney=sc.nextInt();//从银行里取出的钱
			icbc.drawMoney(getmoney);
		}
		else{
			System.out.println("您输入的密码不正确");
		}	
	}
}
