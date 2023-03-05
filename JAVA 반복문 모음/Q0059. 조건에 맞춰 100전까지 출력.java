package com.test.question;

public class Q0059 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 1;
		
		String result = "";
		
		for(int i=1; ; i++) {
			
			
			result += num + " + ";
			num += i;
			
			
			if (num>=100) {
				break;
				
			}else {sum += num;
			
			}
			
		}
		System.out.println(result+" = "+sum);

	}

}
