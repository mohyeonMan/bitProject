package inheritance;

public class Sub extends Super {

	protected String name;
	protected int age;

	public Sub() {
		System.out.println("Sub 기본생성자"); // 피상속 클래스의 인스턴스를 만들면, 상속클래스와 함께 메모리가 잡힌다.
	}

	public Sub(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		super.weight = weight;// this.weight=weight;
		super.height = height;// this.height=height;
	}

	public void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
	}

	public static void main(String[] args) {
		Sub aa = new Sub("박지훈", 28, 177, 70);
		aa.disp();
		System.out.println();
		aa.output();
		System.out.println();

		Super bb = new Sub();
		bb.disp();
//		bb.output(); //에러. output은 sub의 메소드.
	}
}
