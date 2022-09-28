package collection;

import java.util.ArrayList;

public class CollectionMain2 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //제너릭 하나의 자료형으로 특정
		
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");
//		list.add(25);
//		list.add(43.8);
		list.add("기린");
		list.add("코끼리");


		for(int i =0;i<list.size();i++) {// length -> size
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for(String str : list) { //확장형. 제너릭에서 선언한 자료형
			System.out.println(str);
		}


		
	}

}
