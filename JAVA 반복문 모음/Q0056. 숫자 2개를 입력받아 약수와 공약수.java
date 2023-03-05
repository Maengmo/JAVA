package com.test.question;

import java.util.Scanner;

public class Q0056 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String result1 = "";
		String result2 = "";
		String result3 = "";
		
		System.out.print("첫번째 숫자 : ");
		int FirstNum = scan.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int TwoNum = scan.nextInt();
		
		for(int i=1; i<=FirstNum; i++) {
			
			if(FirstNum%i==0) {
				result1 += i+ ", ";
			}
			
		}//첫번째 숫자의 최대 공약수
	
		for(int i=1; i<=TwoNum; i++) {
			
			if(TwoNum%i==0) {
				result2 += i+ ", ";
			}
			
		}//두번째 숫자의 최대 공약수
		
		for(int i=1; i<=FirstNum*TwoNum; i++) {
			
			if(FirstNum%i==0&&TwoNum%i==0) {
				result3 += i+", ";
			}
		}//두수의 공약수
		
		System.out.printf("%d의 약수 : %s\n", FirstNum, result1);
		System.out.printf("%d의 약수 : %s\n", TwoNum, result2);
		System.out.printf("%d와 %d의 공약수 : %s\n", FirstNum, TwoNum, result3);
		
	}

}
