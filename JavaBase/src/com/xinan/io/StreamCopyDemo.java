package com.xinan.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class StreamCopyDemo {
	public static void main(String[] args) throws IOException{
		File srcFile = new File("file/stream.txt");//创建源和目标
		File destFile=new File("file/stream_copy.txt");
		InputStream in=new FileInputStream(srcFile);//创建输入的管道（输入流和输出对象）
		OutputStream out=new FileOutputStream(destFile);
		byte[] buffer=new byte[10];//创建容量为10的缓冲区（存储已经读取的字节数据）
		int len=-1;//表示已经读取了多少个字节数，
		while((len=in.read(buffer))!=-1){
			out.write(buffer,0,len);
		}
		in.close();//关闭管道
		out.close();
	}
}
