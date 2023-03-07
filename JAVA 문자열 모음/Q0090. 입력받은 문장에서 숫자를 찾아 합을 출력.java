package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q0090 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input = scan.nextLine();
		
		String [] middle = new String [input.length()];
		
		int n=1;
		int sum=0;
		
		for(int i=0; i<input.length(); i++) {
			middle[i] = input.substring(i, n);
			n++;
		}
		
		for(int i=0; i<middle.length; i++) {
			sum += Search(middle[i]);
		}
		System.out.println(Arrays.toString(middle));
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
	}
	public static int Search(String s) {
		
		if(s.equals("1")){return 1;		
		}else if(s.equals("2")){return 2;
		}else if(s.equals("3")){return 3;
		}else if(s.equals("4")){return 4;
		}else if(s.equals("5")){return 5;
		}else if(s.equals("6")){return 6;
		}else if(s.equals("7")){return 7;
		}else if(s.equals("8")){return 8;
		}else if(s.equals("9")){return 9;
		}return 0;
		
	}

}
