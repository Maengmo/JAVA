package com.test.question;

import java.util.Arrays;

public class Q0096_Box {
	
	private Q0096_Macaron[] list = new Q0096_Macaron[10];
	
	public void cook() {
		
		String [] Color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
		
		for(int i=0; i<list.length; i++) {
			
			Q0096_Macaron m = new Q0096_Macaron();
			
			m.setSize((int)(Math.random()*11)+5);
			m.setColor(Color[(int)(Math.random()*Color.length)]);
			m.setThickness((int)(Math.random()*21));
			
			this.list[i] = m;
		}
		
		System.out.printf("마카롱 %d개를 만들었습니다\n", list.length);
		System.out.println();
	}
	
	public void check() {
		
		int pass = 0;
		int failed = 0;
		
		for(int i=0; i<list.length; i++) {
			
			Q0096_Macaron m = this.list[i];
			
			if(check(m)) {
				pass++;
				list[i].setResult("합격");
			}else {
				failed++;
				list[i].setResult("불합격");
			}
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d 개\n", pass);
		System.out.printf("QC 불합격 개수 : %d 개\n", failed);
		System.out.println();
		
	}
	
	public void list() {
		
		System.out.println("[마카롱 목록]");
		
		for(int i=0; i<list.length; i++) {
			
			Q0096_Macaron m = this.list[i];
			
			if(check(m)) {
				System.out.printf("%d번 마카롱 : %dcm(%s,%dmm) : 합격\n", i, m.getSize(), m.getColor(), m.getThickness() );
				
			}
			else {
				System.out.printf("%d번 마카롱 : %dcm(%s,%dmm) : 불합격\n", i, m.getSize(), m.getColor(), m.getThickness() );
			}
			
			
		}
		
	}
	
	public boolean check(Q0096_Macaron m) {
		
		if(m.getSize()<8||m.getSize()>14) {
			return false;
		}
		if(m.getColor().equals("black")) {
			return false;
		}
		if(m.getThickness()<3 || m.getThickness()>18) {
			return false;
		}
		return true;
	}
	
}
