package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		//요구사항 : 자전거가 있다. 자전거의 바퀴는 지름이 26인치다 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇m를 달렸는지 출력하시오.
		
		//시나리오
		//1. Scanner 생성
		//2. 라벨 출력
		//3. 사용자가 페달을 밟은 횟수 입력 받기 
		//4. 연산
		//5. 결과 출력(1000단위 표기)
				
		//화면설계 및 구현
		Scanner scan = new Scanner(System.in); 			//1. Scanner 생성
		
		System.out.print("사용자가 페달을 밟은 횟수 : ");		//2. 라벨 출력
		String input = scan.nextLine();					//3. 사용자가 페달을 밟은 횟수 입력 받기 
		
		int turn = Integer.parseInt(input);				//3. Integer형으로 형변환
		
		double circul = 26 * 3.14 * 0.0254;				//4. 원의 둘레 연산
		Double result = turn * circul;					//4. 연산 결과
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %.3fm를 달렸습니다. ", turn, result); //5. 결과 출력 
	}

}
