package com.test.question;

import java.io.File;

public class Q0115 {

	public static void main(String[] args) {
		
		String path = "/Users/kimdaehwan/Desktop/Quest/kind/파일 제거";
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		int n = 0;
		
		for(File file : list) {
			if(file.length()==0) {
				file.delete();
				n++;
			}
		}
		System.out.printf("총 %d개의 파일을 삭제했습니다.", n);
	}

}
