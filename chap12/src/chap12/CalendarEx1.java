package chap12;

import java.util.Calendar;

/*
 * Calendar 클래스 예제
 * Calendar  클래스는 추상클래스이므로 new Calendar() 생성자로 객체 생성이 불가능함.
 * => getInstance() static 메서드로 객체 리턴
 */
public class CalendarEx1 {
	public static void main(String[] args) {
//		Calendar now = new Calendar(); //객체화 불가
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println("올해 년도:" + now.get(Calendar.YEAR));
		System.out.println("이번 달:" + (now.get(Calendar.MONTH)+1));  //월 : 0~11로 표시되기 때문에 +1 필요.
		System.out.println("년도기준 몇째주:" + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("월기준 몇째주:" + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("오늘일자:" + now.get(Calendar.DATE));
		System.out.println("오늘일자:" + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("년도기준일자:" + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일:" + now.get(Calendar.DAY_OF_WEEK));  //요일: 일요일부터 1로 시작. => 화요일=3
		System.out.println("월기준몇째요일:" + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//시간
		System.out.println("오전(0),오후(1):" + now.get(Calendar.AM_PM));
		System.out.println("시간(0~11):" + now.get(Calendar.HOUR));
		System.out.println("시간(0~23):" + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):" + now.get(Calendar.MINUTE));
		System.out.println("초(0~59):" + now.get(Calendar.SECOND));
		System.out.println("밀리초(0~999):" + now.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12~12):" + now.get(Calendar.ZONE_OFFSET)/(60*60*1000));  //기준시보다 9시간 빠름
		System.out.println("이달의 마지막일자:"+now.getActualMaximum(Calendar.DATE));
		//Calendar 클래스로 2020-02-24 로 설정하기
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 2-1, 24);
		System.out.println("날짜" + cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH)+1) +"월" + cal.get(Calendar.DATE)+"일");
		//요일
		int week = cal.get(Calendar.DAY_OF_WEEK);
		if(week==1) System.out.println("SUN");
		else if(week==2) System.out.println("MON");
		else if(week==3) System.out.println("TUE");
		else if(week==4) System.out.println("WED");
		else if(week==5) System.out.println("THU");
		else if(week==6) System.out.println("FRI");
		else if(week==7) System.out.println("SAT");
		//마지막 일자 구하기
		System.out.println("이달의 마지막일자:"+cal.getActualMaximum(Calendar.DATE));
	}
}
