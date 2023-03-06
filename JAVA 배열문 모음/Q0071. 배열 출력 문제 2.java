package com.test.question;

public class Q0071 {

	public static void main(String[] args) {
		
		int[][] nums = new int[5][5]; //5행 5열
		
		int n = 25;
		
		for(int i=0; i<5; i++) {
			
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n--;
				}
			}
			
		printArray(nums);
	}

	private static void printArray(int[][] nums) {
		
		for (int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				System.out.printf("%3d",nums[i][j]);
			}
			System.out.println();
		}
		
	}

}