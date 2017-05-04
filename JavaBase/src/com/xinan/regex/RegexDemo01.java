package com.xinan.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo01 {

	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub String content
		 * ="i am noob"+"from runoo0b.com."; String pattern=".*runoob.*";
		 * boolean isMatch=Pattern.matches(pattern, content);
		 * System.out.println(isMatch);
		 */
		/*String str = "service@crazyjava.net";
		String regEx = "^[a-zA-Z_]{1,}[0-9]{0,}@(([a-zA-z0-9]-*){1,}\\.){1,3}[a-zA-z\\-]{1,}$ ";// 此处写匹配规则
	*/	Pattern p = Pattern.compile("\\d{4}");
		Matcher m = p.matcher("hello235216asdasdas48512");
		/*System.out.println(m.matches());// 匹配所有
		System.out.println(m.find());// 匹配所有
	*/	while(m.find()){
			System.out.println(m.group());
		}
	}

}
