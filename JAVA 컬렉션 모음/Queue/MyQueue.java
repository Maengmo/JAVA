package com.test.question;

public class MyQueue {
	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public boolean add(String value) {
		
		//인자값을 배열에 차례대로 넣기 > Append
		
		//검사 > 방이 모자란지? > 배열 2배 확장(깊은 복사)
		if(checkList()) {
			doubleList();
		}
		this.list[this.index] = value;
		this.index++;
		
		return true;
	}
	//index의 길이가 현재 list의 길이와 같은지 즉, 방이 꽉찼는지 검사
	public boolean checkList() {
		if(this.index == this.list.length) {
			return true;
		}
		return false;
	}
	//배열의 길이가 꽉 찼다면, 배열의 길이를 2배로 늘려주는 연산
	public void doubleList() {
		String[] temp = new String[this.list.length*2];
		
		for(int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
	
	public String poll() {
		
		String temp = list[0];
		
		if(this.index > 0) {
			for(int i=0; i<this.list.length-2; i++) {
				this.list[i] = this.list[i+1];
			}
			this.index--;
			return temp;
		}else {
			return "null";
		}
		
	}
	
	public int size() {
		return index;
	}
	
	public String peek() {
		return this.list[0];
	}
	
	public void clear() {
		for(int i=0; i<this.index; i++) {
			this.list[i] = null;
		}
		this.index = 0;
	}
	
	public void trimToSize() {
		String [] temp = new String [this.index];
		
		for(int i=0; i<index; i++) {
			temp[i] = list[i];
		}
		this.list = temp;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("index : %d\n", this.index));
		sb.append(String.format("length : %d\n", this.list.length));
		
		for(int i=0; i<this.list.length; i++) {
			sb.append(String.format("\t%d : %s\n",i , list[i]));
		}
		
		return sb.toString();
	}
}

