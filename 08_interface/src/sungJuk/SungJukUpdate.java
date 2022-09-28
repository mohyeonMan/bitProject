package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("번호 입력 : ");
		int num = scan.nextInt();
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (num != list.get(i).getNum()) {
				cnt++;
				if (cnt == list.size()) {
					System.out.println("번호를 찾을수 없습니다.\n");
					break;
				}
			} else if (num == list.get(i).getNum()) {
				list.get(i).showInfo();
				System.out.print("수정할 이름 : ");
				list.get(i).setName(scan.next());
				System.out.print("수정할 국어 : ");
				list.get(i).setKor(scan.nextInt());
				System.out.print("수정할 영어 : ");
				list.get(i).setEng(scan.nextInt());
				System.out.print("수정할 수학 : ");
				list.get(i).setMat(scan.nextInt());
				System.out.println("\n수정하였습니다.\n");

			}
		}

	}

}
