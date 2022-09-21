package array;

import java.util.Scanner;

public class ParkingLot {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean[] lot = new boolean[20]; // 주차공간 생성
		int Car = 0; // 현재 주차중인 차량

		while (true) {// 프로그램 가동
			System.out.print("	주차관리시스템		\n" + "************************\n" + "	1 . 입차\n" + "	2 . 출차\n"
					+ "	3 . 리스트\n" + "	4 . 종료\n" + "************************\n" + "		메뉴 : ");
			int menu = scan.nextInt();// 메뉴선택
			if ((menu < 1) || (menu > 4)) {
				System.out.print("   1~4의 값을 입력하세요 : ");
				menu = scan.nextInt();
				continue;
			}

			if (menu == 1) { // 입차메뉴
				for (;;) {
					if (Car == lot.length) {
						System.out.println("현재 주차자리가 없습니다.");
						break;
					}
					System.out.print("\n위치 입력 : ");
					int site = scan.nextInt();
					if (lot[site - 1] == false) {
						lot[site - 1] = true;
						System.out.println(site + "번 자리 주차");
						Car++;
						break;
					} else
						System.out.println("이미 주차되어있습니다.");
					continue;
				}
			}
			System.out.println();

			if (menu == 2) {//출차메뉴
				for (;;) {

					if (Car == 0) {
						System.out.println("현재 주차중인 차량이 없습니다.");
						break;
					}
					System.out.print("\n위치 입력 : ");
					int site = scan.nextInt();
					if (lot[site - 1] == true) {
						lot[site - 1] = false;
						System.out.println((site - 1) + "번 자리에서 출차");
						Car--;
						break;
					} else
						System.out.println("주차되어있지 않습니다.");
					continue;
				}
			}
			System.out.println();

			if (menu == 3) {//목록출력

				System.out.println();
				for (int i = 0; i < lot.length; i++) {
					String a;
					if (lot[i] == false)
						a = " ";
					else
						a = "주차중";
					System.out.println((i + 1) + "번 자리\t:\t" + a);
				}
				System.out.println("현재 차량수 : " + Car + "대\n");
			}

			if (menu == 4) {//프로그램 종료
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
