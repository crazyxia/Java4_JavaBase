package com.xinan.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建源
		File f=new File("D:/GitHub/Java4_JavaBase/JavaBase/IOTest.txt");
		//创建输入流对象
		InputStream in=new FileInputStream(f);
		
		byte[]  buffer=new byte[5];
		int len=-1;
		while((len=in.read(buffer))!=-1){
			String str=new String(buffer,0,len);
			System.out.println(str);
		}
		in.close();
	}

}
