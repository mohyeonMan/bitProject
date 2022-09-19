package operator;

public class Operator06 {
	
	public static void main(String[] args) { // 부정연산자
		
		boolean a = 25>36;
		
		System.out.println("a = "+a); //false
		System.out.println("a = "+!a); // true
		System.out.println();
		
		String b ="apple" ;
		String c = new String("apple");
		
		System.out.println();
		
		System.out.println("b==c? = " +( b == c? "같다":"다르다" ));
		System.out.println("b!=c? = " +( b != c? "참":"거짓" ));
		// 인스턴스 주소가 다르기 때문이다.
		System.out.println();
		
		System.out.println("b.equals(c)? : "+( b.equals(c)? "같다":"다르다" ));
		System.out.println("!b.equals(c)? : "+( !b.equals(c)? "참":"거짓" ));
		// 주소가 아닌 문자내용은 같다
		
	}

}
