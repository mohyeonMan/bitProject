package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {
	
	public static void main(String[] args) throws ParseException{ //  예외처리는 메서드 뒤에.
		Date date = new Date();
		
		System.out.println("오늘 날짜 : "+ date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : "+sdf.format(date));
		System.out.println();
		
		//내생일 - 1995 10 30 10:35:15
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth= input.parse("19951030103515"); // String -> Date 변환
		
		System.out.println("내생일 : " +sdf.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar(); //스스로 생성할수 없다? 추상 or interface
		
		//시스템의 날짜와 시간을 기준으로 가져온다.
//		Calendar cal = new GregorianCalendar(); // Sub Class 이용하여 생성
		Calendar cal = Calendar.getInstance(); // 메소드를 이용하여 생성
		//기준을 캐나다로 변경하여 가져온다.
//		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
		
		int year = cal.get(Calendar.YEAR);			// = cal.get(1);( Calendar.YEAR 를 상수화...)
		int month = cal.get(Calendar.MONTH)+1; 		// 0->1월, 1->2월, 2->3월... 
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 일->1, 월->2, 화->3
		
		
		String dayOfWeek = null;
		switch(week) {
		case 1:dayOfWeek = "일";break;
		case 2:dayOfWeek = "월";break;
		case 3:dayOfWeek = "화";break;
		case 4:dayOfWeek = "수";break;
		case 5:dayOfWeek = "목";break;
		case 6:dayOfWeek = "금";break;
		case 7:dayOfWeek = "토";
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년 " + month +"월 "+day+"일 "+dayOfWeek+"요일\t"
				+hour + ":"+minute+":"+second);
		
		
	}

}
/*
 예외처리 Exception
 
1. 컴파일
	-throws / JVM에 던진다.
	-try ~ 
	
2. 실행 - 개발자
ArrayIndexOutOfBoundException
NullPointException
*/