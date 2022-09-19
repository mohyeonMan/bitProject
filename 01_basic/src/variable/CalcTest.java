package variable;

import java.text.DecimalFormat;

public class CalcTest {
	
	
	public static int add(int a, int b) {
		return a+b;
		}
	public static int min(int a, int b) {
		return a-b;
		}
	public static double mul(double a, double b) {
		return a*b;
		}
	public static double div(double a, double b) {
		return a/b;
		}

	public static void main(String[] args) {
		int a = 320;
		int b = 258;
		
		System.out.printf("+~%d\n-~%d\n*~%s\n/~%s\n\n",add(a, b),min(a, b),mul(a, b),div(a, b));
		System.out.println("소수점 생략 -> "+String.format("%7.5f",div(a,b)));
		System.out.println("천단위 점찍기 -> "+new DecimalFormat().format(mul(a,b))); // 천단위 점찍기.

		//메소드 응용으로 사칙연산
	}


/*
[문제] 변수를 이용하여 320, 258의 합을 구하시오.abstract

[실행결과]
320 + 258 = xxx
*/
	
}