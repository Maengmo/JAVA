package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Q0126 {

	public static void main(String[] args) {
		
		m1();

	}

	private static void m1() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("/Users/kimdaehwan/Desktop/Quest/파일_입출력_문제/출결.dat"));
			ArrayList<Employee> list = new ArrayList<Employee>();
			
			String line = null;
			String name = "";
			
			while ((line = reader.readLine()) != null) {
				
				String [] temp = line.split(",");
				
				Employee e = getEmployee(list, temp[1]);
				
				if(e==null) {
					e = new Employee(temp[1], 0, 0);
					list.add(e);
				}
				
				if(temp[2].compareTo("9:00")>0) {
					e.in++;
				}
				
				if(temp[3].compareTo("18:00")<0) {
					e.out++;
				}
				
			}
			
			System.out.println("[이름]\t[지각]\t[조퇴]");
			
			for(Employee e : list) {
				System.out.printf("%s\t%2d회\t%3d회\n"
								, e.name
								, e.in
								, e.out);
			}
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static Employee getEmployee(ArrayList<Employee> list, String name) {
		
		for(Employee e : list) {
			if(e.name.equals(name)) {
				return e;
			}
		}
		return null;
	}

}
class Employee {
	public String name;
	public int in;
	public int out;
	
	public Employee(String name, int in, int out) {
		this.name = name;
		this.in = in;
		this.out = out;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", in=" + in + ", out=" + out + "]";
	}
	
}
