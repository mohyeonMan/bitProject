package for_;

public class MultiForHome {

	public static void main(String[] args) {
		int a=2;
		for (int i = 0; i < 3; i++,a+=3) {
			for (int s = 1; s <= 9; s++) {
				for (int f =a; f <=a+2; f++) {
					if(f==10)continue;
					System.out.print(f + " * " + s + " = " + f * s + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
