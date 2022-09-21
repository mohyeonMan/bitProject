package array;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] user = new int[3];
		int[] com = new int[3];

		while (true) {// 게임 전체 회전
			System.out.print("게임을 시작할까요? (Y/N) : ");
			String start = scan.next();
			if (start.equals("n") || start.equals("N")) {
				break;// 게임 종료
			} else if (!start.equals("Y") && !start.equals("y")) {
				System.out.println("다시 입력하십시오.\n");
				continue;
			}
			System.out.println();
			for (int i = 0; i < com.length; i++) {
				com[i] = (int) (Math.random() * 8 + 1);
				for (int j = 0; j < i; j++) {
					if (com[j] == com[i]) {
						i--;
						break;
					}
				}

			} // com숫자 생성

			while (true) {
				for (int a : com) {
					System.out.print(a + " ");
				}
				System.out.println(); // com숫자 확인하기

				for (int i = 0; i < user.length; i++) {
					System.out.print("숫자" + (i + 1) + " 입력 : ");
					user[i] = scan.nextInt();
					for (int j = 0; j < i; j++) {
						if (user[j] == user[i]) {
							i--;
							System.out.println("중복된 숫자입니다.");
							break;
						}
					}

				} // user숫자 받아오기
				System.out.println();

				// com,user array 연결.
				int ball = 0;
				int str = 0;
				for (int j = 0; j < user.length; j++) {
					for (int i = 0; i < com.length; i++) {
						if (user[j] == com[i]) {
							if (i == j)
								str++;
							else
								ball++;
						}
					}
				}
				if (str == 3) {
					System.out.println("정답입니다!");
					break;
				} else if (str == 0 && ball == 0)
					System.out.println("아웃");
				else
					System.out.println(str + " 스트라이크 " + ball + " 볼");

			}
			break;
		}
		System.out.println("게임 종료.");
	}
}
/*
 * 야구게임 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다 발생한 수를 맞추는 게임 중복은 제거한다
 * 
 * [실행결과] 게임을 실행하시겠습니까(Y/N) : w 게임을 실행하시겠습니까(Y/N) : u 게임을 실행하시겠습니까(Y/N) : y
 * 
 * 게임을 시작합니다
 * 
 * 숫자입력 : 123 0스트라이크 0볼
 * 
 * 숫자입력 : 567 0스트라이크 2볼
 * 
 * 숫자입력 : 758 1스트라이크 2볼 ...
 * 
 * 숫자입력 : 785 3스트라이크 0볼
 */