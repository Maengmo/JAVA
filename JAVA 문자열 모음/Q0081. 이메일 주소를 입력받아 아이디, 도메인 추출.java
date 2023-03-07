package com.test.question;

import java.util.Scanner;

public class Q0081 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이메일 : ");
		String email = scan.nextLine();
		
		int index = -1;
		
		index = email.lastIndexOf("@");
		
		String id = email.substring(0,index);
		String domain = email.substring(index+1);
		
		System.out.println("아이디 : " + id);
		System.out.println("도메인 : " + domain);
		
		
		
		

	}

}
