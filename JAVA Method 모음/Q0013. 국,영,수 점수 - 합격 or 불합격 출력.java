package com.test.question;

public class Q0013 {

	public static void main(String[] args) {
		test(80, 75, 60);

	}
	
	public static void test(int kor, int eng, int math) {
		String result = (kor+eng+math)/3 >= 60 ? "합격" : "불합격";
		result = kor>=60 && eng>=60 && math >=60 ? result : "불합격";
		
		System.out.printf("%s입니다.", result);
	}

}
