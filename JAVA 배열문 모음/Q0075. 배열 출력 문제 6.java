package com.test.question;

public class Q0075 {

	public static void main(String[] args) {
		int[][] nums = new int[5][5]; //5행 5열
		
		int n = 1;
		int sum = 0;
		
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1; j++) {
				
				nums[i][j] =n;
				nums[i][4] +=n;
				nums[4][j] +=n;
				nums[4][4] +=n;
				n++;
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
