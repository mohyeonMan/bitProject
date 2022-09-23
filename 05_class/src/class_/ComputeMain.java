package class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Compute[] aa = new Compute[8];

		// 입력
		for (int i = 0; i < aa.length; i++) {
			aa[i] = new Compute();
			System.out.print("["+(i+1)+"] X 입력 : ");
			aa[i].setX(scan.nextInt());
			System.out.print("["+(i+1)+"] Y 입력 : ");
			aa[i].setY(scan.nextInt());
			// 계산
			aa[i].calc();
			System.out.println();
		}
		
		// 출력
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV" + "\n---------------------------------------------");
		for (int i = 0; i < aa.length; i++) {
			aa[i].showInfoCalc();
		}
		System.out.println("---------------------------------------------");
	}

}
