package com.test.question;

import java.util.Scanner;

public class Q0063 {

	public static void main(String[] args) {
		int[] list = new int[4];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<list.length; i++) {
			
			System.out.printf("list[%d] : ",i);
			list[i] = scan.nextInt();
			
			
			
		}
		String result = dump(list);
		System.out.printf("nums = %s\n", result);

	}//main
	
	public static String dump(int[] list) {
		
		String temp = "[ ";
		
		for(int i=0; i<list.length; i++) {
			
			temp += list[i];
			
			if(i<list.length-1) {
				
				temp += ", ";
			}
		}temp += " ]";
		
		return temp;
	}

}
