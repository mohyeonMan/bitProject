package variable;

import java.util.Random;

public class Variable04 {
	public static void main(String[] args) {
		int a=10; // 정수형 변수, 지역변수
		Random r= new Random(); // 객체 (클래스형 변수)
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(26)+65); // 0-9까지의 난수
		
		String b = new String("사과");
		String c = "딸기"; // 문자열 literal 생성
		// **String은 자료형이 아니다**
		
		System.out.println(b+"\t"+c);
	}

}



