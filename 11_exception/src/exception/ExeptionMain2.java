package exception;

import java.util.Scanner;

public class ExeptionMain2 {
	int x;
	int y;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("x 입력 : ");
		x = scan.nextInt();
		System.out.print("y 입력 : ");
		y = scan.nextInt();
	}

	public void output() {
		if (y >= 0) {
			int xy = 1;
			for (int i = 0; i < y; i++) {
				xy *= x;
			}
			System.out.println(x + "의 " + y + "승은 " + xy);
		}
		else
//			System.out.println("y는 0보다 크거나 같아야 합니다.");
			//개발자가 강제로 Exeption 발생.
			try {
			throw new Exception("y는 0보다 크거나 같아야 합니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		ExeptionMain2 exeptionMain2 = new ExeptionMain2();
		exeptionMain2.input();
		System.out.println("---------");
		exeptionMain2.output();
	}
}