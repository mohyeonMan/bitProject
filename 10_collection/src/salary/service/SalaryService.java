package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryService {

	ArrayList<SalaryDTO> list = new ArrayList<>();
	
	public void menu() {
		while (true) {
			Salary salary =null;
			int a;
			Scanner scan = new Scanner(System.in);
			System.out.println(
				"************************\n"
			+		"*\t1. 등록\n"
			+		"*\t2. 출력\n"
			+		"*\t3. 수정\n"
			+		"*\t4. 검색\n"
			+		"*\t5. 삭제\n"
			+		"*\t6. 정렬\n"
			+		"*\t7. 종료\n"
			+	"************************");

			System.out.print("\t\t메뉴 : ");
			a = scan.nextInt();

			if (a == 7)
				break;
			else if (a == 1)
				salary = new SalaryWrite();
			else if (a == 2)
				salary = new SalaryPrint();
			else if (a == 3)
				salary = new SalaryUpdate();
			else if (a == 4)
				salary = new SalarySearch();
			else if (a == 5)
				salary = new SalaryDelete();
			else if (a == 6)
				salary = new SalarySort();
			else {
				System.out.println("\n다시 입력바랍니다.\n");
				continue;
			}
			salary.execute(list);

		}
	}
}
