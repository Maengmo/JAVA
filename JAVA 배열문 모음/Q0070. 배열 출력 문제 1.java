package com.test.question;

public class Q0070 {

	public static void main(String[] args) {
		
		int[][] nums = new int[5][5]; //5행 5열
		
		int n = 1;
		
		for(int i=0; i<5; i++) {
			
			if(i%2 ==0) {
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n++;
				}
			}else {
				for (int j=nums[0].length-1; j>=0;j--) {
					nums[i][j] = n;
					n++;
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


