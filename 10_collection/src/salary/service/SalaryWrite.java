package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryWrite implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성함을 입력하세요. : ");
		String name = scan.next();
		System.out.print("직급을 입력하세요. : ");
		String grade = scan.next();
		System.out.print("기본급을 입력하세요. : ");
		int normal = scan.nextInt();
		System.out.print("수당을 입력하세요 : ");
		int extra = scan.nextInt();

		SalaryDTO salaryDTO = new SalaryDTO(name, grade, normal, extra);
		list.add(salaryDTO);
		System.out.println("\n입사를 축하합니다.\n당신의 사원번호는" + salaryDTO.getNum() + "입니다.\n\n");
	}
}
