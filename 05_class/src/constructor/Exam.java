package constructor;

import java.util.Scanner;

public class Exam {

	private String name;
	private String dap;
	private char[] ox = new char[5];
	private int score = 0;
	private final String JUNG = "11111"; // 상수화

	public Exam() {
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("답 입력 : ");
		dap = scan.next();
	}

	public void compare() {
		for (int j = 0; j < ox.length; j++) {
			if (dap.charAt(j) == JUNG.charAt(j)) {
				ox[j] = 'O';
				score++;
			} else
				ox[j] = 'X';
		}
	}

	public String getName() {
		return name;
	}

	public char[] getOx() {
		return ox;

	}

	public int getScore() {
		return score;
	}

}
