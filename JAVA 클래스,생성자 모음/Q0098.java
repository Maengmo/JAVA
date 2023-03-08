package com.test.question;

public class Q0098 {

	public static void main(String[] args) {
		//학생 1
		Q0098_Student s1 = new Q0098_Student();
		System.out.println(s1.info());
		
		//학생 2
		Q0098_Student s2 = new Q0098_Student("홍길동", 13);
		System.out.println(s2.info());
		
		//학생 3 
		Q0098_Student s3 = new Q0098_Student(3, 10, 30);
		System.out.println(s3.info());
		
		//학생 4
		Q0098_Student s4 = new Q0098_Student("아무개", 12, 1, 5, 11);
		System.out.println(s4.info());
		

	}

}
