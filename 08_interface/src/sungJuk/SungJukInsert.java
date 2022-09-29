package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {

	public void execute(ArrayList<SungJukDTO> list) { // 자료형 식별자, 매개변수로 활용.
		SungJukDTO sungJukDTO = new SungJukDTO();
		list.add(sungJukDTO);
	}

}
