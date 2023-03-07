package com.test.question;

import java.util.Scanner;

public class Q0087 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어 : ");
		String word = scan.nextLine();
		
		for(int i=0; i<word.length(); i++) {
			
			char search = word.charAt(i);
			
			if(search >= 'A' && search <= 'Z' && i != 0) {
				System.out.print(" ");
				
			}
			System.out.print(search);
		}
		
		
		

	}

}
