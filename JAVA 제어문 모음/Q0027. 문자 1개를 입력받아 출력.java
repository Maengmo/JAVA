package com.test.question;

import java.util.Scanner;

public class Q0027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		String result = scan.next();
		
		if(result.equals("f")||result.equals("F")) {
			System.out.println("Father");
		}else if(result.equals("m")||result.equals("M")) {
			System.out.println("Mother");
		}else if(result.equals("s")||result.equals("S")) {
			System.out.println("Sister");
		}else if(result.equals("b")||result.equals("B")) {
			System.out.println("Brother");
		}else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}

	}

}
