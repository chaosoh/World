package com.webapp.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	
	/*
	 * 문자열 검색, 대체, 추출 ==> 정규표현식(Regular Expression)
	 * 
	 * . ==> new line문자를 제외한 모든 문자
	 * ^ ==> Line start
	 * $ ==> Line end
	 * * ==> 앞문자가 0개 이상 반복
	 * + ==> 앞문자가 1개 이상 반복
	 * [AYZ] ==> A,Y,Z 중 한글자만...
	 * [A-Z] ==> A ~ Z 사이 한글자만
	 * {n}   ==> 앞문자가 n개반복
	 * {n,}  ==> 앞문자가 n개 이상 반복
	 * {n,m} ==> 앞문자가 n<=갯수<=m
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String regex = "^.$";
		regex = "^A+$";
		regex = "^[AYZ]$";
		regex = "^[A-Z0-9]{3}$";
		regex = "^[A-Z0-9]{3,5}$";
		regex = "^[가-힣]{3,5}$";
		regex = "[A-Za-z]{3}";
		regex = "^[0-9]{3}[0-9]{4}$";		// 010-111-2222
		regex = "^/d{3}/-/d{4}/-/d{4}$";
		while(true) {
			String line = scan.nextLine();
			System.out.println("line = ["+line+"]");
			Pattern pattern = Pattern.compile(regex);
			Matcher m = pattern.matcher(line);
			System.out.println("match = "+m.find());
			//System.out.println("match = "+Pattern.matches(regex, line));
		}
		
	}

}
