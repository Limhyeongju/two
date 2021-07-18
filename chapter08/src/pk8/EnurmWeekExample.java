package pk8;

import java.util.Calendar;

public class EnurmWeekExample {

	public static void main(String[] args) {
		
		Week today=null;
		
		
		Calendar cal=Calendar.getInstance(); //100프로 암기
		int week=cal.get(Calendar.DAY_OF_WEEK);//일요일 1~ 토요일 7 자바에서 만들어진 제공하는 메서드
		
		switch(week) {
		case 1:
			today=Week.Sunday;
			break;
		case 2:
			today=Week.Monday;
			break;
		case 3:
			today=Week.Tuesday;
			break;
		case 4:
			today=Week.Wednesday;
			break;
		case 5:
			today=Week.Thursday;
			break;
		case 6:
			today=Week.Friday;
			break;
		case 7:
			today=Week.Saturday;
			break;
		}
		System.out.println("오늘 요일 : "+today);
		if(today==Week.Sunday) {
			System.out.println("일요일에는 잔다");
		}else {
			System.out.println("열심히 java 공부를 한다");
		}
	}

}
