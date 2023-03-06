package com.test.question;

import java.util.Scanner;

public class Q0061 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		
		for(int i=0; i<nums.length; i++) {
		
			System.out.print("숫자 : ");
			nums[i] = scan.nextInt();
			
		}
		
		for(int i=nums.length-1; i>=0; i--) {
			
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}
}
