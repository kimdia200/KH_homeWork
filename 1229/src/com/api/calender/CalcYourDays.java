package com.api.calender;

import java.util.Calendar;
import java.util.Scanner;

public class CalcYourDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year,month,date;
		System.out.print("생일 (년) : ");
		year = sc.nextInt();
		System.out.print("생일 (월) : ");
		month = sc.nextInt()-1;
		System.out.print("생일 (일) : ");
		date = sc.nextInt();
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(year, month, date);
		Calendar cal2 = Calendar.getInstance();
		
		long life = (cal2.getTimeInMillis()-cal1.getTimeInMillis())/1000/60/60/24;
		
		System.out.println(life);
	}

}
