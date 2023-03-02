package com.test.question;

public class Q0012 {

	public static void main(String[] args) {
		getNumber(5);

	}
	
	public static void getNumber(int num) {
		
		String result = num/2 == 0 ? "짝수" : "홀수";
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다 \n", num, result);
		
	}

}
