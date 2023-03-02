package com.test.question;

public class Q0010 {

	public static void main(String[] args) {
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
	}

	public static void digit(int num) {
		
		String result = "";
		
		result = (num < 10) ? "000" + num : (num < 100) ? "00" + num : (num < 1000) ? "0" + num : num+"";
		
		System.out.printf("%s\n", result);
		
	}

}
