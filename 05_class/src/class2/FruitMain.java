package class2;

class Fruit {

	String pum;
	int jan;
	int feb;
	int mar;
	int tot;
	static int sumJan = 0;
	static int sumFeb = 0;
	static int sumMar = 0;

	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}

	public void calcTot() {
		tot = jan + feb + mar;
	}

	public void display() {
		System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}

	public static void output() {
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
	}
}

public class FruitMain {
	public static void main(String[] args) {
		Fruit[] f = new Fruit[3];
		f[0] = new Fruit("사과", 100, 80, 75);
		f[1] = new Fruit("포도", 30, 25, 10);
		f[2] = new Fruit("딸기", 25, 30, 90);
		
		System.out.println	("-----------------------------------"
				+ 			"\nPUM\tJAN\tFEB\tMAR\tTOT\n"
				+ 			"-----------------------------------");
	
		for (int i = 0; i < f.length; i++) {
			f[i].calcTot();
			f[i].display();
		}
		System.out.println	("-----------------------------------");
		Fruit.output();
	}
}
/*
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static


클래스 : FruitMain


[실행결과]
---------------------------------
PUM		JAN		FEB		MAR		TOT
---------------------------------
사과		100		80		75		255
포도		30		25		10		xxx
딸기		25		30		90		xxx
---------------------------------
		xxx		xxx		xxx			output()로 처리
*/