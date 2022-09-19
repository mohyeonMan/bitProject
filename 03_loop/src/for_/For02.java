package for_;

import java.util.Scanner;

public class For02 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("몇단? : ");
		int i=scan.nextInt();
		
		System.out.println();
		System.out.println(i+"단");
			for(int j=1;j<=19;j++) {
				System.out.println("  "+i+" x "+j+" = "+(i*j));
			}
	}
}
