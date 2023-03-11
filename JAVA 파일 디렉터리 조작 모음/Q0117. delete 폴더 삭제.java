package com.test.question;

import java.io.File;
import java.util.HashMap;

public class Q0117 {

	public static void main(String[] args) {
		
		String path = "/Users/kimdaehwan/Desktop/Quest/kind/폴더 삭제/delete";
		
		File dir = new File(path);
		
		HashMap<String, Integer> count = new HashMap<String, Integer>(); 
		count.put("dir", 0);
		count.put("file", 0);
		
		deleteFile(dir, count);
		
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개 입니다.", count.get("dir"), count.get("file"));
	}//main
	
	private static void deleteFile(File dir, HashMap<String, Integer> count) {
		
		File[] list = dir.listFiles();
		
		//만약 파일이 담긴 곳이라면 이 문장을 실행
		for(File file : list) {
			if(file.isFile()) {
				count.put("file", count.get("file")+1);
				file.delete();
			}
		}
		//만약 디렉터리가 담긴 곳이라면 이 문장을 실행
		for(File file2 : list) {
			if(file2.isDirectory()) {
				deleteFile(file2, count); //재귀, 자기 자신을 반복
			}
		}
		
		count.put("dir", count.get("dir")+1);
		
		dir.delete();
		
	}

}
