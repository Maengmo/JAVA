package com.test.question;

import java.util.Scanner;

public class Q0035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("횟수 : ");
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}

	}

}
