package com.test.question;

import java.util.Scanner;

public class Q0033 {

	public static void main(String[] args) {
		//요구사항] 년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = scan.nextInt();
		
		if(year%4 !=0) {
			System.out.printf("입력하신 %d년은 '평년'입니다.", year);
		}else if(year%4 == 0 && year%100 !=0) {
			System.out.printf("입력하신 %d년은 '윤년'입니다.", year);
		}else if(year%4 == 0 && year%100 ==0 && year%400 ==0) {
			System.out.printf("입력하신 %d년은 '윤년'입니다.", year);
		}

	}

}
