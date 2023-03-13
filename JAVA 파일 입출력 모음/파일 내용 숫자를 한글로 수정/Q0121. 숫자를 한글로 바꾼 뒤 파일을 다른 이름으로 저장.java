package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q0121 {
	
	public static void main(String[] args) {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/숫자.dat"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/숫자_변환.dat"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				line = line.replace("0", "영");
				line = line.replace("1", "일");
				line = line.replace("2", "이");
				line = line.replace("3", "삼");
				line = line.replace("4", "사");
				line = line.replace("5", "오");
				line = line.replace("6", "육");
				line = line.replace("7", "칠");
				line = line.replace("8", "팔");
				line = line.replace("9", "구");
				writer.write(line);
			}
			reader.close();
			writer.close();
			
			System.out.println("완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		m2();
	}
	private static void m2() {
		
		try {
				
				BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/숫자_변환.dat"));
				
				String line = null;
				
				while ((line = reader.readLine()) != null) {
					
					System.out.println(line);
					
				}
				reader.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		
	}

}
