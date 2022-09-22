package method;

public class Method02 {

	public void disp() { // 구현
		System.out.println("non-static method");
	}

	public static void output() {
		System.out.println("static method"); // 스태틱 메소드 특 ) 인스턴스 생성안해도 어디서나 쓸수있음.
	}

	public static void main(String[] args) { 
		Method02.output();
		output(); // 클래스 내부라서 주소 안써도됨.
		
//		disp();  // 인스턴스가 없는 텅빈클래스에서 메소드를 가져올수가 없다.
		
		Method02 m = new Method02(); // 인스턴스 생성 후
		m.disp();// 인스턴스주소를 이용하여 메소드를 불러온다.
	}
}
