package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q0123 {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/단일검색.dat"));
			
			String line = null;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			while ((line = reader.readLine()) != null) {
				
				String [] list = line.split(",");
				
				String number = list[0];
				String address = list[2];
				String call = list[3];
				
				if(list[1].equals(name)) {
					 System.out.printf("[%s]\n", list[1]);
					 System.out.printf("번호 : %s\n", list[0]);
					 System.out.printf("주소 : %s\n", list[2]);
					 System.out.printf("전화 : %s\n", list[3]);
					 break;
				}
				
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
