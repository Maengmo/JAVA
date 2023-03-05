package com.test.question;

public class Q0054 {

	public static void main(String[] args) {
		//2~100 사이의 소수를 구하시오.
		boolean check = false;
		
		for(int i=2; i<=100; i++) {
			
			check = false;
			
			for (int j=2; j<i; j++) {
				if(i%j==0) {
					check = true;
					break;
				}
			}
			
			if(check==false) {
				System.out.print(i + ",");
			}
		}
		
	}

}
