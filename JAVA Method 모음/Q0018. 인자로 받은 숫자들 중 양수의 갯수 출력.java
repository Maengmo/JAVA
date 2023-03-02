package com.test.question;

public class Q0018 {

	public static void main(String[] args) {
		positive(10);
		positive(10,20);
		positive(10,20,-30);
		positive(10,20,-30,40);
		positive(10,20,-30,40,50);
		

	}//main
	
	public static void positive(int a) {
		
		int count = a > 0 ? 1 : 0;
		System.out.printf("양수 : %d개\n", count);
	}//positive(int a)
	
	public static void positive(int a, int b) {
		
		int count = a > 0 ? 1 : 0;
		count = b > 0 ? ++count : count;
		System.out.printf("양수 : %d개\n", count);
	}//positive(int a, int b)
	
	public static void positive(int a, int b, int c) {
		
		int count = a > 0 ? 1 : 0;
		count = b > 0 ? ++count : count;
		count = c > 0 ? ++count : count;
		System.out.printf("양수 : %d개\n", count);
	}//positive(int a, int b, int c)
	
	public static void positive(int a, int b, int c, int d) {
		
		int count = a > 0 ? 1 : 0;
		count = b > 0 ? ++count : count;
		count = c > 0 ? ++count : count;
		count = d > 0 ? ++count : count;
		System.out.printf("양수 : %d개\n", count);
	}//positive(int a, int b, int c, int d)
	
	public static void positive(int a, int b, int c, int d, int e) {
		
		int count = a > 0 ? 1 : 0;
		count = b > 0 ? ++count : count;
		count = c > 0 ? ++count : count;
		count = d > 0 ? ++count : count;
		count = e > 0 ? ++count : count;
		System.out.printf("양수 : %d개\n", count);
	}//positive(int a, int b, int c, int d, int e)

}
