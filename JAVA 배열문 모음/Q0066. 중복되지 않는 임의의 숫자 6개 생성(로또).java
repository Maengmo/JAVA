package com.test.question;

import java.util.Random;

public class Q0066 {

	public static void main(String[] args) {
		
		int [] rotto = new int [6];
		Random rd = new Random();
		
		String result = "";
		
		for(int i=0; i<rotto.length; i++) {
			
			rotto[i] = rd.nextInt(45)+1;
			
				for(int j=0; j<i; j++) {
					if(rotto[j]==rotto[i]) {
						i--;
						break;
					}
				}
		}
			
			result = "[";
			
			for(int k=0; k<rotto.length; k++) {
				result += rotto[k] +",";
			}
			result += "]";
		
		System.out.println(result);

	}

}
