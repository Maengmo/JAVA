package com.test.question;

public class MyHashMap {

	private String[] keys; 
	private String[] values;
	private int index;
	
	public MyHashMap() {
		this.keys = new String[4];
		this.values = new String[4];
		this.index = 0;
	}
	public String toString() {
		String temp = "";
		
		temp += String.format("length : %d\n", this.keys.length);
		temp += String.format("index : %d\n", this.index);
		temp += String.format("\r\n");
		for(int i=0; i<this.keys.length; i++) {
			temp += String.format(" [%s] : %s\n", this.keys[i], this.values[i]);
		}
		temp += String.format("\n");
		
		return temp;
	}
	
	public String put(String key, String value) {
		
		if(getIndex(key) == -1) {
			if(checkList()) {
				doubleList();
			}
			this.keys[this.index] = key;
			this.values[this.index] = value;
			index++;
		}else {
			this.values[getIndex(key)] = value;
		}
		
		return null;
	}
	
	//index의 길이가 현재 list의 길이와 같은지 즉, 방이 꽉찼는지 검사
	public boolean checkList() {
		if(this.index == this.keys.length && this.index == this.values.length) {
			return true;
		}
		return false;
	}
		
		//배열의 길이가 꽉 찼다면, 배열의 길이를 2배로 늘려주는 연산
	public void doubleList() {
		String[] temp = new String[this.keys.length*2];
		String[] temp2 = new String[this.values.length*2];
			
		for(int i=0; i<this.keys.length; i++) {
			temp[i] = this.keys[i];
		}
		this.keys = temp;
			
		for(int i=0; i<this.values.length; i++) {
			temp2[i] = this.values[i];
		}
		this.values = temp2;
	}
	
	public String get(String key) {
		
		int index = getIndex(key);
		
		if(index != -1) {
			return this.values[index];
		}else {
			return null;
		}
	}
	
	public int getIndex(String key) {
		
		for(int i=0; i<this.index; i++) {
			if(this.keys[i].equals(key)) {
				return i;
			}
		}return -1;
	}
	
	public int size() {
		return this.index;
	}
	
	public String remove(String key) {
		int index = getIndex(key);
		String temp = "";
		temp += String.format("[%s] : %s 삭제됩니다." , this.keys[index], this.values[index]);
		
		if(index > -1) {
			for(int i=index; i<=this.keys.length-2; i++) {
				this.keys[i] = this.keys[i+1];
			}
			for(int i=index; i<this.values.length-2; i++) {
				this.values[i] = this.values[i+1];
			}
			this.index--;
		}
		return temp;
	}
	
	public boolean containsKey(String key) {
		int index = getIndex(key);
		
		if(index > -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean containsValue(String value) {
		
		for(int i=0; i<this.values.length; i++) {
			if(this.values[i].equals(value)) {
				return true;
			}
		} return false;
	}
	
	public void clear() {
		String [] temp = new String[4];
		
		this.keys = temp;
		this.values = temp;
		
		this.index = 0;
	}
	
	public void trimToSize() {
		String [] temp = new String[this.index];
		String [] temp2 = new String[this.index];
		
		for(int i=0; i<this.index; i++) {
			temp[i] = this.keys[i];
			temp2[i] = this.values[i];
		}
		this.keys = temp;
		this.values = temp;
	}
	
	
	
	
	
	
}
