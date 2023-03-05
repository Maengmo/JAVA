package com.test.question;

import java.util.Scanner;

public class Q0048 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum1 = 0; //홀수의 합
		int sum2 = 0; //짝수의 합
		
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		
		while(num > 0) {
			
			if (num % 10 % 2 == 0) { //10으로 나누고 2로 나눠지면 짝수
				sum2 += num%10;
			} else {	//그렇지 않으면 홀수
				sum1 += num%10;
			}
			
			num /= 10;
		}
		
		System.out.printf("짝수의 합 : %d\n", sum2);
		System.out.printf("홀수의 합 : %d\n", sum1);
		
	}

}
