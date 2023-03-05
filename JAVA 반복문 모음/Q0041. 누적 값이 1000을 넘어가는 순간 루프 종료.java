package com.test.question;

import java.util.Scanner;

public class Q0041 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		String oper = "";
		
		System.out.print("시작 숫자를 입력하세요 : ");
		int StartNum = scan.nextInt();
		
		for(int i=StartNum; i <= Integer.MAX_VALUE; i++) {
			
			if(sum<1000) {
				sum += i;
				oper += i + " + " ;
			}else if(sum>1000) {
				oper = oper.substring(0, oper.length()-3); //마지막 + 연산자를 제거하기 위해 substring 메소드를 통하여 제거
				break;
			}
			
		}
		System.out.println(oper + " = " + sum);

	}

}
