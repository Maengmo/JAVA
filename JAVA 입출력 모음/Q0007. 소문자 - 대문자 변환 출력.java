package com.test.question;

import java.util.Scanner;

public class Q007 { 

	public static void main(String[] args) {
		//요구사항 : 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
		
		//시나리오
		//1. Scanner 생성
		//2. 라벨 출력
		
		//3. 문자 입력받기
		
		//4. 연산
		
		//5. 결과 출력(1000단위 표기)
								
		//화면설계 및 구현
		Scanner scan = new Scanner(System.in); 				//1. Scanner 생성
						
		System.out.print("문자를 입력하세요 : ");				//2. 라벨 출력
		String input = scan.nextLine();						//3. 문자를 입력 받기
						
		char word = input.charAt(0);						//3. char형으로 형변환
		
		int BigWord = (int)word-32;							//4. char형을 다시 int형으로 변환 후, -32 연산
		
		char Result = (char)BigWord;						//4. 연산결과를 다시 문자형(char)으로 변환. 
						
		System.out.printf("소문자 '%s'의 대문자는 '%c' 입니다.\n",input, Result);  //5. 결과 출력
		//input.charAt(0 -32); 이렇게 해도됨. 
		//'a' > 97
		//'A' > 65
	}

}
