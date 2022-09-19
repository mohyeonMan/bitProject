package operator;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {

		Scanner score = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a=score.nextInt();
		
		System.out.println();
		
		String result = a%2==0? "짝수":"홀수";
		String div= a%2==0 && a%3==0? "2와 3의 공배수이다":"2와 3의 공배수가 아니다";
		System.out.println(a+"는 "+result);
		System.out.println(a+"는 "+div);
	}

}
