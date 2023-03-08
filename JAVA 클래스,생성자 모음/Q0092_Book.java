package com.test.question;

import java.util.Arrays;

public class Q0092_Book {
	
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;
	
	//get이 읽기 set이 쓰기
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		
		if(title.length()>50) {
			return;
		}
		for(int i=0; i<title.length(); i++) {
			char search = title.charAt(i);
			
			if((search<'가'||search>'힣')&&(search<'A'||search>'Z')&&(search<'a'||search>'z')&&(search<'0'||search>'9')&&(search != ' ')) {
				return;
			}
		}
		this.title = title;
		
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>=0 && price<=1000000) {
		this.price = price;
		}else {
			return;
		}
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getPubYear() {
		return pubYear;
	}
	
	public void setPublisher(String publisher) {
		
		this.publisher = publisher;
	}
	
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if(page >= 1) {
			this.page = page; }
		return;
	}
	
	public String info() {
		
		String [] result = new String [7];
		
		String result2 = "";
		
		result[0] = "제목 : " + this.title;
		result[1] = "가격 : " + Integer.toString(this.price) + "원";
		result[2] = "저자 : " + this.author;
		result[3] = "출판사 : " + this.publisher;
		result[4] = "발행년도 : " + this.pubYear+"년";
		result[5] = "ISBN : " + this.isbn;
		result[6] = "페이지 : " + Integer.toString(this.page)+"장";
		
		for(int i=0; i<result.length; i++) {
			result2 += result[i]+"\r\n";
		}
		return result2;
		
	}
	
	
}
