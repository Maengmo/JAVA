package com.test.question;

import java.util.Scanner;

public class Q0030 {

	public static void main(String[] args) {
		//요구사항 : 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영문자 1개를 입력하세요 : ");
		String input = scan.next();
		
		char word = input.charAt(0);
		int wordNum = (int)word;
		
		//a=97 z= 122 A=65 Z=90
		
		if(wordNum>=97&&wordNum<=122) {
			wordNum -= 32;
			System.out.printf("'%s'의 대문자는 '%s'입니다.", word, (char)wordNum);
		}else if(wordNum>=65&&wordNum<=90) {
			wordNum += 32;
			System.out.printf("'%s'의 소문자는 '%s'입니다.", word, (char)wordNum);
		}else {
			System.out.println("영문자만 입력하세요.");
		}
		

	}

}
