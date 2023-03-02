package com.test.question;

import java.util.Scanner;

public class Q0015 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sunny = 0;
		int foggy = 0;
		
		System.out.print("맑은 날 : ");
		sunny = scan.nextInt();
		
		System.out.print("흐린 날 : ");
		foggy = scan.nextInt();
		
		getApple(sunny, foggy);
		
	}
	
	public static void getApple(int sunny, int foggy) {
		int result = sunny*5 + foggy*2;
		int apple = result>100? (result-100)/10 : 0 ;
		
		System.out.printf("사과가 총 %d개 열렸습니다.", apple);
	}

}
