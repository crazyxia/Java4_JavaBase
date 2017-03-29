package com.java1995.banksystem;

/**工商银行的实现类
 * @author crazyxia
 *
 */
public class ICBCImpl implements IICBC {
	//定义实现类，重写方法
	double money=10000;//定义余额初始值
	double number;//取钱数目
	double paymoney;//支付金额
	public boolean testPassword(String word){
		String str1="nihao";//默认密码
		if(str1.equals(word)){			
			return true;
		}else{	
			return false;//如果密码错误，使用return结束方法运行
		}
	}
	public double checkBalance(){//查看余额的方法
		System.out.println("您的余额为"+money);//返回余额值
		return money;
	}
	public boolean drawMoney(double number){//取钱的方法
		if(money>=number){
			money=money-number;
			System.out.println("余额为"+money);
			return true;
		}else{
			System.out.println("余额不足");
			return false;
		}
	}
	public void onlinePay(double paymoney){
		if(money>=paymoney){
			money=money-paymoney;
			System.out.println("余额为"+money);
			
		}else{
			System.out.println("支付余额不足");
			
		}
	}
	

}
