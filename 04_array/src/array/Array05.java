package array;

public class Array05 {// 무작위의 문자배열을 만들고 문자별 수량을 출력하라.

	public static void main(String[] args) {

		char[] ar = new char[50];
		int[] list = new int[26];

		for (int i = 0; i < 50; i++) {
			char a = (char) ((Math.random() * 25) + 65);
			ar[i] = a;
			System.out.print(ar[i] + " ");
			list[a - 65]++;//
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();

		for (int i = 0; i <= 25; i++) {
			System.out.println((char) (i + 65) + " : " + list[i]);
		}
	}
}
