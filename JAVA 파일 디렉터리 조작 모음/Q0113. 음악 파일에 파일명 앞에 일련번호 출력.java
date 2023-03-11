package com.test.question;

import java.io.File;

public class Q0113 {

	public static void main(String[] args) {
		
		String path = "/Users/kimdaehwan/Desktop/Quest/kind/음악 파일/Music";
		
		File dir = new File(path);
		int n = 1;
		
		File[] list = dir.listFiles();
		
		for(File file : list) {
			
			if(file.getName().substring(file.getName().lastIndexOf(".")+1).toLowerCase().equals("mp3")) {
				
				File temp = new File(path + "/" + String.format("[%03d]%s", n, file.getName()));
				file.renameTo(temp);
				n++;
			}
		}
		System.out.println("완료되었습니다.");
	}

}
