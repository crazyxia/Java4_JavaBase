package com.xinan.io01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args){
		try{
			
			FileOutputStream fos=new FileOutputStream("hello");
			//System.out.println();
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(new Person(1,"刘能","1234"));
			oos.writeObject(new Person(2,"赵四","2345"));
			oos.close();//关闭流操作
			System.out.println("copy ok了，大傻子");
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
}
