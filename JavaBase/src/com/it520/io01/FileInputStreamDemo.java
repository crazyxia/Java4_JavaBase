package com.it520.io01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException{
		//定义一个file对象
		File f1=new File("poweroff.txt");
		File f2=new File("copy.txt");
		System.out.println(f1.getAbsolutePath());
		//定义流对象
		InputStream fis=new FileInputStream(f1);
		OutputStream fos=new FileOutputStream(f2);
		//流操作
		byte[] b1=new byte[5];//数组中需要定义长度
		int len=0;
		//len=fis.read(b1);
		while(len!=-1){
			len=fis.read(b1);
			//String str=new String(b1,0,len);
			//System.out.println(str);
			fos.write(b1, 0, len);		
		}
		System.out.println();
		//关闭流操作
		fis.close();
		fos.close();
	}
}
