package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호 : ");
		String number = scan.nextLine();
		
		int sum = 0;
		
		number=number.replace("-", "");
		
	
		for(int i=0; i<12; i++) {
			sum += Integer.parseInt(number.substring(i, i+1))* (i%8+2);
		}
		
		sum %= 11;
		int result = 11-(sum%10);
		
		System.out.println(result);
		
		if(result==Integer.parseInt(number.substring(number.length()-1, number.length()))) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
		

	}

}
