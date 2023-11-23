package com.test.question;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Q0125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}

	private static void m1() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/자바소스.java"));
			
			Stack<Character> stack = new Stack<Character>();
			
			String line = null;
			String Text = "";
			
			while ((line = reader.readLine()) != null) {
				
				Text += line + "\r\n";
				
			}
			reader.close();
			
			for(int i=0; i<Text.length(); i++) {
				
				char c = Text.charAt(i);
				
				if(c == '(' || c == '{') {
					stack.push(c);
				}else if(c == ')' || c == '}') {
					stack.pop();
				}
			}
			
			if(stack.size()==0) {
				System.out.println("올바른 소스 입니다.");
			}else {
				System.out.println("올바르지 않은 소스 입니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
	
	

}
