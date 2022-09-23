package constructor;

class Hello {

	private String name;
	private int age;

	public Hello() {
		System.out.println("디폴트생성자");
	}

	public Hello(int age) { 
//		this("코난");				//Overload된 다른 생성자를 호출할 수 있다!
		this.age = age;				// 첫줄에만 가능하다!
	}

	public Hello(String name) {
		this.name = name;
	}

	public Hello(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Hello good = new Hello();

		Hello bad = new Hello("박지훈");
		System.out.println(bad.getName() + bad.getAge());

		Hello yes = new Hello(28);
		System.out.println(yes.getName() + yes.getAge());

		Hello no = new Hello("박지훈", 28);
		System.out.println(no.getName() + no.getAge());

	}

}
