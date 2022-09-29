package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이"); //중복허용 X, 순서 X 에러는 없지만 안들어간다. 주소값을 따로잡아도 안된다.
//		list.add(25);
//		list.add(43.8);
		set.add("기린");
		set.add("코끼리");
		
		Iterator<String> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
