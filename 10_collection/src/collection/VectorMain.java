package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();

		System.out.println("벡터 크기 : " + v.size()); // 0
		System.out.println("벡터 용량 : " + v.capacity()); // 기본용량 10개, 10개씩 추가.
		System.out.println();

		System.out.println("항목 추가");
		for (int i = 0; i < 10; i++) {
			v.add((i + 1) + "");// 정수를 문자열로!!
			System.out.print(v.get(i) + " ");
		}
		System.out.println("\n벡터 크기 : " + v.size()); // 10
		System.out.println("벡터 용량 : " + v.capacity()); // 기본용량 10개, 10개씩 추가.
		System.out.println();

		System.out.println("하나더 추가");
		v.addElement(5 + ""); // 중복허용
		for (int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
			
		}
		System.out.println("\n벡터 크기 : " + v.size()); // 11
		System.out.println("벡터 용량 : " + v.capacity()); // 20
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
		//v.remove("5")-앞에있는 5가 삭제
		v.remove(10);
		
		Iterator it = v.iterator();  //메소드 이용해 이터레이터 생성
		while(it.hasNext()) { // 현재위치에서 항목이 있으면 true 없으면 false.
			System.out.print( it.next()+"  "); // 항목을 꺼내서 버퍼에 저장하고 다음위치로 이동.
		}
		
		
	}
}
