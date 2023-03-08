package com.test.question;

public class Q0100 {

	public static void main(String[] args) {
		//Packer : 사무용품을 포장하는 직원
		//포장하는 직원
		Packer packer = new Packer();

		//연필
		Pencil p1 = new Pencil();
		p1.setHardness("HB");
		packer.packing(p1);

		Pencil p2 = new Pencil();
		p2.setHardness("4B");
		packer.packing(p2);

		//지우개
		Eraser e1 = new Eraser();
		e1.setSize("Large");
		packer.packing(e1);

		//볼펜
		BallPointPen b1 = new BallPointPen();
		b1.setThickness(0.3);
		b1.setColor("black");
		packer.packing(b1);

		BallPointPen b2 = new BallPointPen();
		b2.setThickness(1.5);
		b2.setColor("red");
		packer.packing(b2);

		//자
		Ruler r1 = new Ruler();
		r1.setLength(30);
		r1.setShape("줄자");
		packer.packing(r1);

		//결과 확인
		packer.countPacking(0);
		packer.countPacking(1);
		packer.countPacking(2);
		packer.countPacking(3);
		packer.countPacking(4);
		
	}

}

class Pencil {
	
	private String hardness;

	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		
		this.hardness = hardness;
	}
	
	public String info() {
		return String.format("%s 진하기 연필", this.hardness);
	}
	
}

class Eraser {
	private String Size;

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}


	public String info() {
		return String.format("%s 사이즈 지우개", this.Size);
	}
}

class BallPointPen {
	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		return String.format("%s 색상 %.1f 볼펜", this.color, this.thickness);
	}
	
}

class Ruler {
	private int length;
	private String shape;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	public String info() {
		return String.format("%dcm %s", this.length, this.shape);
	}
}

class Packer {
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;
	
	public void packing(Pencil pencil) {
		
		System.out.printf("포장 전 검수 : %s입니다.\n", pencil.info());
		
		if(pencil.getHardness().equals("4B")||pencil.getHardness().equals("3B")||pencil.getHardness().equals("2B")
				||pencil.getHardness().equals("B")||pencil.getHardness().equals("HB")||pencil.getHardness().equals("H")
				||pencil.getHardness().equals("2H")||pencil.getHardness().equals("3H")||pencil.getHardness().equals("4H")) {
			pencilCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("불량입니다. 포장을 실패했습니다.");
		}
	
	}//pencil
	
	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수 : %s입니다.\n", eraser.info());
		
		if(eraser.getSize().equals("Large")||eraser.getSize().equals("Medium")||eraser.getSize().equals("Small")) {
			eraserCount++;
			System.out.println("포장을 완료했습니다.");
		}else {
			System.out.println("불량입니다. 포장을 실패했습니다.");
		}
	}//eraser
	
	public void packing(BallPointPen BPP) {
		System.out.printf("포장 전 검수 : %s입니다.\n", BPP.info());
		
		if(BPP.getColor().equals("red")||BPP.getColor().equals("blue")
				||BPP.getColor().equals("green")||BPP.getColor().equals("black")){
			if(BPP.getThickness()==0.3||BPP.getThickness()==0.5||BPP.getThickness()==0.7
					||BPP.getThickness()==1||BPP.getThickness()==1.5) {
				ballPointPenCount++;
				System.out.println("포장을 완료했습니다.");
			}
		}else {
			System.out.println("불량입니다. 포장을 실패했습니다.");
		}
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %s입니다.\n", ruler.info());
		
		if(ruler.getLength()==30||ruler.getLength()==50||ruler.getLength()==100) {
			if(ruler.getShape().equals("줄자")||ruler.getShape().equals("운형자")
					||ruler.getShape().equals("삼각자")) {
				rulerCount++;
				System.out.println("포장을 완료했습니다.");
			}
		}else {
			System.out.println("불량입니다. 포장을 실패했습니다.");
		}
	}
	
	public void countPacking(int type) {
		 
		System.out.println("=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		
		if(type==0) {
			System.out.printf("연필 %d회\n", Packer.pencilCount);
			System.out.printf("지우개 %d회\n", Packer.eraserCount);
			System.out.printf("볼펜 %d회\n", Packer.ballPointPenCount);
			System.out.printf("자 %d회\n", Packer.rulerCount);
		}else if(type==1) {
			System.out.printf("연필 %d회\n", Packer.pencilCount);
		}else if(type==2) {
			System.out.printf("지우개 %d회\n", Packer.eraserCount);
		}else if(type==3) {
			System.out.printf("볼펜 %d회\n", Packer.ballPointPenCount);
		}else if(type==4) {
			System.out.printf("자 %d회\n", Packer.rulerCount);
		}
	}
	
}