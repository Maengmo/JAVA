package com.test.question;

import java.util.Scanner;

public class Q0037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		for(int i=1; i <= num; i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d = %d", num, sum);
	}

}
