package com.test.question;

public class Q0101 {

	public static void main(String[] args) {
		
		//바리스타
		Barista barista = new Barista();

		//손님 1
		//에스프레소 1잔 주문 - 원두 30g
		Espresso e1 = barista.makeEspresso(30);
		e1.drink();

		//손님 2
		//라테 1잔 주문 - 원두 30g, 우유 250ml
		Latte l1 = barista.makeLatte(30, 250);
		l1.drink();

		//손님 3
		//아메리카노 1잔 주문 - 원두 30g, 물 300ml, 각얼음 20개
		Americano a1 = barista.makeAmericano(30, 300, 20);
		a1.drink();

		//손님 4
		//에스프레소 10잔 주문 - 원두 25g
		Espresso[] e2 = barista.makeEspressoes(25, 10);

		for (Espresso e : e2) {
		      e.drink();
		}

		//손님 5
		//라테 5잔 주문 - 원두 25g, 우유 300ml
		Latte[] l2 = barista.makeLattes(25, 300, 5);

		for (Latte l : l2) {
		      l.drink();
		}

		//손님 6
		//아메리카노 15잔 주문 - 원두 20g, 물 350ml, 각얼음 30개
		Americano[] a2 = barista.makeAmericanoes(20, 350, 30, 15);

		for (Americano a : a2) {
		      a.drink();
		}

		//결산
		barista.result();

	}//main

}//main class

//*************************************************
class Coffee {
	
	public static int bean;					//총 원두량
	public static int water;				//총 물량
	public static int ice;					//총 얼음 개수
	public static int milk;					//총 우유 량
	
	public static int beanUnitPrice;		//원두 단가(원) 1g당 1원
	public static double waterUnitPrice;	//물 단가(원) 1ml당 0.2원
	public static int iceUnitPrice;			//얼음 단가(원) 1개당 3원
	public static int milkUnitPrice;		//우유 단가(원) 1ml당 4원
	
	public static int beanTotalPrice; 		//원두 총 판매액(원)
	public static int waterTotalPrice;		//물 총 판매액(원)
	public static int iceTotalPrice;		//얼음 총 판매액(원)
	public static int milkTotalPrice;		//우유 총 판매액(원)
	public static int TotalPrice;			//총 합계 판매액(원)
	
	public static int americano;			//아메리카노 총 판매 개수(잔)
	public static int latte;				//라떼 총 판매 개수(잔)
	public static int espresso;				//에스프레소 총 판매 개수(잔)
	
	static {
		Coffee.bean = 0;
		Coffee.water = 0;
		Coffee.ice = 0;
		Coffee.milk = 0;
		
		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2;
		Coffee.iceUnitPrice = 3;
		Coffee.milkUnitPrice = 4;
		
		Coffee.beanTotalPrice = 0;
		Coffee.waterTotalPrice = 0;
		Coffee.beanTotalPrice = 0;
		Coffee.milkTotalPrice = 0;
		Coffee.TotalPrice = 0;
		
		Coffee.americano = 0;
		Coffee.latte = 0;
		Coffee.espresso = 0;
	}

	public static int getBean() {
		return bean;
	}

	public static int getWater() {
		return water;
	}

	public static int getIce() {
		return ice;
	}

	public static int getMilk() {
		return milk;
	}

	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}

	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}

	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}

	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}

	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}

	public static int getWaterTotalPrice() {
		return waterTotalPrice;
	}

	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}

	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static int getTotalPrice() {
		return TotalPrice;
	}

	public static int getAmericano() {
		return americano;
	}

	public static int getLatte() {
		return latte;
	}

	public static int getEspresso() {
		return espresso;
	}
	
	public static void countCoffee(Espresso espresso) {
		Coffee.espresso++;
		Coffee.bean += espresso.getBean();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * espresso.getBean();
		Coffee.TotalPrice += beanTotalPrice;
	}
	
	public static void countCoffee(Latte latte) {
		Coffee.latte++;
		Coffee.bean += latte.getBean();
		Coffee.milk += latte.getMilk();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * latte.getBean();
		Coffee.milkTotalPrice += Coffee.milkUnitPrice * latte.getMilk();
		Coffee.TotalPrice += beanTotalPrice;
	}
	
	public static void countCoffee(Americano americano) {
		Coffee.americano++;
		Coffee.bean += americano.getBean();
		Coffee.water += americano.getWater();
		Coffee.ice += americano.getIce();
		Coffee.beanTotalPrice += Coffee.beanUnitPrice * americano.getBean();
		Coffee.waterTotalPrice += Coffee.waterUnitPrice * americano.getWater();
		Coffee.iceTotalPrice += Coffee.iceUnitPrice * americano.getIce();
		Coffee.TotalPrice += beanTotalPrice;
	}
}

