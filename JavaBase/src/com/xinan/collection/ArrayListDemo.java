package com.xinan.collection;


/**
 * 这是一个ArrayList
 * @author crazy
 *
 */
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args){
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("H");
	list1.add("E");
	list1.add("L");
	list1.add("L");
	list1.add("O");
	System.out.println(list1);//打印输出
	for(String string: list1){//使用增强for循环，遍历元素
		System.out.println(string);
	}
	list1.add(0, "Ilove");//在特定位置增加元素
		System.out.println("这是增加完Ilove之后打印的"+list1);
	
	}
}
