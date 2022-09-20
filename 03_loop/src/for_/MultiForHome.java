package for_;

public class MultiForHome {

	public static void main(String[] args) {
		for (int b = 0; b <= 3; b++) {
			for (int s = 1; s <= 9; s++) {
				for (int f = 2; f <= 9; f++) {
					System.out.print(f + " * " + s + " = " + f * s + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
