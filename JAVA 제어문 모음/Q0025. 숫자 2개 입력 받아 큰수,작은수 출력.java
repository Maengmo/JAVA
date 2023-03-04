package com.test.question;

import java.util.Scanner;

public class Q0025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();

		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
		if( num1 > num2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n", num1, num2, (num1-num2) );
		}else if (num1 < num2) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.\n", num2, num2, (num2-num1) );
		}else {
			System.out.println("두 숫자는 동일 합니다.");
		}
	}

}
