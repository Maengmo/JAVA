package com.test.question;

public class Q0017 {

	public static void main(String[] args) {
	position("홍길동");
	position("홍길동","유재석");
	position("홍길동","유재석","박명수");
	position("홍길동","유재석","박명수","정형돈");
	

	}//main
	
	public static void position(String s1) {
		System.out.printf("사원 : %s\n\n", s1);
	}//position (String s1)
	
	public static void position(String s1, String s2) {
		System.out.printf("사원 : %s\n", s1);
		System.out.printf("대리 : %s\n\n", s2);
	}//position (String s1, String s2)
	public static void position(String s1, String s2, String s3) {
		System.out.printf("사원 : %s\n", s1);
		System.out.printf("대리 : %s\n", s2);
		System.out.printf("과장 : %s\n\n", s3);
	}//position (String s1, String s2, String s3)
	public static void position(String s1, String s2, String s3, String s4) {
		System.out.printf("사원 : %s\n", s1);
		System.out.printf("대리 : %s\n", s2);
		System.out.printf("과장 : %s\n", s3);
		System.out.printf("부장 : %s\n", s4);
	}//position (String s1, String s2, String s3, String s4)

}
