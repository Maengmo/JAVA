package com.test.question;

public class Q0072 {

	public static void main(String[] args) {
		int[][] nums = new int[5][5]; //5행 5열
		
		int n = 1;
		
		for(int i=0; i<5; i++) {
			
			if(i==0) {
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n +=5;
				}n=2;
			}else if(i==1) {
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n +=5;
				}n=3;
			}else if(i==2) {
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n +=5;
				}n=4;
			}else if(i==3) {
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n +=5;
				}n=5;
			}else if(i==4) {
				for (int j=0; j<5; j++) {
					nums[i][j] = n;
					n +=5;
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
