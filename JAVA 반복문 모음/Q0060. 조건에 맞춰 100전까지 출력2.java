package com.test.question;

public class Q0060 { 

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		
		int oper = 0;
		int sum = 1;
		
		String result = "";
		
		while(true) {
			
			oper = num1+num2;
			
			if(oper>100) {
				break;
			}
			
			sum += oper;
			result += oper + " + ";
			
			num1 = num2;
			num2 = oper;
			
		}
		System.out.println("1 + " + result+" = "+sum);
	}

}
