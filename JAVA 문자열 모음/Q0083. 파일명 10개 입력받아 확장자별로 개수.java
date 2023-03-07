package com.test.question;

import java.util.Scanner;

public class Q0083 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String txt = ""; 
		int mp3 = 0;
		int jpg = 0;
		int java = 0;
		int hwp = 0;
		int doc = 0;
		
		int index = 0;
		
		for(int i=0; i<10; i++) {
			System.out.print("파일명 : ");
			txt = scan.nextLine();
			
			index = txt.lastIndexOf(".");
			txt = txt.substring(index+1);
			if(txt.equals("mp3")) {
				mp3++;
			}else if(txt.equals("jpg")) {
				jpg++;
			}else if(txt.equals("java")) {
				java++;
			}else if(txt.equals("hwp")) {
				hwp++;
			}else if(txt.equals("doc")) {
				doc++;
			}
		}
		System.out.println();
		System.out.printf("mp3 : %d개\n", mp3);
		System.out.printf("jpg : %d개\n", jpg);
		System.out.printf("java : %d개\n", java);
		System.out.printf("hwp : %d개\n", hwp);
		System.out.printf("doc : %d개\n", doc);
	}
	

}
