package com.test.question;

public class Q0064 {

	public static void main(String[] args) {
		int[] random = new int[20];
		int max = 0;
		int min = 0;
		
		String result = "원본 : ";
		
		for(int i=0; i<random.length; i++) {
			
			double a = Math.random()*20;
			random[i] = (int)a;
			
			result += random[i] + ", ";
			
		}
		
		for(int i=0; i<random.length; i++) {
			
			if (random[i] > max) {
				max = random[i];
			}
			
			if(random[i] < min) {
				min = random[i];
			}
		}
		System.out.println(result);
		System.out.printf("최대값 : %d\n", max);
		System.out.printf("최솟값 : %d\n", min);
	}

}
