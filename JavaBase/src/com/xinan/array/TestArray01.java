package com.xinan.array;

/**�������ǲ����������֪ʶ
 * @author crazyxia
 *
 */
public class TestArray01 {
	
	public static void main(String[] args){
		
		/*
		 * ���������ֶ�����ʽ
		 * eg:
		 * int[] scores=new int[5];
		 * int[] scores={45,48,97,89};
		 */
		String[] scores={"oracle","java","web"};//����ĵ�һ��д���������д����String[] scores=new String{"oracle","java"};
																				//��ȷд����String[] scores=new String[] {"oracle","java","web"}
		int[] ages=new int[5];//����ĵڶ�������д��
		ages[0]=5;
		ages[1]=7;
		ages[2]=9;
		//����ı���
		for(int i=0;i<=2;i++){
			System.out.println(ages[i]);//ʹ��forѭ������������Ԫ��
		}
		
		System.out.println(scores[2]);
		System.out.println(ages[2]);
	}
}
