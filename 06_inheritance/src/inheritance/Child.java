package inheritance;

public class Child extends Super {
	protected String name;
	protected int age;

	public Child() {
		System.out.println("Child 기본생성자"); // 피상속 클래스의 인스턴스를 만들면, 상속클래스와 함께 메모리가 잡힌다.
	}

	public Child(String name, int age, double weight, double height) {
		super(weight, height); // 상위 클래스의 생성자 호출. 반드시 첫번째 줄에 작성.

		System.out.println("Child 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;// this.weight=weight;
		super.height = height;// this.height=height;
	}

	public void disp() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
	}

	public static void main(String[] args) {
		Child aa = new Child("박지훈", 28, 177, 70);
		aa.disp();
		System.out.println();

		Super bb = new Child("박똥훈", 28, 177, 70); // 업캐스팅
		bb.disp(); // Override 똑같은 이름의 메소드가 상속,피상속 클래스에 있으면 피상속 클래스의 메소드로 표시된다.
	}
}
