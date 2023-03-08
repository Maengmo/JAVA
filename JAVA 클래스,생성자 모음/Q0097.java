package com.test.question;

public class Q0097 {

	public static void main(String[] args) {
		
		Q0097_Refrigerator r = new Q0097_Refrigerator();
		
		Q0097_item i1 = new Q0097_item();
		
		i1.setName("김치");
		i1.setExpiration("2023-03-04");
		r.add(i1); //냉장고에 넣기
		
		Q0097_item i2 = new Q0097_item();
		
		i2.setName("깍두기");
		i2.setExpiration("2023-02-25");
		r.add(i2); //냉장고에 넣기
		
		Q0097_item i3 = new Q0097_item();
		
		i3.setName("멸치볶음");
		i3.setExpiration("2023-02-27");
		r.add(i3); //냉장고에 넣기
		
		r.listItem();
		
		Q0097_item i4 = r.get("깍두기");
		
		System.out.printf("%s의 유통기한 : %s\n", i4.getName(), i4.getExpiration());
		
		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());
		
		r.listItem();
		
	}

}
