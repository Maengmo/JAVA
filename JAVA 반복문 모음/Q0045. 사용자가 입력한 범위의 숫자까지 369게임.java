package com.test.question;

import java.util.Scanner;

public class Q0045 {

	public static void main(String[] args) {
		
		String result = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("최대 숫자 : ");
		int num = scan.nextInt();
		
		for(int i=1; i<num; i++) {
			
			result += checkNum(i) + " ";
			
		}
		
		System.out.print(result);

	}//main()
	
	public static String checkNum(int a) {
		
		int n = a;
		String n2 = String.valueOf(a); //int 형을 String 형으로 변경
			
			if((n>30 && n%30==3) || (n>30 && n%30==6) || (n>30 &&n%30==9)) {
			return "짝짝";
			}else 	if(n % 10 % 3 == 0 && n % 10 != 0) {
				return "짝";
			}else if (n/10 ==3 || n/10 ==6 || n/10 ==9){
				return "짝";
			}else {
				return n2;
		}
	}
}
