package abstract_;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {
	Calendar cal = Calendar.getInstance();
	int year;
	int month;
	public CalendarMain() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month=scan.nextInt();
	}
	public void calc() {
		CalendarMain calendarMain = new CalendarMain();
		cal.set(Calendar.YEAR,calendarMain.year);
		cal.set(Calendar.MONTH,calendarMain.month);
		cal.set(Calendar.DATE,1);
		int first = cal.get(Calendar.DAY_OF_WEEK);
		int last = cal.getActualMaximum(Calendar.DATE);
		String dayOfWeek = null;
		switch(first) {
		case 1:dayOfWeek = "일";break;
		case 2:dayOfWeek = "월";break;
		case 3:dayOfWeek = "화";break;
		case 4:dayOfWeek = "수";break;
		case 5:dayOfWeek = "목";break;
		case 6:dayOfWeek = "금";break;
		case 7:dayOfWeek = "토";
		System.out.println(dayOfWeek);
		System.out.println();
		}
	}
	public void disp() {
		int week =0;
	}
				

	public static void main(String[] args) {
		
		c.calc();
		
		
		// 기본생성자로 입력받기
		// syso 일-토 작성후
		// calc() 매달 1일의 요일이 무엇인가?
		// display()이용해서 출력.
		
		
	}
}
//int week = cal.get(Calendar.DAY_OF_WEEK);	// 일->1, 월->2, 화->3


/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	1	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31
 */

