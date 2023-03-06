package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0069 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 길이 : ");
		int length = scan.nextInt();
		
		int [] nums = new int [length];
		
		for(int i=0; i<length; i++) {
		
			nums[i] = (int)(Math.random()*10);
		}
		
		int [] result = oper(nums);
		
		System.out.printf("원본 : %s\n", Arrays.toString(nums));
		System.out.printf("결과 : %s", Arrays.toString(result));
		
		

	}//main()
	
	public static int [] oper (int [] nums) {
		String result = "[ ";
		int [] temp = new int [nums.length/2];
		
		for(int i =0; i<nums.length; i+=2) {
			
			temp[i/2] = nums[i+1] + nums[i];
			
		} return temp;
		
	
		
		
	}

}
