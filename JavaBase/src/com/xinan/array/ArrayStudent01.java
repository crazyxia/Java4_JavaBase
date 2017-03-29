package com.xinan.array;


import java.util.Arrays;
import java.util.Scanner;

/**此程序是通过扫描键盘进行学生分数的输入，并计算平均分和排序
 * @author Administrator
 *
 */
public class ArrayStudent01 {
	 //static double sum;定义全局变量，为啥需要加static 
	public static void main(String[] args){
		int[] score=new int[10];//定义数组类型和长度
		double avg;
		
		System.out.println("请输入10个分数：");
		for(int i=0;i<score.length;i++){
			Scanner sc=new Scanner(System.in);
			score[i]=sc.nextInt();//从键盘扫描并赋值给数组
			//System.out.println("score["+i+"]="+score[i]+";");
		}
		/*double sum=0;
		for(int i=0;i<score.length;i++){
			sum=sum+score[i];
			System.out.println("第"+i+"次打印，sum和为"+sum);
		}
			avg=sum/score.length;
			System.out.println("平均数为"+avg);
			*/
			Arrays.sort(score);	//调用排序算法
			/*for(int i=0;i<score.length;i++){
				System.out.println("score["+i+"]="+score[i]+";");
			}*/
			for(int i=score.length-1;i>0;i--){
				System.out.println("score["+i+"]="+score[i]+";");
			}
	    }
}
