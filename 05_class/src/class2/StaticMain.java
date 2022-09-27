package class2;

class StaticTest{
	private int a; // 필드 (인스턴스변수)
	private static int b; // 필드 (클래스 변수). 인스턴수변수가 아니다. static메모리에 따로잡힌다.
	
	static {	//스태틱의 초기화영역
		System.out.println("초기화 영역"); 
		b=7;
	}
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a =7;
	}
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a="+this.a+"\t b="+StaticTest.b);
	}
	
	public static void output() {
		System.out.println("static method...");
//		System.out.println("a="+a+"\t b="+b); // this의 값이 없다. static 메소드 안에는 static 변수만 사용할수 있다.
	}
}
//----------------------
public class StaticMain {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		st1.calc();
		st1.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest st3 = new StaticTest();
		st3.calc(); 
		st3.disp();
		System.out.println();
		
		
		StaticTest.output(); // 클래스.메소드()
		st1.output();	//객체.메소드()
	}

}
