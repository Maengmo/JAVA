package com.test.question;

public class Q0055 {

	public static void main(String[] args) {
		
		int sum = 0;
		String result = "";
		
		for(int i=1; i<=100; i++) {
			
			sum = 0;
			result = "";
			
			for (int j=1; j<i; j++) {
				
				if(i%j==0) {
					sum += j;
					result += j + ","; 
				}
				
			}
			if(sum==i) {
				System.out.printf("%d = [%s]\n", i, result);
			}
		}

	}

}