//*************************************************
class Espresso {
	private int bean;
	
	Espresso(int bean){
		this.bean = bean;
	}
	public int getBean() {
		return bean;
	}

	public void drink() {
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.\n", bean);
	}
}

//*************************************************
class Latte {
	private int bean;
	private int milk;
	
	Latte(int bean, int milk){
		this.bean = bean;
		this.milk = milk;
	}
	
	public int getBean() {
		return bean;
	}
	public int getMilk() {
		return milk;
	}

	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라떼를 마십니다.\n", bean, milk);
	}
}

//*************************************************
class Americano {
	private int bean;
	private int water;
	private int ice;
	
	Americano(int bean, int water, int ice) {
		this.bean = bean;
		this.water = water;
		this.ice = ice;
	}
	
	public int getBean() {
		return bean;
	}
	public int getWater() {
		return water;
	}
	public int getIce() {
		return ice;
	}
	
	public void drink() {
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n", bean, water, ice );
	}
	
}

//*************************************************
class Barista {
	
	public Espresso makeEspresso(int bean) {
		
		Espresso espresso = new Espresso(bean);
		Coffee.countCoffee(espresso);
		
		return espresso;
	}
	
	public Latte makeLatte(int bean, int milk) {
		
		Latte latte = new Latte(bean, milk);
		Coffee.countCoffee(latte);
		
		return latte;
	}
	
	public Americano makeAmericano(int bean, int water, int ice) {
		
		Americano americano = new Americano(bean, water, ice);
		Coffee.countCoffee(americano);
		
		return americano;
	}
	
	public Espresso[] makeEspressoes(int bean, int count) {
		
		Espresso[] espressoes = new Espresso[count];
		for(int i=0; i<espressoes.length; i++) {
			Espresso espresso = new Espresso(bean);
			Coffee.countCoffee(espresso);
			espressoes[i] = espresso;
		
		}
		return espressoes;
	}
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		
		Latte[] lattes = new Latte[count];
		for(int i=0; i<lattes.length; i++) {
			Latte latte = new Latte(bean, milk);
			Coffee.countCoffee(latte);
			lattes[i] = latte;
		
		}
		return lattes;
	
	}
	
	public Americano[] makeAmericanoes(int bean, int water, int ice, int count) {
		
		Americano[] americanoes = new Americano[count];
		for(int i=0; i<americanoes.length; i++) {
			Americano americano = new Americano(bean, water, ice);
			Coffee.countCoffee(americano);
			americanoes[i] = americano;
		
		}
		return americanoes;
	
	}
	
	public void result() {
		System.out.println("========================================");
		System.out.println("판매 결과");
		System.out.println("========================================");
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("음료 판매량");
		System.out.println("----------------------------------------");
		System.out.printf("에스프레소 : %d잔\n", Coffee.getEspresso());
		System.out.printf("아메리카노 : %d잔\n", Coffee.getAmericano());
		System.out.printf("라떼 : %d잔\n", Coffee.getLatte());
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("----------------------------------------");
		System.out.printf("원두 : %,dg\n", Coffee.getBean());
		System.out.printf("물 : %,dml\n", Coffee.getWater());
		System.out.printf("얼음 : %,d개\n", Coffee.getIce());
		System.out.printf("우유 : %,dml\n", Coffee.getMilk());
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("매출액");
		System.out.println("----------------------------------------");
		System.out.printf("원두 : %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,d원\n", Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n", Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원\n", Coffee.getMilkTotalPrice());
		System.out.printf("총 합계 금액 : %,d원\n", Coffee.getTotalPrice());
		System.out.println();
		
	
	}	
}


