package com.java1995.banksystem;

/*
 * 此为银联接口
 * @author crazyxia
 *
 */
public interface IUnionpay {
	public boolean testPassword(String word);//定义密码检测的抽象方法
	public double checkBalance();//定义查询余额的抽象方法
	public boolean drawMoney();//定义取钱的抽象方法	
	
	
}
