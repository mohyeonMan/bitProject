package constructor;

public class VarArgs {
	int a, b, c, d;

	public VarArgs() {
		System.out.println("기본생성자당");
	}

//	public int sum(int a, int b) {
//		return a + b;
//
//	}
//
//	public int sum(int a, int b, int c) {
//		return a + b + c;
//
//	}
//
//	public int sum(int a, int b, int c, int d) {
//		return a + b + c + d;
//		
//	}

	public int sum(int... ar) { 	// Variable Arguments
		int hap = 0; 				// 매개변수의 수를 자유롭게 받는다.

		for (int i = 0; i < ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}

	public static void main(String[] args) {

		VarArgs va = new VarArgs();
		System.out.println(va.sum(10, 20));
		System.out.println(va.sum(10, 20, 30));
		System.out.println(va.sum(10, 20, 30, 40));

	}

}
