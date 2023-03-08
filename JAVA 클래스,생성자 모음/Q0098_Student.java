package com.test.question;

public class Q0098_Student {

	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Q0098_Student() {
		name = "미정";
		age = 0;
		grade = 0;
		classNumber = 0;
		number =0;
	}
	
	public Q0098_Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Q0098_Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	public Q0098_Student(int grade, int classNumber, int number) {
		this.name = "미정";
		this.grade=grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String info() {
		
		return String.format("%s(나이 : %s, 학년 : %s, 반 : %s, 번호 : %s)"
				, this.name
				, age != 0? this.age + "세" : "미정"
				, grade !=0? this.grade + "학년" : "미정"
				, classNumber !=0? this.classNumber + "반" : "미정"
				, number !=0? this.number : "미정");
	}
	
}
