package for_;

import java.util.Scanner;

public class For08 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.print("소수 찾기 : ");
		int sosu =scan.nextInt();
		
		System.out.println();
		
		for(int i =1;i<=sosu;i++) {
			if( i%2==0 && i!=2) {
				System.out.print("x\t");
			}
			else if(i%3==0&& i!=3) {
				System.out.print("x\t");
			}
			else if(i%5==0&& i!=5) {
				System.out.print("x\t");
			}
			else if(i%7==0&& i!=7) {
				System.out.print("x\t");
			}
			else {
				System.out.print(i+"\t");
			}
			if(i%10==0) {
				System.out.println();
			}
			
		}		
	}
}
