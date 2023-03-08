package com.test.question;

public class Q0094 {

	public static void main(String[] args) {
		
		Q0094_Bugles snack = new Q0094_Bugles();
		
		snack.setWeight(500);
		snack.setCreationTime(2023, 2, 13);
		System.out.printf("가격 : %,d 원\n",snack.getPrice());
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
		
		snack.eat();
		
		System.out.println();
		
		Q0094_Bugles snack2 = new Q0094_Bugles();
		
		snack2.setWeight(300);
		snack2.setCreationTime(2023, 2, 5);
		System.out.printf("가격 : %,d 원\n",snack2.getPrice());
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");
		
		snack2.eat();

	}

}
