package com.test.question;

public class Q0057 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			sum += i;
			
			if(i==10) {
				System.out.printf("1 ~ 10  : %4d\n", sum);
			}else if(i==20) {
				System.out.printf("1 ~ 20  : %4d\n", sum);
			}else if(i==30) {
				System.out.printf("1 ~ 30  : %4d\n", sum);
			}else if(i==40) {
				System.out.printf("1 ~ 40  : %4d\n", sum);
			}else if(i==50) {
				System.out.printf("1 ~ 50  : %4d\n", sum);
			}else if(i==60) {
				System.out.printf("1 ~ 60  : %4d\n", sum);
			}else if(i==70) { 
				System.out.printf("1 ~ 70  : %4d\n", sum);
			}else if(i==80) {
				System.out.printf("1 ~ 80  : %4d\n", sum);
			}else if(i==90) {
				System.out.printf("1 ~ 90  : %4d\n", sum);
			}else if(i==100) {
				System.out.printf("1 ~ 100 : %4d\n", sum);
			}
		}

	}

}
