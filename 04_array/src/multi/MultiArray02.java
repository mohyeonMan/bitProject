package multi;

public class MultiArray02 {
	public static void main(String[] args) {

		int[][] ar = new int[10][10];
		int a = 0;

//		for (int i = 0; i < ar.length; i++) {
//			for (int j = 0; j < ar[i].length; j++) {
//				a++;
//				ar[i][j] = a;
//			}
//		}

		// 가로 -> 세로.
//		for (int i = 0; i < ar.length; i++) {				
//			for (int j = 0; j < ar[i].length; j++) {
//				a++;
//				ar[j][i] = a;
//			}
//
//		}

		// 역순
//		for (int i = ar.length - 1; i >= 0; i--) {
//			for (int j = ar[i].length - 1; j >= 0; j--) {
//				a++;
//				ar[i][j] = a;
//			}
//
//		}

		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
	}

}
//printf 와 String.format 의 다른점?
//https://blog.naver.com/yoojin7526/222272360004
