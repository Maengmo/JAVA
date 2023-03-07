package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0089 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 범위(원) : 0 ~ 99,999,999");
		System.out.print("금액(원) : ");
	
		String money = scan.nextLine();
		
		String result2 = "";
		
		int [] result = new int [money.length()];
		
		for(int i=0; i<money.length(); i++) {
			
			result[i] = money.charAt(i)-48;
			
		}
		for(int i=0; i<=result.length-1; i++) {
			//7~0
			if(i==result.length-1) {
				result2 += number(result[i]) + "원";
			}else if(i==result.length-2){
				result2 += number(result[i]) + "십";
			}else if(i==result.length-3) {
				result2 += number(result[i]) + "백";
			}else if(i==result.length-4) {
				result2 += number(result[i]) + "천";
			}else if(i==result.length-5) {
				result2 += number(result[i]) + "만";
			}else if(i==result.length-6) {
				result2 += number(result[i]) + "십";
			}else if(i==result.length-7) {
				result2 += number(result[i]) + "백";
			}else if(i==result.length-8) {
				result2 += number(result[i]) + "천";
			}else {
				System.out.println("오류발생");
				break;
			}
			
		}

		System.out.println(result2);
	}

	public static String number(int num) {
		
		if(num==1) {
			return "일";
		}else if(num==2) {
			return "이";
		}else if(num==3) {
			return "삼";
		}else if(num==4) {
			return "사";
		}else if(num==5) {
			return "오";
		}else if(num==6) {
			return "육";
		}else if(num==7) {
			return "칠";
		}else if(num==8) {
			return "팔";
		}else if(num==9) {
			return "구";
		}return "";
		
	}
	

		
		
	
}
