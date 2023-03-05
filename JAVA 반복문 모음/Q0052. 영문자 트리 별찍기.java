package com.test.question;

import java.util.Scanner;

public class Q0052 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행 : ");
		int hang = scan.nextInt();
		

		
		for(int i=0; i<=hang; i++) {
			
			for(int j=0; j<hang-i; j++) {
				System.out.print(" ");
			}
			
			char c = 'a';
			
			for(int j=0; j<i*2/2; j++) {
				System.out.print(c);
				c++;
			}
			
			for(int j=0; j<i*2/2; j++) {
				c--;
				System.out.print(c);
			}
			System.out.println();
			
		}

	}

	

}
