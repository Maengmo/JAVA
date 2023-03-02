package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		
		//Q001.java ~ Q007.java > 압축
		
		//요구사항 : 태어난 년도를 입력받아 나이를 출력하시오.
		
		//시나리오
		//1. Scanner 생성
		//2. 라벨 출력
		//3. 태어난 년도 입력 받기
		//4. 연산
		//5. 결과 출력 
		
		//화면 작성 및 구현
		Scanner scan = new Scanner(System.in); 			//1. Scanner 생성
		
		System.out.print("태어난 년도를 입력하세요 : "); 		//2. 라벨 출력
		String input = scan.nextLine(); 				//3. 태어난 년도 입력 받기
		int age = Integer.parseInt(input); 				//3. 연산을 위해 String형 -> Integer형으로 형변환
		
		int BornAge = 2023-age+1; 						//4. 연산 = 현재년도-태어난년도+한국나이(1)
		
		System.out.printf("당신이 태어난 년도는 %s년, 당신의 나이는 %d 살 입니다.", input, BornAge); //5. 결과 출력
		

	}

}
