package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.print("\n삭제할 이름을 입력 : ");
		int cnt = 0;
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		for (int i = 0; i < list.size(); i++) {
			if (!name.equals(list.get(i).getName())) {
				cnt++;
				if (cnt == list.size()) {
					System.out.println("\n삭제할 이름이 없습니다.\n");
					break;
				}
			} else if (name.equals(list.get(i).getName())) {
				list.remove(i);
				i--;
				cnt--;
			}
		}
		if (cnt < list.size())
			System.out.println("\n모든 데이터 삭제했습니다.\n");
	}
}

//if (name.equals(list.get(i).getName())) {
//	list.remove(i);
//		* 이름은 중복이 되어있다 => 똑같은 이름이 2개 이상 이라면 다 지우세요
//				
//		삭제 할 이름을 입력 : 홍길동
//		삭제 할 이름이 없습니다.
//		
//		또는
//		
//		삭제 할 이름을 입력 : 홍길동
//		모든 데이터 삭제했습니다
//		