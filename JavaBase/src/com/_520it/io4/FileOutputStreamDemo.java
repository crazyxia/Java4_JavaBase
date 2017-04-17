package com._520it.io4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 文件字节输出流
 * @author crazyxia
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		//创建目标对象
		File target=new File("file/stream.txt");
		//创建文件字节输出流对象
		OutputStream out=new FileOutputStream(target,true);
		//
		out.write("will".getBytes(),5,4);
		
		out.close();
	}
}
