package com.test.question;

public class Q0093_Note {
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	
	int sum = 0;
	
	//*****************사이즈
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		
		if(size.equals("A3")||size.equals("A4")||size.equals("A5")
				||size.equals("B3")||size.equals("B4")||size.equals("B5")) {
			this.size = size;
		}else {
			System.out.println("사이즈를 잘 못 입력하셨습니다.");
		}
	}
	
	//*****************색상

	public void setColor(String color) {
		if(color.equals("검정색")||color.equals("흰색")||color.equals("노란색")||color.equals("파란색")) {
			this.color = color;
		}else {
			System.out.println("색상을 잘 못 입력하셨습니다.");
		}
	}
	
	//*****************페이지
	public void setPage(int page) {
		if(page>=10&&page<200) {
			this.page = page;
		}else {
			System.out.println("페이지를 잘 못 입력하셨습니다.");
		}
	}
	
	//*****************소유자이름
	public void setOwner(String owner) {
		if(owner.length()>=2&&owner.length()<5) {
			for(int i=0; i<owner.length(); i++) {
				char search = owner.charAt(i);
				if(search>='가'&&search<='힣') {
					sum++;
				}
			}
			if(sum==owner.length()) {
			this.owner = owner;
			}else {
				System.out.println("이름을 잘 못 입력하셨습니다.");
			}
		}else {
			System.out.println("이름을 잘 못 입력하셨습니다.");
		}
		
		/*if(checkLength(owner&&checkKorean(owner)) {
			this.owner = owner;
		} else {
			System.out.println("잘못된 owner 입력");
		}
		
		if(checkKorean(owner)) {
		
		public boolean checkKorean(String owner) {
			for (int i=0; i<owner.length(); i++){
				char c = owner.charAt(i);
				if(c<'가' || c>힣) {
					return false;
					}
				}
			}
		
		public boolean cheeckLength(String owner) {
		
			if(owner.length() >= 2 && owner.length() <=5) {
				return true;
			}else {
				return false;
			}
		
		}
		*/
	}
	
	public String info() {
		
		this.price = 500;
		
		if(this.size.equals("A3")) {
			price += 400;
		}else if(this.size.equals("A4")) {
			price += 200;
		}else if(this.size.equals("B3")) {
			price += 500;
		}else if(this.size.equals("B4")) {
			price += 300;
		}else if(this.size.equals("B5")) {
			price += 100;
		}
		
		if(this.color.equals("검정색")) {
			price += 100;
		}else if(this.color.equals("노란색")) {
			price += 200;
		}else if(this.color.equals("파란색")) {
			price += 200;
		}
		
		if(this.page>10) {
			price += (this.page-10)*10;
		}
		
		String tempPage = "";
		
		if(this.page >=10 && this.page <=50) {
			tempPage += "얇은";
		}else if(this.page >50 && this.page <=100) {
			tempPage += "보통";
		}else if(this.page >100 && this.page <=200) {
			tempPage += "두꺼운";
		}
		
		String result = "";
		
		result += "■■■■■■ 노트 정보 ■■■■■■\n";
		
		if(this.owner != null) {
			result += String.format("소유자 : %s\n", this.owner);
			result += String.format("특성 : %s %s %s노트 \n", this.color, tempPage, this.size);
			result += String.format("가격 : %,d원\n", this.price);
		} else {
			result += "주인 없는 노트\n";
		}
		
		result += "■■■■■■■■■■■■■■■■■■■■■■\n";
		
		return result;
	}
	
	
	
}
