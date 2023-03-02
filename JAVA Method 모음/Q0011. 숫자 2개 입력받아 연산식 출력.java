package com.test.question;

public class Q0011 {

	public static void main(String[] args) {
		add(5,3);
		subtract(5,3);
		multiply(5,3);
		divide(5,3);
		mod(5,3);
		

	}//main
	
	public static void add(int n1, int n2) {
		
		int n3 = n1+n2;
		System.out.printf("%d + %d = %d\n", n1, n2, n3);
	}
	
	public static void subtract(int n1, int n2) {
		
		int n3 = n1-n2;
		System.out.printf("%d - %d = %d\n", n1, n2, n3);
	}
	
	public static void multiply(int n1, int n2) {
		
		int n3 = n1*n2;
		System.out.printf("%d * %d = %d\n", n1, n2, n3);
	}
	
	public static void divide(int n1, int n2) {
		
		double n3 = n1 / n2;
		System.out.printf("%d / %d = %.1f\n", n1, n2, n3);
	}
	
	public static void mod(int n1, int n2) {
		
		double n3 = n1 % n2;
		System.out.printf("%d %% %d = %.0f\n", n1, n2, n3);
	}

}
