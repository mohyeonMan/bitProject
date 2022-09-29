package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 이름을 입력 : ");
		String name = scan.next();
		int cnt = 0;
		for (int i = 0; i < list.size(); i++) {
			if (name != list.get(i).getName()) {
				cnt++;
				if (cnt == list.size()) {
					System.out.println("삭제할 이름이 없습니다.\n");
					break;
				}
				
			}
			else if (name == list.get(i).getName()) {
				list.remove(i);
			}
		}
		if(cnt<list.size())System.out.println("모두 데이터 삭제했습니다.\n");
	}
}
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