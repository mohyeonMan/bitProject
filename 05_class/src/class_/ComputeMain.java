package class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Compute[] aa = new Compute[8]; // 자료형을 Object로 받으면 다른 클래스도 받을수있다. (( 상속 , 업캐스팅 ))
										// Object<> 제너릭 // 상속 받는 클래스중 <>클래스만 받는다.
		// 입력
		for (int i = 0; i < aa.length; i++) {
			aa[i] = new Compute();
			System.out.print("[" + (i + 1) + "] X 입력 : ");
			aa[i].setX(scan.nextInt());
			System.out.print("[" + (i + 1) + "] Y 입력 : ");
			aa[i].setY(scan.nextInt());
			// 계산
			aa[i].calc();
			System.out.println();
		}

		// 출력
		System.out.print("X\tY\tSUM\tSUB\tMUL\tDIV" 
		+ "\n---------------------------------------------\n");
		for (int i = 0; i < aa.length; i++) {
			aa[i].showInfoCalc();
		}
		System.out.println("---------------------------------------------");
	}
}
