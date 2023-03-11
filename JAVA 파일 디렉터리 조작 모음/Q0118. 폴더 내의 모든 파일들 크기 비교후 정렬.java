package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q0118 {

	public static void main(String[] args) {
		
		String path = "/Users/kimdaehwan/Desktop/Quest/kind/크기정렬";
		
		File dir = new File(path);
		
		ArrayList<File> files = new ArrayList<File>();
		
		addFile(dir, files);
		
		for(int i=0; i<files.size()-1; i++) {
			for(int j=0; j<files.size()-i-1; j++) {
				if(files.get(j).length() < files.get(j+1).length()) {
					File temp = files.get(j);
					files.set(j, files.get(j+1));
					files.set(j+1, temp);
				}
			}
		}
		
		System.out.printf("%-33s%s\t%10s\n", "[파일명]", "[크기]", "[파일이 들어있는 폴더]");
		
		for(File file : files) {
			System.out.printf("%-30s\t%10s\t%s\n"
								,file.getName()
								,getSize(file.length())
								,file.getParentFile().getName());
		}

	}
	
	private static String getSize(long size) {
		String result = "";
		
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
		} return "";
	}

	private static void addFile(File dir, ArrayList<File> files) {
		
		File[] list = dir.listFiles();
		
		//만약 파일이 담긴 곳이라면 이 문장을 실행
		for(File file : list) {
			if(file.isFile()) {
				files.add(file);
			}
		}
		
		//만약 디렉터리가 담긴 곳이라면 이 문장을 실행
		for(File file2 : list) {
			if(file2.isDirectory()) {
			addFile(file2,files);//재귀 함수
			}
		}
		
	}
}
