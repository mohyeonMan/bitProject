package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("배열 크기 입력 : ");
		int size = scan.nextInt();

		int[] ar = new int[size];
		int sum = 0;
		int min;
		int max;
		System.out.println();

		for (int i = 0; i < size; i++) {
			System.out.print("ar[" + i + "] 입력 : ");
			ar[i] = scan.nextInt();
//			sum+= ar[i];
		}
		max = min = ar[0];
		for (int i : ar) {
			System.out.print(i + "  ");
			sum += i;
			if (i > max) max = i;
			if (i < min) min = i;
		}
		System.out.println("\n\n합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);

	}

}

/*
 * 배열의 크기 입력 : 3
 * 
 * ar[0] 입력 : 25 ar[0] 입력 : -50 ar[0] 입력 : 78
 * 
 * 25 -50 78 합 = xxx
 * 
 */