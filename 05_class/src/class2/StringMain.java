package class2;

import java.util.Iterator;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple";
		String b = "apple";
		
		// 문자열이 같으면 주소를 두개 가지지 않는다.
		// 두개의 변수가 하나의 주소를 가르킨다. 
		if(a==b)
			System.out.println("a와 b의 참조값은 같다"); 
		else										
			System.out.println("a와 b의 참조값은 다르다");
		if(a.equals(b))
			System.out.println("a와 b의 문자열은 같다");
		else
			System.out.println("a와 b의 문자열은 다르다");
		
System.out.println();//----------------------------------------------

		String c = new String("apple");
		String d = new String("apple");
		
		//literal생성과 new예약어를 사용하면 저장되는 위치가 다르다.		
		if(c==d)
			System.out.println("c와 d의 참조값은 같다"); 
		else										
			System.out.println("c와 d의 참조값은 다르다");
		if(c.equals(d))
			System.out.println("c와 d의 문자열은 같다");
		else
			System.out.println("c와 d의 문자열은 다르다");
		
System.out.println();//-----------------------------------------------

		String e = "오늘 날짜는 " + 2022+9+27;
		System.out.println("e = "+e);
		System.out.println("문자열 크기 = "+e.length());
		
		for (int i = 0; i < e.length(); i++) {
			System.out.println(i+" : " +e.charAt(i));
		}
		
		System.out.println("부분 문자열 추출 = "+e.substring(7));		// 7번부터 끝까지
		System.out.println("부분 문자열 추출 = "+e.substring(7,11));	// 7번부터 11번 "이전" 까지 (10번까지)
		
		System.out.println("대문자 변경 = "+"Hello".toUpperCase());	// 모두 대문자로
		System.out.println("소문자 변경 = "+"Hello".toLowerCase());	// 모두 소문자로
		
		System.out.println("문자열 검색 = "+e.indexOf("짜"));
		System.out.println("문자열 검색 = "+e.indexOf("날짜"));
		System.out.println("문자열 검색 = "+e.indexOf("개바부")); 		// 일치하지 않을때 에러x. -1
		
		System.out.println("문자열 치환 = "+e.replace("날짜","일자"));	//날짜 -> 일자

		//e.indexOf() 인수 두개짜리도 있다.
		
	}
}
/*
 *	문자열은 편집이 안되므로 메모리 4번 생성된다
 *	JVM에 의해서 삭제 시 Garbage Collector로 보낸다
 *	Garbage Collector가 실행되면 컴퓨터는 멈춘다
 *	
 *	"오늘 날짜는 "
 *	"오늘 날짜는 2022"
 *	"오늘 날짜는 202209"
 *	e ---> "오늘 날짜는 20220927" 
 * */