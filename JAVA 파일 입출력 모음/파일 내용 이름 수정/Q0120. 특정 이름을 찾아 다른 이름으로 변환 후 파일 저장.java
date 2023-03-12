package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q0120 {

	public static void main(String[] args) {
		
		//m1();
		m2();
	}

	private static void m2() {
			
		try {
				
				BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/이름수정_변환.dat"));
				
				String line = null;
				
				while ((line = reader.readLine()) != null) {
					
					System.out.println(line);
					
				}
				reader.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}

	private static void m1() {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/이름수정.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/이름수정_변환.dat"));
			
			String line = null;
			int lineNumber = 0;
			
			while ((line = reader.readLine()) != null) {
				line = line.replace("유재석", "메뚜기");
				writer.write(line);
			}
			reader.close();
			writer.close();
			
			System.out.println("완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		

}
