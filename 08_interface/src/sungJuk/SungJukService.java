package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	// menu() 생성.
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();

	public void menu() {
		SungJuk sungJuk = null;
		while (true) {
			int a;
			Scanner scan = new Scanner(System.in);
			System.out.println(
					"************************\n"
				+		"*\t1. 입력\n"
				+		"*\t2. 출력\n"
				+		"*\t3. 수정\n"
				+		"*\t4. 삭제\n"
				+		"*\t5. 정렬\n"
				+		"*\t6. 종료\n"
				+	"************************");

				System.out.print("\t\t메뉴 : ");
				a = scan.nextInt();

				if (a == 6)
					break;
				else if (a == 1)
					sungJuk = new SungJukInsert();
				else if (a == 2)
					sungJuk = new SungJukList();
				else if (a == 3)
					sungJuk = new SungJukUpdate();
				else if (a == 4)
					sungJuk = new SungJukDelete();
				else {
					System.out.println("\n다시 입력하세요.\n");
					continue;
				}
				sungJuk.execute(list);
			}

		}

	}
