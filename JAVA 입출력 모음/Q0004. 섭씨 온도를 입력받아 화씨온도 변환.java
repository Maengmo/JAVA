package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		//요구사항 : 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		
		//시나리오
		//1. Scanner 생성
		//2. 라벨 출력
		//3. 섭씨 온도 입력 받기
		//4. 연산
		//5. 결과 출력(소수 이하 1자리까지 출력)
		
		//화면설계 및 구현
		Scanner scan = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력하세요 : ");
		String input = scan.nextLine();
		Double temp = Double.parseDouble(input);
		
		Double result = temp *1.8 +32;
		
		System.out.printf("섭씨 %.1f 도는 화씨 %.1fF 입니다. ", temp, result);
		
						

	}

}
