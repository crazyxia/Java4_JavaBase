package com.xinan.io;

import java.io.File;
import java.io.IOException;

public class TestFile01 {
	public static void main(String[] args) throws IOException{
		File f1=new File("java宝典0");//创建新的file对象
		System.out.println(f1);
		System.out.println(f1.getAbsolutePath());
		if(!f1.exists()){
			f1.createNewFile();//这个需要是空括号，执行创建新文件的功能
		}else{
			f1.delete();
		}
	}
}
