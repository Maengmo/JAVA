package com.test.question;

public class Q0074 {

	public static void main(String[] args) {
		int[][] nums = new int[5][5]; //5행 5열
		
		int n = 1;
		
		for(int i=0; i<nums.length/2+1; i++) {
				for (int j=2-i; j<=2+i; j++) {
					nums[i][j] = n;
					n++;
				}
			}
		for(int i=nums.length/2+1; i<nums.length; i++) {
				for(int j=i-2; j<=6-i; j++) {
					nums[i][j] = n;
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
