package inheritance;
enum Color{
	RED, GREEN, BLUE	//enum 상수들을 정의해놓은 집합.
}

class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;

	public static final String ANIMAL = "사자";
	public static final String ANIMAL2;

//	public static final int RED = 0;
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;

	static {
		ANIMAL2 = "기린"; // 스태틱의 초기화영역 설정.
	}
	public Final() {
		FRUIT2 = "딸기";
//		ANIMAL2 = "기린;"		// 생성자에서 static 초기화 할수없다.
	}

}

public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 10;
		// AGE++; -- error. 값을 바꿀수없다.
		System.out.println("AGE = " + AGE);

		final int AGE2;
		AGE2 = 20; // java는 한번의 기회를 준다.
//		AGE2=30;
		System.out.println("AGE2 = " + AGE2);

		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT);
		System.out.println("FRUIT2 = " + f.FRUIT2);
		
		System.out.println("ANIAML = " + Final.ANIMAL);
		System.out.println("ANIAML = " + Final.ANIMAL);
		System.out.println();

		System.out.println("빨강 = " + Color.RED);
		System.out.println("빨강 = " + Color.RED.ordinal());
		System.out.println();

		for (Color data : Color.values()) { // Color를 배열타입으로 리턴.
			System.out.print(data+"\t"+data.ordinal());
			System.out.println();
		}
	}

}
