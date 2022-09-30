package nested;

public class Outer {//Outer.class
	private String name;

	public void output() {
		inner in = new inner();// 객체를 생성하면 이너클래스 필드 사용 가능.
		System.out.println("이름 = " + this.name + "\t나이 = " + in.age);
	}

	class inner {//Outer$inner.class //파일탐색기에서 중첩으로 표기.
		private int age; // 로컬변수랑비슷하네.

		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이 = " + this.age);
		} // 주소를 풀면 이렇게.
	}

	public static void main(String[] args) {

		Outer ou = new Outer();
		ou.name = "박지훈";
		ou.output();
		
		Outer.inner in2 = ou.new inner(); //객체 안의 객체
		in2.age = 28;
		in2.disp();
		Outer.inner in3 = ou.new inner(); //객체 안의 객체
		in3.age=30;
//		in3.name = "뿡리";// static에서는 접근불가..
		in3.disp();
		
		Outer.inner in4 = new Outer().new inner(); 	// Outer의 객체를 새로만들어서 inner 생성.
		in4.age = 35;								// 새로운 Outer의 주소값이 없다. name은 static 밖에서 직접넣어줘야한다.
		in4.disp(); //이름 null
		
		
	}
}
