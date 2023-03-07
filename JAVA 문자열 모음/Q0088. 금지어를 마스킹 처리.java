package com.test.question;

import java.util.Scanner;

public class Q0088 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = "바보";
		String word2 = "멍청이";
		
		int count = 0;
		int index = -1;
		
		System.out.print("입력 : ");
		String result = scan.nextLine();
		
			
			while(true) {
				index = result.indexOf(word, index);
				
				if(index > -1) {
					count++;
					index = index + word.length(); 
				}else {
					break;
				}
			}
			
			while(true) {
				index = result.indexOf(word2, index);
					
				if(index > -1) {
					count++;
					index = index + word2.length(); 
				}else {
					break;
				}	
			}
			result = result.replace("바보", "**");
			result = result.replace("멍청이", "**");
			
			System.out.println(result);
			System.out.printf("금지어를 %d회 마스킹했습니다." , count);
			

	}

}
