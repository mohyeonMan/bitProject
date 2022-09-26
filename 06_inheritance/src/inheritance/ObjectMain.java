package inheritance;

class Test extends Object { // 자바의 모든 클래스는 Object로 부터 상속받는다.

	@Override
	public String toString() { // Override를 통해 주소값을 원하는 값으로 치환.
		return getClass()+"@개바부";
	}

}

//---------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t);
		System.out.println("객체 t = " + t.toString()); // 주소값을 문자열로 출력하는 메서드
		System.out.println("객체 t = " + t.hashCode()); // 16진수 -> 10진수로 변환된 해시코드.
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));				//주소값비교 - false
		System.out.println("aa.equals(bb) : "+aa.equals(bb));	//문자열비교 - true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc=dd : "+(cc==dd));				//주소값비교 - false
		System.out.println("cc.equals(dd) : "+cc.equals(dd));	//주소값비교 - false
		System.out.println();						//equals는 원래 문자열비교가 아니다.
													//String 클래스에서 Overriding 하여 문자열 비교로 사용하는것 뿐이다.
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : "+(ee==ff));				//주소값비교 - false
		System.out.println("ee.equals(ff) : "+ee.equals(ff ));	//문자열비교 - true
		System.out.println();

		

	}

}
/*
class object {
	public boolean equals(Object ) {} 	참조값비교
	public String toString();		클래스 @16진수
	public int hashCode(); 			10진수로 Overriding
}
class Test extends Object{
	public String toString();	
}
class String extends Object{
	public String toString();	문자열로 자동으로 Override
	public int hashCode();		문자열을 10진수로 변환
								표현할수 있는 문자열은 무한대다.
								10진수로 다 표현할 수 없다.
	public String toString();		문자열비교
	public boolean equals();		
}
*/