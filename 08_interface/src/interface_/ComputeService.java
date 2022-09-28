package interface_;

import java.util.Scanner;

public class ComputeService {

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;

		Compute compute = null;

		for (;;) {
			System.out.println(
				"************************\n"
			+		"\t1. 합\n"
			+		"\t2. 차\n"
			+		"\t3. 곱\n"
			+		"\t4. 몫\n"
			+		"\t5. 끝내기\n"
			+	"************************");

			System.out.print("\t\t메뉴 : ");
			num = scan.nextInt();

			if (num == 5)
				break;
			else if (num == 1)
				compute = new Sum();
			else if (num == 2)
				compute = new Sub();
			else if (num == 3)
				compute = new Mul();
			else if (num == 4)
				compute = new Div();

			compute.disp();
		}
	}
}
