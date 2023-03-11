package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q0112 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이동할 파일 주소 : ");
		String storePath = scan.nextLine();
		
		System.out.print("이동시킬 파일 주소 : ");
		String movePath = scan.nextLine();
		
		System.out.println("파일 이동을 실행합니다.");
		
		File storedir = new File(storePath);
		File[] storelist = storedir.listFiles();
		
		File movedir = new File(movePath);
		File[] movelist = movedir.listFiles();
		
		if(!movedir.exists()) {
			storedir.renameTo(movedir);
			System.out.println("파일 이동을 완료했습니다.");
		}else {
			System.out.print("같은 이름을 가지는 파일이 존재합니다. 덮어쓸까요? (Y : N)");
			String result = scan.next();
			
			if(result.equals("Y")) {
				movedir.delete();
				storedir.renameTo(movedir);
				System.out.println("파일 이동을 완료했습니다.");
			}else {
				System.out.println("작업을 취소합니다.");
			}
		}

	}

}
