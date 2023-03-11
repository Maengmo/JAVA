package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q0111 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		

		System.out.print("폴더 선택 : ");
		String path = scan.nextLine();
		
		System.out.print("확장자 : ");
		String temp = scan.nextLine();
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		String result2 = "";
		
		for(File file : list) {
			String result = file.getName().substring(file.getName().lastIndexOf(".")+1);
			
			if(temp.equals(result)) {
				result2 += String.format("%s\n", file.getName());
			}
		}
		System.out.println(result2);
		
	}

}
