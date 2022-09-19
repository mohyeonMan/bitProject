package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) { // 조건연산자 쓸것 (if문 x)
		System.out.printf("월급 계산 프로그램\n\n");
		Scanner scan =new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name=scan.next(); // 이름
		
		
		System.out.print("직급 입력 : ");
		String grade=scan.next(); // 직급

		System.out.print("기본급 입력 : ");
		double salary=scan.nextDouble(); // 기본급
		
		System.out.print("수당 입력 : ");
		int earn=scan.nextInt(); // 수당

		DecimalFormat df = new DecimalFormat();
				
		double sum = earn+salary;
		double tax = sum>=5000000? 0.03: sum>=3000000? 0.02:0.01;			
		
		System.out.println();
		System.out.println("*** "+name+" "+grade+" 월급 ***");
		System.out.println("기본급 : "+df.format(salary)+"원");
		System.out.println("수당 : "+df.format(earn)+"원");
		System.out.println("합계 : "+df.format(sum)+"원");
		System.out.println("세금 : "+df.format(sum*tax)+"원");
		System.out.println("월급 : "+df.format(sum-(sum*tax))+"원");	
	}
}
