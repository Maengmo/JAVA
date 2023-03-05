package com.test.question;

import java.util.Scanner;

public class Q0038 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		input();
		

	}
	
	public static void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 횟수 : ");
		int InNum = scan.nextInt();
		
		int sum1 = 0; //홀수 합산
		int sum2 = 0; //짝수 합산
		
		int	num1 = 0; //홀수 갯수
		int num2 = 0; //짝수 갯수
		
		for(int i=0; i<InNum; i++) {
			System.out.print("숫자 : ");
			int num = scan.nextInt();
			if(num%2 == 0) {
				sum2 += num;
				num2++;
			}else if(num%2 != 0) {
				sum1 += num;
				num1++;
			}
		}
		System.out.printf("짝수 %d개의 합: %d\n", num2, sum2);
		System.out.printf("홀수 %d개의 합: %d", num1, sum1);
		
	}

}
