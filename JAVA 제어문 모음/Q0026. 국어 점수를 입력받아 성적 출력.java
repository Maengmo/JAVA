package com.test.question;

import java.util.Scanner;

public class Q0026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int sum = scan.nextInt();
		
		if((sum >= 90)&&(sum<=100)) {
			System.out.printf("입력한 %d점은 성적 A입니다.\n", sum);
		}else if((sum >=80)&&(sum<90)) {
			System.out.printf("입력한 %d점은 성적 B입니다.\n", sum);
		}else if((sum >=70)&&(sum<80)) {
			System.out.printf("입력한 %d점은 성적 C입니다.\n", sum);
		}else if((sum >=60)&&(sum<70)) {
			System.out.printf("입력한 %d점은 성적 D입니다.\n", sum);
		}else if((sum >=0 )&&(sum<=59)) {
			System.out.printf("입력한 %d점은 성적 F입니다.\n", sum);
		}else {
			System.out.println("점수가 올바르지 않습니다. 0~100 사이의 값을 입력하시오.");
		}
		

	}

}
