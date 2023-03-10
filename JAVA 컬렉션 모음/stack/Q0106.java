package com.test.question;

public class Q0106 {

	public static void main(String[] args) {
		
		//배열 생성
		MyStack stack = new MyStack();
		
		//추가
		System.out.println("-추가-");
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("검정");
		System.out.println();

		//읽기
		System.out.println("-읽기-");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println();

		//개수
		System.out.println("-개수-");
		System.out.println(stack.size());
		System.out.println();
		
		//확인
		System.out.println("-확인-");
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println();

		//크기 조절
		System.out.println("-크기 조절-");
		stack.trimToSize();
		System.out.println();

		//초기화
		System.out.println("-초기화-");
		stack.clear();
		System.out.println(stack.size());
	}

}
