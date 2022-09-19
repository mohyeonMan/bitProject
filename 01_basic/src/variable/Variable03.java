package variable;

import java.util.Random;

public class Variable03 {
public static void main(String[] args) {
	System.out.println("큰 값 =" +Math.max(54.1, 54.2));
	
//	static int		max(int a, int b)
//	static double	max(double a, double b)
//	static float	max(float a, float b)
//	static long		max(long a, long b)


	// 	오버로드의 형식. 하나의 메서드에 포함가능한 자료형이 들어갈 수 있다.
	
// 난수 
//	- 불규칙하게 발생하는 수
//	- 0 <= 난수 < 1
	 System.out.println(Math.random());
//a~b사이의 난수 발생 => (int)Math.random()*(b-a+1)+a
	 int a=65;
	 int b=90;
	 System.out.println((int)(Math.random()*(b-a+1)+a)); // 65~90
	 
	 System.out.println(new Random().nextDouble());
	 					// 인스턴스 생성 후 메서드 호출
	 
	 
	 
	 
	}
}