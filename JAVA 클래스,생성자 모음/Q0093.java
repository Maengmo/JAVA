package com.test.question;

public class Q0093 {

	public static void main(String[] args) {
		
		Q0093_Note note = new Q0093_Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());


		Q0093_Note note2 = new Q0093_Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
		
		Q0093_Note note3 = new Q0093_Note();
		
		
		note3.setSize("A4");
		note3.setColor("검정색");
		note3.setPage(100);
		note3.setOwner("김대환");

		System.out.println(note3.info());

	}

}
