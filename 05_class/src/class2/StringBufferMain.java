package class2;

import java.util.Iterator;
import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan=scan.nextInt();
		System.out.println();
		
	}
	public void output() {
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 1; i <=9; i++) {
//			System.out.println(dan+" * "+i+" = "+ dan*i);
			buffer.append(dan);
			buffer.append(" * ");
			buffer.append(i);
			buffer.append(" = ");
			buffer.append(dan*i);
		
			System.out.println(buffer); //StringBuffer => String으로 변환해서 출력
			buffer.delete(0,buffer.length());
		}
	}
	
	
	

	public static void main(String[] args) {
		StringBufferMain StringBufferMain = new StringBufferMain();
		StringBufferMain.input();
		StringBufferMain.output();
		
		
		
	}
}

/*
 원하는 단을 입력 : 5 		input()
 ----------------------------
 5*1=5					output()

 
 5*9=45
 */