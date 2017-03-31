package com.xinan.collection;


/**
 * 这是一个ArrayList
 * @author crazy
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String[] args){
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("H");
	list1.add("E");
	list1.add("L");
	list1.add("L");
	list1.add("O");
	System.out.println(list1);//打印输出
	Iterator<String> iter=list1.iterator();//使用iterator进行遍历
	while(iter.hasNext()){
		System.out.println(iter.next());
	}
	System.out.println("这是通过iterator进行的循环");
	/*for(String string: list1){//使用增强for循环，遍历元素
		System.out.println(string);
	}
	list1.add(0, "Ilove");//在特定位置增加元素
		System.out.println("这是增加完Ilove之后打印的"+list1);
	*/
	list1.remove(1);//通过索引删除
	System.out.println("remove后的集合"+list1);
	System.out.println(list1.size());
	}
}
