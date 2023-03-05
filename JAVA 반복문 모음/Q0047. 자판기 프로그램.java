package com.test.question;

import java.util.Scanner;

public class Q0047 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int inMoney = 0;
		int choose = 0;
		int coke = 700;
		int cyda = 600;
		int bita = 500;
		
		for(;;) {
			System.out.println("====================");
			System.out.println("       자판기");
			System.out.println("====================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("--------------------");
			System.out.print("금액 투입(원) : ");
			inMoney = scan.nextInt();
			System.out.println("--------------------");
			System.out.print("음료 선택(번호) : ");
			choose = scan.nextInt();
			
			if(choose==1) {
				System.out.println("+콜라를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n",(inMoney-coke));
			}else if(choose==2) {
				System.out.println("+사이다를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n",(inMoney-cyda));
			}else if(choose==3) {
				System.out.println("+비타 500을 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.\n",(inMoney-bita));
			}else {
				System.out.println("올바른 값을 입력하세요");
			}
			System.out.println();
			System.out.println("계속하시려면 Enter를 입력하세요.");
			String Enter = scan.nextLine();
			String Enter2 = scan.nextLine();
			
			
		}

	}
	

}
