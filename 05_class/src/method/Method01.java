package method;

public class Method01 {

	public int add(int a, int b) { // 인수(argument) , 매개변수(parameter)
		return a + b;
	}

	public int min(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public double div(int a, int b) {
		return (double) a / b;
	}

	public static void main(String[] args) {
		int a = 25, b = 36; // 지역변수 (local variable)
		Method01 m = new Method01();

		System.out.println(m.add(12, 836));
		System.out.println(m.min(12, 836));
		System.out.println(m.mul(12, 836));
		System.out.println(m.div(12, 836));
	}

}
