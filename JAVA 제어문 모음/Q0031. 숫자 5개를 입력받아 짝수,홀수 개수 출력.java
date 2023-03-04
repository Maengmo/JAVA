package com.test.question;

import java.util.Scanner;

public class Q0031 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum1 = 0; //홀수
		int sum2 = 0; //짝수
		
		System.out.print("첫번째 숫자 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.print("세번째 숫자 입력 : ");
		int num3 = scan.nextInt();
		
		System.out.print("네번째 숫자 입력 : ");
		int num4 = scan.nextInt();
		
		System.out.print("다섯번째 숫자 입력 : ");
		int num5 = scan.nextInt();
		
		if(num1 % 2 == 0) {
			sum2++;
		}else if(num1 % 2 ==1) {
			sum1++;
		}
		
		
		if(num2 % 2 == 0) {
			sum2++;
		}else if(num2 % 2 ==1) {
			sum1++;
		}
		
		if(num3 % 2 == 0) {
			sum2++;
		}else if(num3 % 2 ==1) {
			sum1++;
		}
		
		if(num4 % 2 == 0) {
			sum2++;
		}else if(num4 % 2 ==1) {
			sum1++;
		}
		
		if(num5 % 2 == 0) {
			sum2++;
		}else if(num5 % 2 ==1) {
			sum1++;
		}
		
		if(sum1 > sum2) {
			System.out.printf("짝수는 %d개, 홀수는 %d개 입력했습니다.\n", sum2, sum1);
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", (sum1-sum2));
		}else if(sum1 < sum2) {
			System.out.printf("짝수는 %d개, 홀수는 %d개 입력했습니다.\n", sum2, sum1);
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", (sum2-sum1));
		}
		
	}

}
