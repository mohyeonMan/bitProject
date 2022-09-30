package salary.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySort implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n************************\n"
		+ 		  		   "* 1. 이름으로 오름차순\n" 
		+ 				   "* 2. 사원번호로 내림차순\n" 
		+ 				   "* 3. 이전메뉴\n"
		+				    "************************");

		System.out.print("\t\t메뉴 : ");
		a = scan.nextInt();
		System.out.println("\n");

		if (a == 3)
			return;
		else if (a == 1) {
			Comparator<SalaryDTO> com = new Comparator<SalaryDTO>() { // Comparator 생성과 동시에 오버라이딩. 익명 내부클래스 
				@Override
				public int compare(SalaryDTO p1, SalaryDTO p2) {
					return p1.getName().compareTo(p2.getName());
				}
			};
			Collections.sort(list, com);
		}
		else if (a == 2) {
			
			Collections.sort(list);
		} 		
	}

}
