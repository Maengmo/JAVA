package com.test.question;

import java.util.Scanner;

public class Q0029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
		System.out.print("연산자 : ");
		String num3 = scan.next();
		
		switch(num3) {
			case("+"):
				System.out.printf("%d + %d = %d", num1, num2,(num1+num2));
				break;
			case("-"):
				System.out.printf("%d - %d = %d", num1, num2,(num1-num2));
				break;
			case("*"):
				System.out.printf("%d * %d = %d", num1, num2,(num1*num2));
				break;
			case("/"):
				System.out.printf("%d / %d = %.1f", num1, num2,(double)(num1/num2));
				break;
			case("%"):
				System.out.printf("%d %% %d = %d", num1, num2,(num1%num2));
				break;
			default:
				System.out.println("연산이 불가능 합니다.");
		}
		

	}

}
