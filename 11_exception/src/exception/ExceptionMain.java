package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) { // 빨간줄없다 = 컴파일 Exception 아니다.
		if (args.length > 0) {
			System.out.println("args[0] = " + args[0]);
		}
		System.out.println();

		try {
			int num = Integer.parseInt(args[0]);

			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 입력: ");
			int num2 = scan.nextInt();

			System.out.println(num + " / " + num2 + " = " + (num / num2));
		} catch (NumberFormatException e) {
			System.out.println("반드시 숫자만 가능합니다.");
		}
	}
}
