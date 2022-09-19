package if_;

import java.util.Scanner;

public class If03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		System.out.print("c의 값 : ");
		int c = scan.nextInt();
		
		if(Math.min(b, c)>=a) {
			if(c>=b)System.out.println(a+"-"+b+"-"+c);
			else System.out.println(a+"-"+c+"-"+b); 
		}
		if(Math.min(a, c)>=b) {
			if(a>=c)System.out.println(b+"-"+c+"-"+a);
			else  System.out.println(b+"-"+a+"-"+c);
		}
		if(Math.min(a, b)>=c) {
			if(a>=b)System.out.println(c+"-"+b+"-"+a);
			else System.out.println(c+"-"+a+"-"+b);		
		}
		
		
}
}