package collection;

import java.util.ArrayList;	//Collection을 이미 Overriding 한 클래스.
import java.util.Collection;//인터페이스
import java.util.Iterator;

public class CollectionMain {
	
	public static void main(String[] args) {
		
		Collection<String> coll = new ArrayList<String>(); //인터페이스의 형식을 빌려 업캐스팅
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");
//		list.add(25);
//		list.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
//		coll.get(0); //error. get은 ArrayList가 가진 메소드
		
		Iterator<String> it = coll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		1.it.hasNext(); 현재 위치에 항목이 있으면 참, 없으면 거짓
//		2.it.next(); 현재위치의 항목을 꺼내서 저장하고 다음위치로 저장.
// 		콜렉션과 이터레이터.
	}

}
