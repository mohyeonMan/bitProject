package multi;

public class MultiArray01 {

	public static void main(String[] args) {
		int[][] ar = new int[3][2];
		int a = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++, a++) {
				ar[i][j] = a * 10;
				System.out.println("ar[" + i + "][" + j + "] = " + ar[i][j]);
			}
		}

	}
}
