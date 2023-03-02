package com.test.question;

public class Q0016 {

	public static void main(String[] args) {
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
	}//main
	
	public static void sum(int a) {
		
		System.out.printf("%d = %d\n", a, a );
	}//sum(int)
	
	public static void sum(int a, int b) {
		
		int result = a+b;
		System.out.printf("%d + %d = %d\n", a, b, result );
	}//sum(int, int)
	
	public static void sum(int a, int b, int c) {
		
		int result = a+b+c;
		System.out.printf("%d + %d + %d = %d\n", a, b, c, result );
	}//sum(int, int, int)
	
	public static void sum(int a, int b, int c, int d) {
		
		int result = a+b+c+d;
		System.out.printf("%d + %d + %d + %d = %d\n", a, b, c, d, result );
	}//sum(int, int, int, int)
	
	public static void sum(int a, int b, int c, int d, int e) {
		
		int result = a+b+c+d+e;
		System.out.printf("%d + %d + %d + %d + %d = %d\n", a, b, c, d, e, result );
	}//sum(int, int, int, int, int)
	
	
	

}
