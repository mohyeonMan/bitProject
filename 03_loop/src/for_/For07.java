package for_;

import java.util.Scanner;

public class For07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int a = scan.nextInt();
		int pac = 1;

		for (int r = 1; r <= a; r++) {
			pac *= r;
		}
		System.out.print(a + "! = " + pac);
	}

}
