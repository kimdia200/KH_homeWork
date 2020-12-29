package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {
		CalcDday d = new CalcDday();
		d.test1();
		d.test2();
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		int year,month,date;
		System.out.print("목표D-day (년) : ");
		year = sc.nextInt();
		System.out.print("목표D-day (월) : ");
		month = sc.nextInt()-1;
		System.out.print("목표D-day (일) : ");
		date = sc.nextInt();
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(year, month, date);
		Calendar cal2 = Calendar.getInstance();
		
		double dday = (double)(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000/60/60/24;
		
		if(dday>0)
			System.out.printf("D-%.0f일 입니다.",dday);
		else if((int)dday==0)
			System.out.println("D-Day 입니다.");
		}
	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		int year,month,date;
		System.out.print("목표D-day (년) : ");
		year = sc.nextInt();
		System.out.print("목표D-day (월) : ");
		month = sc.nextInt()-1;
		System.out.print("목표D-day (일) : ");
		date = sc.nextInt();
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(year, month, date);
		Calendar cal2 = Calendar.getInstance();
		
		double dday = (double)(cal1.getTimeInMillis()-cal2.getTimeInMillis())/1000/60/60/24;
		
		if(dday>0)
			System.out.printf("D-%.0f일 남았습니다.",dday);
		else if((int)dday==0)
			System.out.println("D-Day 입니다.");
		else if(dday<0){
			System.out.printf("%.0f일 지났습니다.",dday*-1);
		}
	}
}
