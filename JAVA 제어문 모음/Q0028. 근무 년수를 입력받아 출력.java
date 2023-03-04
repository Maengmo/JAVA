package com.test.question;

import java.util.Scanner;

public class Q0028 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("근무년수 : ");
		int work = scan.nextInt();
		
		if((work>=1)&&(work<5)) {
			System.out.printf("%d년차 초급 개발자입니다.\n", work );
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.",(5-work));
		}else if((work>=5)&&(work<10)) {
			System.out.printf("%d년차 중급 개발자입니다.\n", work );
			System.out.printf("당신은 %d년전까지 초급 개발자였습니다.\n",(work-5) );
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.",(10-work));
		}else if(work>=10) {
			System.out.printf("%d년차 고급 개발자입니다.\n", work);
			System.out.printf("당신은 %d년전까지 중급 개발자였습니다.", (work-9));
		}else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하세요.");
		}
		

	}

}
