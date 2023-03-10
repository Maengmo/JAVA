package com.test.question;

public class MySet {
	private String [] list;
	private int index;
	private int nextIndex;
	
	public MySet() {
		this.list = new String[4];
		this.index = 0;
		this.nextIndex = 0;
	}
	
	public boolean add(String value) {
		
		//인자값을 배열에 차례대로 넣기 > Append
		
		//검사 > 방이 모자란지? > 배열 2배 확장(깊은 복사)
		if(duplicate(value)) {
			return false;
		}
		
		if(checkList()) {
			doubleList();
		}
		this.list[this.index] = value;
		this.index++;
		
		return true;
	}
	public boolean duplicate(String value) {
		
		for(int i=0; i<index; i++) {
			if(list[i].equals(value)) {
				return true;
			}
		}
		return false;
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
	
	public int size() {
		return this.index;
	}
	
	public String remove(String value) {
		int index = -1;
		
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				index = i;
				break;
			}
		}
		for (int i=index; i<this.list.length-1; i++) {
			list[i] = list[i+1];
		}
		this.index--;
		return "삭제된 요소  : " + value;
	}
	
	public void clear() {
		String [] temp = new String[4];
		
		this.list = temp;
		
		this.index = 0;
	}
	
	public boolean hasNext() {
		
		if(nextIndex < this.index) {
			return true;
		}
		return false;
	}
	
	public String next() {
		
		String temp = this.list[nextIndex];
		nextIndex++;
		return temp;
	}
	
	public String toString() {
		String temp = "";
		
		temp += "\n";
		temp += String.format("length : %d\n", list.length);
		temp += String.format("index : %d\n", index);
		temp += "\n";
		
		for(int i=0; i<this.list.length; i++) {
			temp += String.format(" %d: %s\n", i, this.list[i]);
		}
		temp += "\n";
		return temp;
	}
}
