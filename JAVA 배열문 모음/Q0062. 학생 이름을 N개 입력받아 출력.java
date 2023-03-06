package com.test.question;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class Q0062 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("학생 수 : ");
		int input = scan.nextInt();
		
		String [] student = new String[input];
		
		for(int i=0; i<student.length; i++) {
			
			System.out.print("학생명 : ");
			student[i] = scan.next();
			
		}
		System.out.printf("입력한 학생은 총 %d명입니다.\n", input);
		
		Arrays.sort(student);
		
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d. %s\n", i+1, student[i]);
		}
	}

}
