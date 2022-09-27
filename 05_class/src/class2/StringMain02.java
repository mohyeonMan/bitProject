package class2;

import java.util.Scanner;

public class StringMain02 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("문자열 :");
	String input = scan.next();
	String input1 = input.toLowerCase();
	
	System.out.print("현재 문자열 : ");
	String before = scan.next();
	String before1 = before.toLowerCase();
	
	System.out.print("바꿀 문자열 : ");
	String after = scan.next();
	String after1 = after.toLowerCase();
	
	input = input1.replace(
			input1.substring((input1.indexOf(before1)), (input1.indexOf(before1)) + before1.length()), after1);
	if ((input1.indexOf(before1)) != -1) {
		System.out.println(input);
	}
	else System.out.println("찾을수 없습니다");
	

	

	
		
//	input1.indexOf(before1)+1 인덱스에서 바꿀 문자열의 위치.
//	System.out.println("부분 문자열 추출 = "+e.substring(7,11));	// 7번부터 11번 "이전" 까지 (10번까지)
//	System.out.println("소문자 변경 = "+"Hello".toLowerCase());	// 모두 소문자로
//	System.out.println("문자열 검색 = "+e.indexOf("개바부")); 		// 일치하지 않을때 에러x. -1
//	System.out.println("문자열 치환 = "+e.replace("날짜","일자"));	//날짜 -> 일자
		
		
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
