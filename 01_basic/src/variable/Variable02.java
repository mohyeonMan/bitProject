package variable;

public class Variable02 {
	static int a; // 클래스변수
	int b;// 필드
	
	public static void main(String[] args) {
		int a = 0; //local variable 지역변수, 반드시 초기화 해야한다.
		System.out.println(a);
		System.out.println(Variable02.a); // static 초기화 안해도된다. 
		System.out.println(new Variable02().b); // 멤버변수 생성해줘야하는것.

	}

}
