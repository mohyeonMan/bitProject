package interfaceex;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;

	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	default void description() { // 디폴트메소드
		System.out.println("정수 계산기를 구현합니다.");
		privatemethod();
	}

	static int total(int[] arr) { // static메소드로 arr의 총합계산
		int total = 0;

		for (int i : arr) {
			total += i;
		}
		return total;
	}

	private void privatemethod() { // 인터페이스 내에서 기능보완에 사용 Override 불가.
		System.out.println("private 메소드 입니다.");
	}
}
