package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	public static void main(String[] args) {
		String[] ar = { "orange", "apple", "banana", "pear", "peach", "applemango" };

		System.out.print("정렬 전 = ");
		for (String data : ar) {
			System.out.print(data + "  ");
		}
		System.out.println();

		Arrays.sort(ar);// 배열 정렬

		System.out.print("정렬 후 = ");
		for (String data : ar) {
			System.out.print(data + "  ");
		}
		System.out.println();

		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("죠르디", 30);

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);

		System.out.println("\n-----------------------------\n");
		System.out.println("정렬 전 = ");
		for (PersonDTO personDTO : list) {
			System.out.print(personDTO);
		}
		System.out.println("\n-----------------------------\n");
		System.out.println();
		System.out.println("나이로 오름차순\n");
		Collections.sort(list);

		System.out.println("정렬 후 = ");
		for (PersonDTO personDTO : list) {
			System.out.print(personDTO);
		}

		System.out.println();
		System.out.println("이름으로 내림차순\n"); // Comparator
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() { // Comparator 생성과 동시에 오버라이딩.
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName()) * -1; // -1을 곱해 정렬값을 바꿔준다.
//				return p2.getName().compareTo(p1.getName())			//p1과 p2 의 위치를 바꿔준다.
			}
		};
		Collections.sort(list, com); // com이라는 기준으로 list 를 정렬하라.

		System.out.println("정렬 후 = ");
		for (PersonDTO personDTO : list) {
			System.out.print(personDTO);
		}

	}
}