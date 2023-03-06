package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0068 {

	public static void main(String[] args) {
		
		int [] list = {5,6,1,3,2,0,0,0,0,0};
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제위치 : ");
		int index = scan.nextInt();
		
		System.out.println("원본 : ");
		Search(list);
		
		
		
		
		for(int i=index; i<list.length-1; i++) {
			
			list[i] = list[i+1];
	
			
		}
		
		list[list.length-1] = 0;
		System.out.print("결과 : ");
		
		Search(list);
		
	}//main
	public static void Search(int[] list) {
		
		String result = "[ ";
		
		for(int i=0; i<list.length; i++) {
			
			result += list[i];
			
			if(i<list.length-1) {
				result += ", ";
			}
	}
		result += "]";
		
		System.out.println(result);
	}
}


