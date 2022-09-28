package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk{
	
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println("\n\n----------------------------------------------------"
						+ "\n번호\t이름\t국어\t영어\t수학\t총점\t평균\n"
						+ "----------------------------------------------------");
		for(int i = 0; i < list.size(); i++) {
			list.get(i).showInfo();
		}
		System.out.println("\n\n");
	}

}
