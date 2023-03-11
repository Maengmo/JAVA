package com.test.question;

import java.io.File;

public class Q0116 {

	public static void main(String[] args) {
		
		String path1 = "/Users/kimdaehwan/Desktop/Quest/kind/동일 파일/MusicA";
		String path2 = "/Users/kimdaehwan/Desktop/Quest/kind/동일 파일/MusicB";
		
		File dir1 = new File(path1);
		File dir2 = new File(path2);
		
		File[] list1 = dir1.listFiles();
		File[] list2 = dir2.listFiles();
		
		for(File file : list1) {
			for(File file2 : list2) {
				if(file.getName().equals(file2.getName())) {
					System.out.println(file.getName());
				}
			}
		}

	}

}
