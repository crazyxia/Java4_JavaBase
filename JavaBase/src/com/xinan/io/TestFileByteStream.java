package com.xinan.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteStream {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("sun.jpg");
			FileOutputStream fos = new FileOutputStream("sun.jpg");
			int read = fis.read();
			while (read != -1) {
				fos.write(read);
				read = fis.read();
			}
			fis.close();
			fos.close();
			System.out.println("Copy Success!");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Copy Success!");
		}
	}
}
