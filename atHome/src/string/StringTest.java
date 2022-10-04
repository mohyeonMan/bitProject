package string;

public class StringTest {
	
	public static void main(String[] args) {
		
		String str1 = new String("abc");// new 하면 인스턴스주소를 새로 갖는다.
		String str2 = new String("abc");
		
		System.out.println(str1==str2); // false
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3==str4);
		
		
	}

}
