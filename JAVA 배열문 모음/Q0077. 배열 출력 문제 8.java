package com.test.question;

public class Q0077 {

	public static void main(String[] args) {
		

		int[][] nums = new int[5][5]; //5행 5열
		
		int n = 1;
		/*
		 	nums[0][0] = 1
		 	i=0, j=0
		 	nums[0][1] = 2
		 	nums[1][0] = 3
		 	i=0, j=1
		 	i=1, j=0
		 	nums[0][2] = 4
		 	nums[1][1] = 5
		 	nums[2][0] = 6
		 	i=0, j=2
		 	i=1, j=1
		 	i=2, j=0
		 	nums[0][3] = 7
		 	nums[1][2] = 8
		 	nums[2][1] = 9
		 	nums[3][0] = 10
		 	
		 	nums[0][4] = 11
		 	nums[1][3] = 12
		 	nums[2][2] = 13
		 	nums[3][2] = 14
		 	nums[4][0] = 15
		 */
		for(int i=0; i<5; i++) {
				if(i<1) {
					for (int j=0; j<=i; j++) {
						nums[i][j] = n;
						n++;
				}	
				if(i<2) {
					for (int j=1; j<=i; j++) {
						nums[i][j] = n;
						n++;
					}
				}
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
