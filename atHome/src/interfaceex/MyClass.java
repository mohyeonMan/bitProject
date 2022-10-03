package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()");
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}

	public static void main(String[] args) {

		MyClass myClass = new MyClass();

		X xClass = myClass;
		xClass.x();
		// 어떤 타입에 대입이 됐느냐에 따라 사용할수 있는 메소드가 한정될수있다.

	}
}
