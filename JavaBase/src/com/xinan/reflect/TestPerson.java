package com.xinan.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestPerson {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.xinan.reflect.Person");// 获取整个类
		Field[] fs = clazz.getDeclaredFields(); // 定义可变长度的字节，存储属性
		StringBuffer sb = new StringBuffer();
		// 通过追加的方法，将每个属性拼接到此字符串中
		// 最外边的public定义
		sb.append(Modifier.toString(clazz.getModifiers()) + " class " + clazz.getSimpleName() + "{\n");
		// 里边的每一个属性
		for (Field field : fs) {
			sb.append("\t");// 空格
			sb.append(Modifier.toString(field.getModifiers()) + " ");// 获得属性的修饰符，例如public，static等等
	sb.append(field.getType().getSimpleName() + " ");// 属性的类型的名字
			sb.append(field.getName() + ";\n");// 属性的名字+回车
		}
		sb.append("}");
		
		System.out.println(sb);
		Person p = (Person) clazz.newInstance();
		Field fage = clazz.getDeclaredField("age");
		fage.setAccessible(true);
		fage.set(p, 50);
		Method method = clazz.getMethod("TestReflect");
		method.invoke(p);
		System.out.println("fage.get(obj) :" + fage.get(p));
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method1 : methods) {
			System.out.println("method : " + method1);

		}
	}

}
