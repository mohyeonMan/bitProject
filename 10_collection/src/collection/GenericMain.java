package collection;

class GenericTest<T> {// 자료형 미지정
	private T a;
	
	public void setA(T a){
		this.a=a;
	}
	public T getA() {
		return a;
	}
	
}

//-----------------
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>(); //자료형 정의
		aa.setA("박지훈");
		System.out.println("이름 = "+aa.getA());
		
		GenericTest<Integer> bb = new GenericTest<Integer>(); // WrapperClass
		bb.setA(28);
		System.out.println("나이 = "+bb.getA());
	}
}
