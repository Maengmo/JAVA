package com.test.question;

import java.util.Scanner;

public class Q006 {
 
	public static void main(String[] args) {
		//요구사항 : 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		
		//시나리오
		//1. Scanner 생성
		//2. 라벨 출력
		//3. 한달 수입 입력 받기
		//4. 연산
		//5. 결과 출력(1000단위 표기)
						
		//화면설계 및 구현
		Scanner scan = new Scanner(System.in); 				//1. Scanner 생성
				
		System.out.print("한달 수입 금액(원)을 입력하세요 : ");		//2. 라벨 출력
		String input = scan.nextLine();						//3. 한달 수입을 입력 받기
				
		int salary = Integer.parseInt(input);				//3. Integer형으로 형변환
				
		double pay = salary * 0.033;						//4. 세금 계산
		double result = salary - pay;						//4. 연산 결과
				
		System.out.printf("고객님의 세후 금액(원) : %,.0f원\n", result);  //5. 결과 출력
		System.out.printf("고객님의 세금(원) : %,.0f원", pay); 		//5. 결과 출력
	

	}

}
