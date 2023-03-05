package com.test.question;

import java.util.Scanner;

public class Q0043 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*10);
		int num = 0;
		
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		
		System.out.print("(1~10 사이)숫자를 입력하세요 : ");
		int inputNum = scan.nextInt();
		
		for(int i=0; i<10; i++) {
			
			if(inputNum!=random) {
				System.out.println("틀렸습니다.");
				System.out.print("숫자 : ");
				inputNum = scan.nextInt();
				num++;
				System.out.println();
			}else if(inputNum==random) {
					num++;
					System.out.println("맞았습니다.\n");
					System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
					System.out.printf("정답을 맞추는데 시도한 횟수는 %d회 입니다.\n", num);
					break;
			}
			
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");

	}

}
