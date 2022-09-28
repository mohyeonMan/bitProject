package abstract_;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {
	private int year;
	private int month;
	private int week;
	private int lastday;
	
	public CalendarMain() {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		year=scan.nextInt();
		System.out.print("월 입력 : ");
		month=scan.nextInt();		
	}
	
	public void calc() {
		Calendar cal =Calendar.getInstance(); //추상클래스.
		cal.set(year,month-1,1);
		week=cal.get(Calendar.DAY_OF_WEEK);
		lastday=cal.getActualMaximum(month);
	}
	
	public void disp() {}

	public static void main(String[] args) {
		// 기본생성자로 입력받기
		// syso 일-토 작성후
		// calc() 매달 1일의 요일이 무엇인가?
		// display()이용해서 출력.
		CalendarMain calendarMain = new CalendarMain();
System.out.println(calendarMain.week);
	}
}
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

