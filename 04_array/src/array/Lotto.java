package array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] lotto = new int[6];
		System.out.print("금액을 입력하세요 : ");
		int count = (scan.nextInt() / 1000);
		System.out.println();

		for (int m = 0; m < count; m++) {
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 44 + 1);

				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			for (int a : lotto) {
				System.out.printf("%5d",a);
			}
			System.out.println();
			if((m+1)%5==0) System.out.println();
		}
	}
}