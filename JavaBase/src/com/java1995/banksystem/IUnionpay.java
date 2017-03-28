package com.java1995.banksystem;

/*
 * 此为银联接口
 * @author crazyxia
 *
 */
public interface IUnionpay {
	public void testPassword(String keyword);//定义密码检测的抽象方法
	public void drawMoney(double money);//定义取钱的抽象方法	
	public void checkBalance(double balance);//定义查询余额的抽象方法
	
	
}
