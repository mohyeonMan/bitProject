package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ch = 2;// 답변기회
		int num = 0;// 문제번호
		int correct = 0;
		while (true) {
			System.out.println("수학 장학퀴즈. 그런데 이제 쉬운.\n");
			for (num = 0; num < 5;) {
				int a = (int) (Math.random() * 79 + 10); // 첫번째 변수
				int b = (int) (Math.random() * 79 + 10); // 두번째 변수
				System.out.println(a + b);
				num++;
				for (int i = ch - 1; i >= 0; i--) {
					System.out.print("[" + num + "] " + a + " + " + b + " = ");
					int c = scan.nextInt();
					if (c == a + b) {
						System.out.println("정답. ");
						correct++;
						break;
					} // 정답
					else {
						if (i == 0) {
							System.out.println(ch + "번 안에 맞추지 못하셨습니다.");
						} else {
							System.out.println("오답. " + i + "번의 기회가 남았습니다.");
						} // 횟수 고지
					} // 게임오버
				} // 문제포문
			} // 문제번호
			System.out.println("********게임종료********");
			if (num == correct)
				System.out.println("만점입니다! 대단하네요.");
			else
				System.out.println(num + "문제중" + correct + "문제 정답.");

			System.out.print("다시 하시겠습니까? (Y/N) : ");
				String yn=scan.next();
				for (;;) {
				if (yn.equals("N") || yn.equals("n")||yn.equals("Y") || yn.equals("y"))
					break; 
				else
					System.out.println("똑바로 쓰세요. : ");
				 	yn=scan.next();
				}if(yn.equals("N") || yn.equals("n"))
					break;
		
			System.out.println("******게임 진짜 종료******");
		}
	}
}
