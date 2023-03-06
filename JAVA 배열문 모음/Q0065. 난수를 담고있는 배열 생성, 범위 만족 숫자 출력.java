package com.test.question;

import java.util.Scanner;

public class Q0065 {
	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			int[] random = new int[20];
			int max = 0;
			int min = 0;
			
			String result = "원본 : ";
			String result2 = "결과 : ";
			
			for(int i=0; i<random.length; i++) {
				
				double a = Math.random()*20;
				random[i] = (int)a;
				
				result += random[i] + ", ";
				
			}
			
			System.out.print("최대 범위 : ");
			max = scan.nextInt();
			System.out.print("최소 범위 : ");
			min = scan.nextInt();
			
			
			for(int i=0; i<random.length; i++) {
				
				if(min<=random[i] && random[i]<=max) {
					result2 += random[i] + ", ";
				}
				
			}
			System.out.println(result);
			System.out.println(result2);
	}
}
