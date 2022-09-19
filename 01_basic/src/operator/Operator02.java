package operator;

import java.util.Scanner;

public class Operator02 {
	public static void main(String[] args) {
		Scanner i = new Scanner(System.in); // 스캐너!!!!
		System.out.print("점수를 입력하세요 : ");

		int score = i.nextInt();
		
//		score>=80 && score<=100 ?  "합격":"불합격"; // 행동도 지정해줘야한다.
		
		String result =score>=80 && score<=100 ?  "합격":"불합격";
		
		System.out.println(result);
		
		
		
		
		
		
		
	}

}
