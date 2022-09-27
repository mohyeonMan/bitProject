package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat(); - 추상클래스

		NumberFormat nf1 = new DecimalFormat(); 					// NumberFormat의 하위클래스
		// 3자리마다 ,로 분리 소수이하 3째자리.
		System.out.println(nf1.format(123456789.456789)); 			// 기본으로 소수 3째자리까지 반올림
		System.out.println(nf1.format(12345678));
		System.out.println();

		NumberFormat nf2 = new DecimalFormat("#,###.##원"); 			// NumberFormat의 하위클래스
		// 유효숫자가 아닌것은 표기하지않음.
		System.out.println(nf2.format(123456789.456789)); 			// 소수 3째자리까지 반올림
		System.out.println(nf2.format(12345678));
		System.out.println();

		NumberFormat nf3 = new DecimalFormat("#,###.00원"); 			// NumberFormat의 하위클래스
		// 0을 강제로 표시.
		System.out.println(nf3.format(123456789.456789)); 			// 소수 3째자리까지 반올림
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance(); 				//메소드를 이용해 인스턴스 생성.
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); // 현지 화폐단위 표시.
		nf4.setMaximumFractionDigits(2);	// 소수 2째자리까지 반올림
		nf4.setMinimumFractionDigits(2);	// 소수 2째자리까지 강제출력
		System.out.println(nf4.format(123456789.456789)); 			
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); // 현지 화폐단위 표시.
		nf5.setMaximumFractionDigits(2);	// 소수 2째자리까지 반올림
		nf5.setMinimumFractionDigits(2);	// 소수 2째자리까지 강제출력
		System.out.println(nf5.format(123456789.456789)); 			
		System.out.println(nf5.format(12345678));
		System.out.println();
	}
}
