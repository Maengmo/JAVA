package com.test.question;

public class Q0099 {

	public static void main(String[] args) {
		
		Q0099_Time t1 = new Q0099_Time();
		System.out.println(t1.info());
		
		Q0099_Time t2 = new Q0099_Time(2,30,45);
		System.out.println(t2.info());
		
		Q0099_Time t3 = new Q0099_Time(1,70,30);
		System.out.println(t3.info());
		
		Q0099_Time t4 = new Q0099_Time(30,10);
		System.out.println(t4.info());
		
		Q0099_Time t5 = new Q0099_Time(90,10);
		System.out.println(t5.info());
		
		Q0099_Time t6 = new Q0099_Time(50);
		System.out.println(t6.info());
		
		Q0099_Time t7 = new Q0099_Time(10000);
		System.out.println(t7.info());
	}

}
