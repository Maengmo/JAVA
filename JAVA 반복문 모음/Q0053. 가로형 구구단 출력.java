package com.test.question;

import java.util.Scanner;

public class Q0053 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=2; i<3; i++) {
			
			for(int j=1; j<10; j++) {
				System.out.printf("%d x %d = %2d  ", i, j, (i+1)*j);
				System.out.printf("%d x %d = %2d  ", i+1, j, (i+1)*j);
				System.out.printf("%d x %d = %2d  ", i+2, j, (i+2)*j);
				System.out.printf("%d x %d = %2d\n", i+3, j, (i+3)*j);
			}
			
		}System.out.println();

		for(int i=6; i<7; i++) {
			
			for(int j=1; j<10; j++) {
				System.out.printf("%d x %d = %2d  ", i, j, i*j);
				System.out.printf("%d x %d = %2d  ", i+1, j, (i+1)*j);
				System.out.printf("%d x %d = %2d  ", i+2, j, (i+2)*j);
				System.out.printf("%d x %d = %2d\n", i+3, j, (i+3)*j);
			}
		}
	}
		

}
