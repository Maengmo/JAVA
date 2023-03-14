package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q0122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1();
	}

	private static void m1() {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/성적.dat"));
			
			String line = null;
			String pass = "[합격자]\n";
			String nopass = "[불합격자]\n";
			
			while ((line = reader.readLine()) != null) {
			
				String [] list = line.split(",");
				
				int kor = Integer.parseInt(list[1]);
				int eng = Integer.parseInt(list[2]);
				int math = Integer.parseInt(list[3]);
				
				int avg = (kor+eng+math)/3;
				
				if(kor>=40&&eng>=40&&math>=40&&avg>=60) {
					pass += String.format("%s\n", list[0]);
				}else {
					nopass += String.format("%s\n", list[0]);
				}
				
			}
			reader.close();
			
			System.out.println(pass);
			System.out.println(nopass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	
	
}
