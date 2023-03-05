package com.test.question;

import java.util.Scanner;

public class Q0044 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		String oper = "";
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<= Integer.MAX_VALUE; i++) {
			
			if(sum<100) {
				
				System.out.print("숫자 : ");
				num = scan.nextInt();
				
				if(num%2==1) {
					sum -= num;
					oper += "-" + num ;
				
				}else if(num%2==0) {
					sum += num;
					oper += "+" + num;
				}
			}else if(sum>=100) {
				break;
			}
		}
		System.out.println(oper + " = " + sum);

	}

}
