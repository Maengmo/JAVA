package com.test.question;

public class Q0099_Time {
	
	private int hour;
	private int minute;
	private int second;


public Q0099_Time() {
	
}

public Q0099_Time(int hour, int minute, int second) {
	this.hour = hour;
	this.minute = minute;
	this.second = second;
}

public Q0099_Time(int minute, int second) {
	this.minute = minute;
	this.second = second;
}

public Q0099_Time(int second) {
	this.second = second;
}

String info() {
	int hour_plus = 0;
	int minute_plus = 0;
	
	if(this.minute>=60) {
		hour_plus=this.minute/60;
		this.minute=this.minute%60;
		this.hour+=hour_plus;
	}
	
	if(this.second>=60) {
		minute_plus=this.second/60;
		this.second=this.second%60;
		this.minute+=minute_plus;
		
		if(this.minute>=60) {
			hour_plus=this.minute/60;
			this.minute=this.minute%60;
			this.hour+=hour_plus;
		}
	}
	
	return String.format("%02d:%02d:%02d", this.hour,this.minute,this.second);
	
	
}


}