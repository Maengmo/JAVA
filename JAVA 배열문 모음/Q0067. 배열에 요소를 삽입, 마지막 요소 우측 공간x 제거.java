package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int [] nums = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};
		

		System.out.print("삽입 위치 : ");
		int index = scan.nextInt();
		System.out.print("값 : ");
		int value = scan.nextInt();
		
		System.out.printf("원본 : %s\n",Arrays.toString(nums));
		
		//1, 2, 3
		//for(int i=index; i<list.length-1; i++) {
		for(int i=nums.length-index; i>=index; i--) {
		
			nums[i+1] = nums[i];
			
		}
		nums[index] = value;
		System.out.printf("결과 : %s\n",Arrays.toString(nums));
	}

}
