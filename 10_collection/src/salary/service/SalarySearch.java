package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySearch implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println("\n사원정보를 검색합니다.\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("성함을 입력하세요. : ");
		String name = scan.next();
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (name.equals(list.get(i).getName())) {
				list.get(i).showInfo();
				cnt++;
				
			}
		}
		System.out.println();
		if (cnt==0) System.out.println("성함과 일치하는 사원정보를 찾지 못했습니다.\n");		
	}

}
