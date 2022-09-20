package array;

public class Array01 {

	public static void main(String[] args) {

		int[] arr;
		arr = new int[5];
		arr[0] = 25;
		arr[1] = 78;
		arr[2] = 30;
		arr[3] = 43;
		arr[4] = 52;

		System.out.println("배열명 arr = " + arr);// Integer의 I로 시작한다.
		System.out.println("배열의 크기 = " + arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		System.out.println("\n거꾸로 출력\n");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}

		System.out.println("\n짝수만 출력\n");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				System.out.println("arr[" + i + "] = " + arr[i]);
		}

		System.out.println("\n확장 for문\n");
		for(int i:arr) {
			System.out.println(i);
		}

	}
}
