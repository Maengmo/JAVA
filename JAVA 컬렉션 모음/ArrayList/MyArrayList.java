package com.test.question;

public class MyArrayList {
		
	private String[] list; 	//보조
	private int index; 		//************** 주인공 > 현재 데이터가 들어갈 방번호

	//배열 선언 방식
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}
	
	//배열 선언 방식 2
	public MyArrayList(int value) {
		this.list = new String[value];
		this.index = 0;
	}
	
	//배열의 맨 끝에 요소를 추가한다.
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
	//배열에 현재 넣은 데이터의 개수를 출력
	public int size() {
		
		//배열 길이(x) > 여태 넣은 데이터의 개수(O)
		return this.index;
		
	}
	//원하는 위치의 요소를 다른 값으로 수정
	public String get(int index) {
		
		if(checkIndex(index)) {
			return this.list[index];
		}
		else {
			return "올바른 인덱스 값을 넣어주세요";
		}
		
	}
	//index의 값을 제대로 입력했는지 검사
	public boolean checkIndex(int index) {
		
		if(index >= 0 && index < this.index) {
			return true;
		}
			return false;
		
	}
	//원하는 위치의 요소를 다른 값으로 수정
	public String set(int index, String value) {
		
		if(checkIndex(index)) {
		String beforeValue = "";
		
		this.list[index] = beforeValue;
		this.list[index] = value;
		
		return beforeValue;
		
		}else {
			return "올바른 인덱스 값을 넣어주세요";
		}
		
	}
	//원하는 위치의 요소를 삭제
	public String remove(int index) {
		if(checkIndex(index)) {
			String beforeValue = "";
			
			beforeValue = this.list[index];
			
			for(int i=index; i<this.list.length-2; i++) {
				this.list[i] = this.list[i+1];
			}
			this.index--;
			return beforeValue;
		}
		return "올바른 인덱스 값을 넣어주세요";
	}
	//원하는 위치에 요소를 삽입.
	public boolean add(int index, String value) {
		
		if(checkList()) {
			doubleList();
		}
		
		for(int i=this.list.length-2; i>=index; i--) {
			this.list[i+1] = this.list[i];
		}
		this.list[index] = value;
		this.index++;
		
		return true;
		
	}
	//원하는 요소가 몇번째 위치에 위치하는지 위치값을 반환
	public int indexOf(String value) {
		
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	//원하는 요소가 뒤에서 몇번째 위치하는지 위치값을 반환
	public int lastIndexOf(String value) {
		
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				return this.index - i;
			}
		}
		return -1;
	}
	//원하는 요소가 있는지 없는지를 확인하는 메소드
	public boolean contains(String value) {
		
		for(int i=0; i<this.index; i++) {
			if(this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
	}
	// 배열의 모든 요소를 삭제
	public void clear() {
		String [] temp = new String[4];
		this.list = temp;
		
		this.index = 0;
	}
	// 배열안의 요소의 개수만큼 배열의 길이를 줄인다.
	public void trimToSize() {
		String [] temp = new String[index];
		
		for(int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp; 
	}
	// 배열안의 요소를 모두 출력 
	public void allSearch() {
		if(index!=0) {
			for(int i=0; i<index; i++) {
				System.out.printf("[%d번째] : %s\n", i, this.list[i]);
			}
		}else {
			System.out.println("배열이 비어 있습니다.");
		}
	}
	//현재 진행 상황 확인 작업
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
