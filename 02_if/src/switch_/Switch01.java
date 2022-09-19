package switch_;

import java.util.Scanner;

public class Switch01 {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("월 입력 : ");
	int month = scan.nextInt();
	int days;
	
	switch(month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12: days=31; break;
	case 2: days=28; break;
	default: days=30;
	}
	System.out.println(month+"월은 "+days+"일 까지");
}//main

}//Switch01
