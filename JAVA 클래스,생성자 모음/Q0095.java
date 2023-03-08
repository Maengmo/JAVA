package com.test.question;

public class Q0095 {

	public static void main(String[] args) {
		
		Q0095_Employee e1 = new Q0095_Employee();
		
		e1.setName("홍길동");
		e1.setDepartment("홍보부");
		e1.setPosition("부장");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); //직속 상사 없음
		
		e1.info();
		
		Q0095_Employee e2 = new Q0095_Employee();
		
		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-5678");
		e2.setBoss(e1); //홍길동
		
		e2.info();
		
	}

}
