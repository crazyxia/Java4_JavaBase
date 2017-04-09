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
		final int BUFFER_SIZE=1024;//定义数组常量，便于修改
		File f1=new File("123.avi");
		File f2=new File("copy.avi");
		System.out.println(f1.getAbsolutePath());
		//定义流对象
		InputStream fis=new FileInputStream(f1);
		OutputStream fos=new FileOutputStream(f2);
		//流操作
		byte[] b1=new byte[BUFFER_SIZE];//数组中需要定义长度
		int len=0;
		len=fis.read(b1);
		while(len!=-1){
			//String str=new String(b1,0,len);
			//System.out.println(str);
			fos.write(b1, 0, len);		
			len=fis.read(b1);
			/*fos.write(b1, 0, len);		
			len=fis.read(b1);
			注意这两句话的顺序，写反了容易出现问题，
			因为前面len=fis.read(b1)已经做了一次读操作了*/
		}
		System.out.println();
		//关闭流操作
		fis.close();
		fos.close();
	}
}
