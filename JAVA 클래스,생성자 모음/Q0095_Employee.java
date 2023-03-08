package com.test.question;

public class Q0095_Employee {

	private String name;
	private String department;
	private String position;
	private String tel;
	private Q0095_Employee boss;
	
	//***********************************
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(checkLength(name)&&checkKorean(name)) {
		this.name = name;
		} else {
		System.out.println("잘못된 owner 입력");
		}
	}
	
	public boolean checkKorean(String name) {
		for (int i=0; i<name.length(); i++){
			char c = name.charAt(i);
			if(c<'가' || c>'힣') {
				return false;
				}
		}
		return true;
	}
	
	public boolean checkLength(String owner) {
	
		if(owner.length() >= 2 && owner.length() <=5) {
			return true;
		}else {
			return false;
		}
	}

	//***********************************
		
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		
		if(department.equals("영업부")||department.equals("기획부")
				||department.equals("총무부")||department.equals("개발부")
				||department.equals("홍보부")) {
			this.department = department;
		}else {
			System.out.println("부서를 잘 못 입력하셨습니다.");
		}
	}
	

	//***********************************
		
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		if(position.equals("부장")||position.equals("과장")
				||position.equals("대리")||position.equals("사원")){
					this.position = position;
		} else {
			System.out.println("직책을 잘 못 입력하셨습니다.");
		}
		
	}

	//***********************************
		
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		
		if(tel.charAt(3)=='-'&&tel.charAt(8)=='-') {
			this.tel = tel;
		}else {
			System.out.println("전화번호를 잘 못 입력하셨습니다.");
		}
		String temp = tel.replace("-", "");
		
		for(int i=0; i<temp.length(); i++) {
			
			char c = temp.charAt(i);
			
			if(c <'0' || c >'9') {
				return;
			}
			
		}
		this.tel = tel;
		
	}

	//***********************************
		
	public Q0095_Employee getBoss() {
		return boss;
	}
	
	public void setBoss(Q0095_Employee boss) {
		
		if(boss == null) {
			return;
		}
		
		if(this.name.equals(boss.getName()) && this.department.equals(boss.getDepartment()) 
				&& this.position.equals(boss.getPosition()) && this.tel.equals(boss.getTel())) {
			return;
		}
		
		if(!this.department.equals(boss.getDepartment())) {
			return;
		}
		this.boss = boss;
	}
	
	public void info() {
		
		System.out.printf("[%s]\n", this.name);
		System.out.printf("- 부서 : %s\n", this.department);
		System.out.printf("- 직위 : %s\n", this.position);
		System.out.printf("- 연락처 : %s\n", this.tel);
		
		if(this.boss != null) {
			System.out.printf("- 직속상사 : %s(%s %s)\n", this.boss.getName(), this.boss.getDepartment(), this.boss.getPosition());
			System.out.println();
		}else {
			System.out.println("- 직속상사 : 없음");
			System.out.println();
		}
	}
	
}














