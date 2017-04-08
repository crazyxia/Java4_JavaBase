package com.it520.io01;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo {
	public static void main(String[] args) throws Exception{
		//1.创建目标对象（表示数据保存到哪一个文件）
		File f1=new File("file/stream.txt");
		
		//2.创建水管
		InputStream input=new FileInputStream(f1);//InputStream和OutputStream不能直接new
		//3.具体操作
		byte[] b1=new byte[5];//
		int len=-1;
		len=input.read(b1);
		while(len!=-1){
			String str=new String(b1,0,len);
			System.out.println(str);
		}
		//4.关闭操作
		input.close();
	}
	
}
