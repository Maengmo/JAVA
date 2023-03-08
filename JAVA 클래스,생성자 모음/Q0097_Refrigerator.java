package com.test.question;

public class Q0097_Refrigerator {

	private Q0097_item[] list = new Q0097_item[100];
	
	private int index = 0;
	
	public void add(Q0097_item item) {
		Q0097_item t = new Q0097_item();
		
		list[index]=item;
		index++;
		
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n",item.getName());
		System.out.println();
		
	}
	
	public Q0097_item get(String name) {
		
		Q0097_item item = null;
		int itemIndex = -1;
		
		for(int i=0; i<index; i++) {
			if(this.list[i].getName().equals(name)){
				item = this.list[i];
				itemIndex = i;
				this.index--;
				break;
			}
		}
		if (item != null) {
			for(int i=itemIndex; i<index; i++) {
				this.list[i] = this.list[i+1];
			}
		}
		
		return item;
		
	}
	
	public int count() {
		
		return this.index;
	}
	
	public void listItem() {
		
		System.out.println("[냉장고 아이템 목록]");
		
		
		
		if(index>0) {
			for(int i=0; i<index; i++) {
				
				Q0097_item t = this.list[i];
				
				System.out.printf("%s(%s)\n",t.getName(), t.getExpiration());
			}
		}
		else if(index<0) {
			System.out.println("냉장고 안에 물건이 없습니다.");
		}
		System.out.println();
	}
}
