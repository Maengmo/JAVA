package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		//요구사항 : 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		
		//시나리오
		//1. Scanner 생성
		//2. 라벨 출력
		//3. 1번째 숫자 입력 받기
		//4. 2번째 숫자 입력 받기
		//5. 연산
		//6. 결과 출력
				
		//화면 작성 및 구현
		Scanner scan = new Scanner(System.in); 		//1. Scanner 생성
		
		System.out.print("1번째 숫자를 입력하세요 : "); 	//2. 라벨 출력
		String input1 = scan.nextLine();			//3. 1번째 숫자 입력 받기
		int num1 = Integer.parseInt(input1);		//3. 1번째 숫자 int형으로 형변환
		
		System.out.print("2번째 숫자를 입력하세요 : ");	//2. 라벨 출력
		String input2 = scan.nextLine();			//4. 2번째 숫자 입력 받기
		int num2 = Integer.parseInt(input2);		//4. 2번째 숫자 int형으로 형변환 
		
		int result1 = num1 + num2;					//5. 더하기 연산
		int result2 = num1 - num2;					//5. 빼기 연산 
		int result3 = num1 * num2;					//5. 곱하기 연산 
		double result4 = num1 / num2;				//5. 나누기 연산
		int result5 = num1 % num2;					//5. 나머지 연산 
		
		System.out.printf("%s + %s = %,d\n", input1, input2, result1);	//6. 더하기 결과 출력
		System.out.printf("%s - %s = %,d\n", input1, input2, result2);	//6. 빼기 결과 출력	
		System.out.printf("%s * %s = %,d\n", input1, input2, result3);	//6. 곱하기 결과 출력 
		System.out.printf("%s / %s = %.1f\n", input1, input2, result4); //6. 나누기 결과 출력 
		System.out.printf("%s %% %s = %,d\n", input1, input2, result5); //6. 나머지 결과 출력

	}

}
