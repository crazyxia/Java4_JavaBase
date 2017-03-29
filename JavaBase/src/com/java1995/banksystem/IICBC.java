package com.java1995.banksystem;
/*
 * 此为工商银行银联接口
 * @author crazyxia
 *
 */
public interface IICBC extends IUnionpay{
	//在满足银联接口的规则基础上（继承了银联接口），增加了在线支付功能。
	public void onlinePay(double paymoney);

}
