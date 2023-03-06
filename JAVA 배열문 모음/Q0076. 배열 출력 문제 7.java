package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0076 {

	public static void main(String[] args) {
		String[][] score = new String[10][3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어 점수 :");
		int kor = scan.nextInt();
		
		System.out.print("영어 점수 :");
		int eng = scan.nextInt();
		
		System.out.print("수학 점수 :");
		int math = scan.nextInt();
		
		for(int i=0; i<score.length; i++) {
			if(kor >=(i+1)*10) {
				score[i][0] = "■";
			}else
				score[i][0] = "";
			
			if(eng >=(i+1)*10) {
				score[i][1] = "■";
			}else
				score[i][1] = "";
			
			if(math >=(i+1)*10) {
				score[i][2] = "■";
			}else
				score[i][2] = "";
		}
		

		for(int i=score.length-1; i>=0; i--) {
			for(int j=0; j<score[0].length; j++) {
				System.out.printf(" %s", score[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		System.out.println("국어\t영어\t수학");
	}//main()
	
	

}
