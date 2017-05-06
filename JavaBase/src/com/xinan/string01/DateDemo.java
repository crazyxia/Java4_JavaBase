package com.xinan.string01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		Date d1=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		System.out.println(ft.format(d1));
	}
}
