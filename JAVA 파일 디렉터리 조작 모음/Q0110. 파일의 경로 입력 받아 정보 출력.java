package com.test.question;

import java.io.File;
 
public class Q0110 {

	public static void main(String[] args) {
		
		//파일 경로: /Users/kimdaehwan/Desktop/Quest/file/class.txt
		
		String path = "/Users/kimdaehwan/Desktop/Quest/file/class.txt";
		File file = new File(path);
		
		System.out.printf("파일명 : %s\n", file.getName() );
		System.out.printf("파일 종류 : %s\n", file.getName().substring(file.getName().lastIndexOf(".")+1));
		System.out.printf("파일 크기 : %s", transe(path));

	}//main
	
	public static String transe(String path) {
		
		File file = new File(path);
		long size = 0;
		String result = "";
		
		if(file.exists()) {
			
			size = file.length();
			
		}
		
		if(size<1024) {
			return result += size + "B";
		} else if (size < 1024*1024) {
			return result += String.format("%.1f", size / 1024.0) + "KB";
		} else if (size < 1024*1024*1024) {
			return result += String.format("%.1f", size / 1024.0 / 1024.0) + "MB";
		} else if (size < 1024*1024*1024*1024) {
			return result += String.format("%.1f", size / 1024.0 / 1024.0 / 1024.0) + "GB";
		} else if (size < 1024*1024*1024*1024*1024) {
			return result += String.format("%.1f", size / 1024.0 / 1024.0 / 1024.0 / 1024.0) + "TB";
		} 
		
		return "";
	}

}
