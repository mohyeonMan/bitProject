package inheritance;

class Test extends Object { // 자바의 모든 클래스는 Object로 부터 상속받는다.

	@Override
	public String toString() { // Override를 통해 주소값을 치환.
		return "개바부";
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

	}

}
