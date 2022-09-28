package class2;

import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 입력받기
		System.out.print("문자열 :");
		String input = scan.next();

		System.out.print("현재 문자열 : ");
		String before = scan.next();

		System.out.print("바꿀 문자열 : ");
		String after = scan.next();

		if (input.length() < before.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다");
		} else {
			input = input.toLowerCase();
			before = before.toLowerCase();
		}

		// 리플레이스해서 출력은 쉽다. 카운트가 어렵다.
		// indexOf 매개변수 두개를 이용해서 여러번 검색하고 count++ 한다.
		int count = 0;
		int index = 0;
		while ((index = input.indexOf(before, index)) != -1) {
			count++;
			index += before.length();
		}
		System.out.println(input.replace(before, after));
		System.out.println(count);
	}
}
/*
치환하는 프로그램을 작성하시오 - indexOf(), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

indexOf()
replace()
*/
