package com.xinan.array;

/**
 * 这是一个求学生成绩数组方法
 * @author Administrator
 *
 */
public class ArrayStudentScore {
	public static void main(String[] args){
	int[] score={89,96,95,97,93};//第一种赋值方式
	int sum = 0;
	double avg=0;
	/*int[] score=new int[]{89,96,95,97,93};//另一种数组赋值方式，[]中不能指定数组的长度*/	
	for(int i=0;i<score.length;i++){
		 sum=sum+score[i];
		 avg=sum/score.length;
	 }
	System.out.println("sum "+sum+",avg "+avg);
}}
