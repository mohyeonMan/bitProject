package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {

	public void execute(ArrayList<SungJukDTO> list) {
		SungJukDTO sungJukDTO = new SungJukDTO();
		list.add(sungJukDTO);
	}

}
