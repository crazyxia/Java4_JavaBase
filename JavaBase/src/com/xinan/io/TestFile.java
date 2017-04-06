package com.xinan.io;

import java.io.File;
import java.util.Date;

public class TestFile {
	public static void main(String[] args) {
		File f1 = new File("a.jpg");
		File f2 = new File("D:/temp/");
		System.out.println("Name:" + f1.getName());
		System.out.println("Path:" + f1.getPath());
		System.out.println("AbsolutePath:" + f1.getAbsolutePath());
		System.out.println("Parent:" + f1.getParent());// what's meaning
		System.out.println("lastModified:" + new Date(f1.lastModified()));// 几个意思
		System.out.println("length:" + f1.length());
		System.out.println("exists:" + f1.exists());
		System.out.println("canRead:" + f1.canRead());
		System.out.println("isFile:" + f1.isFile());
		System.out.println("isHidden:" + f1.isHidden());
		System.out.println("isDirectory:" + f1.isDirectory());
		System.out.println("isAbsolute:" + f1.isAbsolute());
		System.out.println("length:" + f1.length());
		f1.delete();
	}
}
