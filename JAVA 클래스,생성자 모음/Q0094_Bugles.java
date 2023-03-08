package com.test.question;

import java.util.Calendar;

public class Q0094_Bugles {
	
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expiration;
	
	int time = 0;
	int money = 0;
	
//******************************
	
	public int getPrice() {
		return price;
	}
	
	//******************************
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		
		if(weight==300||weight==500||weight==850) {
			this.weight = weight;
		}else {
			System.out.println("용량을 잘 못 입력하셨습니다.");
		}
		
		if(weight==300) {
			this.price = 850;
			this.expiration = 7;
		}else if(weight==500) {
			this.price = 1200;
			this.expiration = 10; 
		}else if(weight==850) {
			this.price = 1950;
			this.expiration = 15;
		}
	}
	
	//******************************
	
	public void setCreationTime(int year, int month, int date) {
		
		Calendar creationTime = Calendar.getInstance();
		creationTime.set(year, month-1, date);
		
		this.creationTime = creationTime;
		
		
	}
	
	
	//******************************
	
	public int getExpiration() {
		Calendar today = Calendar.getInstance();
		return this.expiration += (int)((this.creationTime.getTimeInMillis()-today.getTimeInMillis())/1000/60/60/24);
		
	}
	
	public void eat() {
		
		if(getExpiration() >= 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
	}
	
}
