package com.test.question;

import java.util.Scanner;

public class Q0014 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int station = 0;
		int change = 0;
		int time = 0;
		
		System.out.print("역의 갯수를 입력하세요 : ");
		station = scan.nextInt();
		
		System.out.print("환승 갯수를 입력하세요 : ");
		change = scan.nextInt();
		
		System.out.print("시간대를 선택하세요(1.평상시, 2.출근시, 3.퇴근시)");
		time = scan.nextInt();
		
		getTime(station, change, time);

	}

	public static void getTime(int station, int change, int time) {
		int watch = (time==1)? 3 : (time==2)? 4 : 5; //평상시 : 출근시 : 퇴근시
		int total = 2*station + change*watch;
		
		System.out.printf("총 소요 시간은 %d분 입니다.", total);
	}
}
