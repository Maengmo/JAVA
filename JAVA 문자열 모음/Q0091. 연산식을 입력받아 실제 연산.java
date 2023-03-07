package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0091 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input = scan.nextLine();
		
		String [] middle = input.split(" ");
		
		if(middle.length < 3) {
			System.out.println("피연산자가 부족합니다.");
		}
		
		if(inspect(middle[1]).equals("false")) {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		else {
		int n1 = Integer.parseInt(middle[0]);
		int n2 = Integer.parseInt(middle[2]);
		
		int sum = oper(n1,n2,middle[1]);
		
		System.out.printf("%d %s %d = %d", n1, middle[1], n2, sum);
		}
	}
	
	public static int oper(int n1, int n2, String s ) {
		
		int sum = 0;
		if(s.equals("+")){
			return n1 + n2;
		}else if(s.equals("-")){
			return n1 - n2;
		}else if(s.equals("*")){
			return n1 * n2;
		}else if(s.equals("/")){
			return n1 / n2;
		}else if(s.equals("%")){
			return n1 % n2;
		}return 0;
		
	}
	
	public static String inspect(String s) {
		
		if(s.equals("+")) {
			return "+";
		}else if(s.equals("-")) {
			return "-";
		}else if(s.equals("*")) {
			return "*";
		}else if(s.equals("/")) {	
			return "/";
		}else if(s.equals("%")) {
			return "%";
		}else {
			return "false";
		}
	}

}
