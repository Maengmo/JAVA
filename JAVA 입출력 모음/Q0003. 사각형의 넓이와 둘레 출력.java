package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		//요구사항 : 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		
		//시나리오
		//1. Scanner 생성
		//2. 라벨 출력
		//3. 너비 입력 받기
		//4. 높이 입력 받기
		//5. 연산
		//6. 결과 출력
						
		//화면 작성 및 구현
		Scanner scan = new Scanner(System.in); 		//1. Scanner 생성
		
		System.out.print("너비를 입력 하세요 : "); 		//2. 라벨 출력
		String input1 = scan.nextLine(); 			//3. 너비 입력 받기
		int width = Integer.parseInt(input1);		//3. int형으로 형변환
		
		System.out.print("높이를 입력 하세요 : "); 		//2. 라벨 출력
		String input2 = scan.nextLine();			//4. 높이 입력 받기
		int height = Integer.parseInt(input2);		//4. int형으로 형변환
		
		int result1 = (width*2) + (height*2);		//5. 둘레 연산
		int result2 = (width*height);				//5. 넓이 연산
		
		System.out.printf("사각형의 넓이는 %dcm 입니다.\n", result2);
		System.out.printf("사각형의 둘레는 %dcm 입니다.", result1);
		
		
		

	}

}
