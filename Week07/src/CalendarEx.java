import java.util.Calendar;

public class CalendarEx {
	
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		
		System.out.print(msg  + ": " + year + "/" + month + "/" + day + "/");
		
		switch(dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("일요일");
			break;
			
		case Calendar.MONDAY:
			System.out.print("월요일");
			break;
			
		case Calendar.TUESDAY:
			System.out.print("화요일");
			break;
			
		case Calendar.WEDNESDAY:
			System.out.print("수요일");
			break;
			
		case Calendar.THURSDAY:
			System.out.print("목요일");
			break;
			
		case Calendar.FRIDAY:
			System.out.print("금요일");
			break;
			
		case Calendar.SATURDAY:
			System.out.print("토요일");
			break;
			
		default:
			break;
		}
		
		System.out.print("(" + hourOfDay + "시)"); // (19시)
		
		// 오전, 오후 출력
		if(ampm == Calendar.AM)
			System.out.print(" 오전 ");
		else
			System.out.print(" 오후 ");
		
		System.out.println(hour + "시 " + minute + "분 " + second + "초 " + millisecond +"밀리초");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance(); // 실시간으로 작동하기 때문에 new 연산자 사용 x
		printCalendar("현재 시간", now);
		
		Calendar firstDay = Calendar.getInstance();
		firstDay.clear(); // 쓰레기 값 있을 수 있음
		firstDay.set(2016, 11, 25);
		firstDay.set(Calendar.HOUR_OF_DAY, 20);
		firstDay.set(Calendar.MINUTE, 30);
		printCalendar("첫 데이트 날", firstDay);
	}

}
