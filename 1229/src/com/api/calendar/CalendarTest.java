package com.api.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		char[] ch = {'일','월','화','수','목','금','토'};
		
		System.out.printf("%d년 %d월 %d일 %s요일 %d시 %d분 %d초",year,month,day,ch[week],hour,minute,second);
	}

}
