package salary.service;

import java.util.ArrayList;

import salary.bean.SalaryDTO;

public class SalaryPrint implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> list) {
		System.out.println("*사원 명단*\n"
				+ 		   "=======================================================\n"
				+ 		   "사원번호\t이름\t직급\t기본급\t수당\t세율\t월급\n"
				+ 		   "-------------------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).calc();
			list.get(i).showInfo();			
		}
		System.out.println("-------------------------------------------------------\n\n");
		
	}

}
