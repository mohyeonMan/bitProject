package array;

import java.util.Arrays;

public class SellectionSort {

	public static void main(String[] args) {
		int[] ar = { 35, 48, 25, 72, 50,45,456,7,9,5,3,2,4,47,8,6, };

		System.out.print("정렬 전 : ");
		for (int data : ar) {
			System.out.print(data + " ");

		}
		System.out.println();

//		Arrays.sort(ar); // sort 오름차순. 최소값을 치환.
		for (int j = 0; j < ar.length-1; j++) {
			for (int i = j+1; i < ar.length; i++)
				if (ar[j] > ar[i]) {
					int temp = ar[j];  // temptation
					ar[j] = ar[i];
					ar[i] = temp;

				}
		}

		System.out.print("정렬 후 : ");
		for (int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

}
