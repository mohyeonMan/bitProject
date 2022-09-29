package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n************************\n"
			+		"* 1. 총점으로 내림차순\n"
			+		"* 2. 이름으로 오름차순\n"
			+		"* 3. 이전메뉴\n"
			+	"************************");

			System.out.print("\t\t메뉴 : ");
			a = scan.nextInt();
			System.out.println("\n");

			if (a == 3)
				return;
			else if (a == 1) {
				Collections.sort(list);
			}
			else if (a == 2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() { // Comparator 생성과 동시에 오버라이딩.
					@Override
					public int compare(SungJukDTO p1, SungJukDTO p2) {
						return p1.getName().compareTo(p2.getName());
					}
				};
				Collections.sort(list, com);
			}

		}
	}

//		
//		1. 총점으로 내림차순
//		2. 이름으로 오름차순
//		3. 이전메뉴
//		  번호 : 1
