package while_;

public class DoWhile {

	public static void main(String[] args) {

		char ch = 'A';
		int count = 0;

		do {
			System.out.print(ch + " ");
			ch++;
			count++;
			if ((ch - 'A') % 7 == 0) {// count넣어도 상관없다.
				System.out.println();
			}
		} while (ch <= 'Z');

	}
}
