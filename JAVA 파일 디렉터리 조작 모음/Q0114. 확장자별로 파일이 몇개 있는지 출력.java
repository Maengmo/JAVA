package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q0114 {

	public static void main(String[] args) {
		
		String path = "/Users/kimdaehwan/Desktop/Quest/kind/확장자별 카운트";
		
		File dir = new File(path);
		
		HashMap<String,Integer> number = new HashMap<String,Integer>();
		
		File[] list = dir.listFiles();
		
		for(File file : list) {
			//확장자가 무엇인지 나누는 작업
			String result = file.getName().substring(file.getName().lastIndexOf(".")+1);
			
			//확장자를 나눈 후, 해당 확장자에 대해 key값을 설정하여 개수에 따라 증가
			if(number.get(result) == null) {
				number.put(result,1);
			}else {
				number.put(result, number.get(result)+1);
			}
		}
		
		System.out.println(number);
		//number.keySet = number의 HashMap에서 key값만을 가져와서 keys라는 배열에 저장.
		Set<String> keys = number.keySet();
		
		for(String key : keys) {
			System.out.printf("*.%s : %d개\n", key, number.get(key));
		}

	}

}
