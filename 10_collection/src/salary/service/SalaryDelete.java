package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryDelete implements Salary{

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println("사원 정보를 삭제합니다.\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("사원번호를 입력하세요. : ");
		int num = scan.nextInt();
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (num == (list.get(i).getNum())) {
				list.remove(i);
				cnt++;
			}
		}
		System.out.println();
		if (cnt==0) System.out.println("일치하는 사원번호를 찾지 못했습니다.\n");
	}

}
