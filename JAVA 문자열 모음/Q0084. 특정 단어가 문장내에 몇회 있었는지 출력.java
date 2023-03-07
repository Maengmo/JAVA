package com.test.question;

public class Q0084 {

	public static void main(String[] args) {
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		
		String word = "길동"; //검색어
		int count = 0;
		
		int index = -1;
		
		while(true) {
			index = content.indexOf(word, index);
			
			if(index > -1) {
				count++;
				index = index + word.length(); 
			}else {
				break;
			}
			
			
		}
		
		System.out.printf("'길동'을 총 %d회 발견했습니다.", count);
		

	}

}
