package array;

import java.util.Scanner;

public class ParkingLot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean[] lot = new boolean[10];

		while (true) {
			System.out.print("	주차관리시스템		\n" + "************************\n" + "	1 . 입차\n" + "	2 . 출차\n"
					+ "	3 . 리스트\n" + "	4 . 종료\n" + "************************\n" + "		메뉴 : ");
			int menu = scan.nextInt();

			if (menu == 1) {
				for (;;) {

					System.out.print("\n위치 입력 : ");
					int site = scan.nextInt();
					if (lot[site - 1] == false) {
						lot[site - 1] = true;
						System.out.println(site + "번 자리 주차");
						break;
					} else
						System.out.println("이미 주차되어있습니다.");
					continue;
				}
			}
			System.out.println();

			if (menu == 2) {
				for (;;) {
					System.out.print("\n위치 입력 : ");
					int site = scan.nextInt();
					if (lot[site - 1] == true) {
						lot[site - 1] = false;
						System.out.println((site - 1) + "번 자리에서 출차");
						break;
					} else
						System.out.println("주차되어있지 않습니다.");
					continue;
				}
			}
			System.out.println();

			if (menu == 3) {
				System.out.println();
				for (int i = 0; i < 10; i++) {
					System.out.println((i + 1) + "번 자리\t:\t" + lot[i]);
				}
			}
			System.out.println();

			if (menu == 4) {
				break;
			}
		}
		System.out.println("주차관리 프로그램을 종료합니다.");
	}
}

//	
//	[강사] [오후 4:43] /*
//			주차장 관리 프로그램
//			**************
//			   1. 입차      input()
//			   2. 출차      output()
//			   3. 리스트      list()
//			   4. 종료
//			**************
//			  메뉴 : 
//
//			1번인 경우
//			위치 입력 : 3
//			3위치에 입차 / 이미 주차되어있습니다
//
//			2번인 경우
//			위치 입력 : 4
//			4위치에 출차 / 주차되어 있지않습니다
//
//			3번인 경우
//			1위치 : true
//			2위치 : false
//			3위치 : true
//			4위치 : false
//			5위치 : false
//			*/
//		boolean 은 false 로 초기화가 되어있단다.
