package com.xinan.array;

/**本程序是测试数组相关知识
 * @author crazyxia
 *
 */
public class TestArray01 {
	
	public static void main(String[] args){
		
		/*
		 * 数组有两种定义形式
		 * eg:
		 * int[] scores=new int[5];
		 * int[] scores={45,48,97,89};
		 */
		String[] scores={"oracle","java","web"};//数组的第一种写法，其错误写法：String[] scores=new String{"oracle","java"};
																				//正确写法：String[] scores=new String[] {"oracle","java","web"}
		int[] ages=new int[5];//数组的第二种数组写法
		ages[0]=5;
		ages[1]=7;
		ages[2]=9;
		//数组的遍历
		for(int i=0;i<=2;i++){
			System.out.println(ages[i]);//使用for循环遍历数组中元素
		}
		
		System.out.println(scores[2]);
		System.out.println(ages[2]);
	}
}
