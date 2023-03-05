package com.test.question;

public class Q0058 {

	public static void main(String[] args) {
		
		int sum = 0;
		
			for(int i=1; i<=100; i++) {
			
			sum += i;
			
			if(i==10) {
				System.out.printf(" 1 ~  10 : %3d\n", sum);
				sum=0;
			}else if(i==20) {
				System.out.printf("10 ~  20 : %3d\n", sum);
				sum=0;
			}else if(i==30) {
				System.out.printf("20 ~  30 : %3d\n", sum);
				sum=0;
			}else if(i==40) {
				System.out.printf("30 ~  40 : %3d\n", sum);
				sum=0;
			}else if(i==50) {
				System.out.printf("40 ~  50 : %3d\n", sum);
				sum=0;
			}else if(i==60) {
				System.out.printf("50 ~  60 : %3d\n", sum);
				sum=0;
			}else if(i==70) { 
				System.out.printf("60 ~  70 : %3d\n", sum);
				sum=0;
			}else if(i==80) {
				System.out.printf("70 ~  80 : %3d\n", sum);
				sum=0;
			}else if(i==90) {
				System.out.printf("80 ~  90 : %3d\n", sum);
				sum=0;
			}else if(i==100) {
				System.out.printf("90 ~ 100 : %3d\n", sum);
			}
		}

	}

}
