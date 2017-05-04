package com.xinan.string01;

public class StringDemo01 {
	public static void main(String[] args) {
		String fileNames = "abc.java;hello.will.txt;hello.java;hello.class";
		/*
		 * String s1 = new String("abcd");
		 * 
		 * System.out.println(s == s1); System.out.println(s.trim());
		 * System.out.println(s.replace('a', 'b'));
		 * System.out.println(s.indexOf('b')); System.out.println(s.length());
		 * 
		 * System.out.println(s.charAt(5)); System.out.println(s.isEmpty());
		 * System.out.println(s.indexOf('a'));
		 */
		String[] names = fileNames.split(";");
		for (String name : names) {
			if (name.startsWith("hello")) {
				int index = name.lastIndexOf(".");
				String newName = name.substring(index);
				System.out.println(newName);
			}
		}
	}

}
