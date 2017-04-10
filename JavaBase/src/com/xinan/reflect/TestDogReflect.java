package com.xinan.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestDogReflect {
	public static void main(String[] args) throws Exception {
		// Class clazz=Class.forName("com.xinan.reflect.Dog");//第一种获取类的方式
		// Class clazz1=Person.class;//第二种获取类的方式
		Class clazz2 = (new Person().getClass());//第三种获取类的方式
		// Field fs = clazz2.getDeclaredField("name");
		Field[] fs = clazz2.getDeclaredFields();
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(clazz2.getModifiers()) + " class " + clazz2.getSimpleName() + "{\n");
		for (Field f1 : fs) {
			sb.append("\t");// 空格
			sb.append(Modifier.toString(f1.getModifiers()) + " ");// 获得属性的修饰符，例如public，static等等
			sb.append(f1.getType().getSimpleName() + " ");// 属性的类型的名字
			sb.append(f1.getName() + ";\n");// 属性的名字+回车
		}
		sb.append("}");
		System.out.println(sb);
		Constructor<?> cons[] = clazz2.getConstructors();
		Method[] methods = clazz2.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("me:" + method);
		}
	}
}
