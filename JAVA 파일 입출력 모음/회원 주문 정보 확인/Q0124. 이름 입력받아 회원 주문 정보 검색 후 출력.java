package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q0124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

	private static void m1() {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/검색_회원.dat"));
			BufferedReader reader2 = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/검색_주문.dat"));
			
			String line = null;
			String line2 = null;
			
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = scan.nextLine();
			String num = "";
			String address = "";
			
			String result = String.format("==== 구매 내역 ====\n"
										+ "[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]\n");
			
			while ((line = reader.readLine()) != null) {
				
				String list [] = line.split(",");
				
				if(list[1].equals(name)) {
					num = list[0];
					address = list[2];
					break;
				}
			}
				
				if (!num.equals("")) {
					System.out.print(result);
					while ((line2 = reader2.readLine()) != null) {
						
						String list2 [] = line2.split(",");
						
						if(list2[3].equals(num)) {
							System.out.printf("%s\t%s\t%s\t%s\t%s\r\n"
											, list2[0]
											, name
											, list2[1]
											, list2[2]
											, address);
						}
						
					}
				
					
					
				
			}
			reader.close();
			reader2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
