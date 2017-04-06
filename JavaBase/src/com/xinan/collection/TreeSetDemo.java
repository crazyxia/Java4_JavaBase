package com.xinan.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args){
		TreeSet<Student> treeSet=new TreeSet<Student>();
		treeSet.add(new Student("张三",25));
		treeSet.add(new Student("李四",28));
		treeSet.add(new Student("王五",23));
		//System.out.println("使用iterator循环遍历");
		Iterator<Student> iter=treeSet.iterator();
		while(iter.hasNext()){
			Student student=iter.next();
			System.out.println(student);
		}	
	}
}
