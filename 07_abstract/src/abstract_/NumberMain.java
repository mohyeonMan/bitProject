package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberMain {

	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat(); - 추상클래스

		NumberFormat nf1 = new DecimalFormat(); // NumberFormat의 하위클래스
		// 3자리마다 ,로분리 소수이하 3째자리.
		System.out.println(nf1.format(123456789.456789)); // 소수 3째자리까지 반올림
		System.out.println(nf1.format(12345678));
		System.out.println();

		NumberFormat nf2 = new DecimalFormat("#,###.##원"); // NumberFormat의 하위클래스
		//유효숫자가 아닌것은 표기하지않음.
		System.out.println(nf2.format(123456789.456789)); // 소수 3째자리까지 반올림
		System.out.println(nf2.format(12345678));
		System.out.println();

		NumberFormat nf3 = new DecimalFormat("#,###.00원"); // NumberFormat의 하위클래스
		//0을 강제로 표시.
		System.out.println(nf3.format(123456789.456789)); // 소수 3째자리까지 반올림
		System.out.println(nf3.format(12345678));
		System.out.println();
	}
}
