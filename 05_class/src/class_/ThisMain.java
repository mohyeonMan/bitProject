package class_;

class This {
	private int a;

	public void setA(int a) { //
		System.out.println("this = "+this);
		this.a = a;// a는 가장 가까운 a(매개변수)를 의미한다.
	}

	public int getA() { //매개변수에 a가 없다.
		return a; // this가 생략.
	}
}

//--------------------
public class ThisMain {

	public static void main(String[] args) {
		This mem = new This();
		mem.setA(10);
		System.out.println(mem);
		System.out.println(mem.getA());

	}
}
