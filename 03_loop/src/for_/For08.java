package for_;

import java.util.Scanner;

public class For08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("소수 찾기 : ");
			int sosu = scan.nextInt();

			if (sosu == 0)
				break;
			if (sosu < 0)
				continue;

			int count = 0;
			for (int i = 1; i <= sosu; i++) {
				if (sosu % i == 0) {
					System.out.print(i + " ");
					count++;
				}
			}
			System.out.println();
			if (count == 2)
				System.out.println(sosu + "는 소수입니다.");
			else
				System.out.println(sosu + "는 소수가 아닙니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}
}

/*
 * 0을 입력하면 종료 음수를 입력하면 다시입력.
 */