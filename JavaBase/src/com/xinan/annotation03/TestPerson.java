package com.xinan.annotation03;

import java.lang.reflect.Field;


public class TestPerson {
	public static void main(String[] args) throws Exception{
		Class clazz=Person.class;//获取类
		Person person=(Person)clazz.newInstance();//创建对象
		System.out.print("改变前的值");
		person.showInfo();
		Field[] fs = clazz.getDeclaredFields();//获取所有的属性
		for(Field f1:fs){    //遍历获取所有的属性
			if(f1.isAnnotationPresent(HiWorld.class)){
				HiWorld annotation=f1.getAnnotation(HiWorld.class);
				//System.out.println(f1);
				System.out.println(annotation);
				f1.setAccessible(true);
				
				f1.set(person, annotation.value());
				System.out.print("改变后的值");
				person.showInfo();
		}	
		}
		
		
	}
}
