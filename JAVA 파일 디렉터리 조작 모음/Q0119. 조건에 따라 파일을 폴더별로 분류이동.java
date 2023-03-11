package com.test.question;

import java.io.File;

public class Q0119 {

	public static void main(String[] args) {
		
		String path = "/Users/kimdaehwan/Desktop/Quest/kind/직원";
		
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for (File file : list) {
			
			String filename = file.getName();
			String[] temp = filename.split("_");
			
			File files = new File(path + "/" + temp[0] + "/" + temp[1]);
			files.mkdirs();
			
			File movefile = new File(path + "/" + temp[0] + "/" + temp[1] + "/" + filename);
			file.renameTo(movefile);
			
			System.out.println(movefile.getAbsolutePath());
			
		}
		

	}

}
