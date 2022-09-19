package if_;

import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("a의 값 : ");
	int a = scan.nextInt();
	System.out.print("b의 값 : ");
	int b = scan.nextInt();
	System.out.print("c의 값 : ");
	int c = scan.nextInt();
	
	System.out.println();
	
	double avg = (a+b+c)/3;
	
	if(a>=40&&b>=40&&c>=40) {
		if(avg>=60)	System.out.println("합격");
		else System.out.println("평균미달로 불합격"); 
	}
	else System.out.println("과락으로 불합격");
	}
}
