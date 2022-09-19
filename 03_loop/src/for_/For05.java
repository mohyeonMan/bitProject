package for_;

import java.util.Scanner;

public class For05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x 의 값 : ");
		int x = scan.nextInt();
		System.out.print("y 의 값 : ");
		int y = scan.nextInt();
		
		int result = 1;
		
		for(int i =0;i<y;i++) {
			result*=x;
		}
		System.out.println();
		System.out.println(x+"의 "+y+"승 = "+ result);
	}

}
