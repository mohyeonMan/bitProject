package class2;

//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.Math.*; // 모든것. wild card
								// 패키지에는 쓸수가없다. 클래스만 가능.	
import static java.lang.String.format;
import static java.lang.System.out;

public class ImportStatic {

	public static void main(String[] args) {
		// 스태틱변수의 출처를 기입해주면 클래스명을 생략할수있다.
		// 하지만 혼란을 줄수 있어 추천하진 않는다.
		out.println("난수 = "+ random());
		out.println("제곱 = "+ pow(3,4));
		out.println("소수 이하 2째 자리 = "+format("%.2f",43.45678));
	}
}
 