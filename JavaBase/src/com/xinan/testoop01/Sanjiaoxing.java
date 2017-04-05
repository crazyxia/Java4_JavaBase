package com.xinan.testoop01;

public class Sanjiaoxing {
	public static void main(String[] args){
		int num=5;
		for(int i=0;i<num;i++){
			for(int j=1;j<(5-i);j++){
				System.out.print(" ");
			}
			for(int k=0;k<(2*i+1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
