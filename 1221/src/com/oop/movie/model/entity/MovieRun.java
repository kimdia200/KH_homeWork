package com.oop.movie.model.entity;

import java.util.Calendar;

public class MovieRun {

	public static void main(String[] args) {
		Movie m1 = new Movie("매트릭스1");
		Movie m2 = new Movie("매트릭스2", "워쇼스키");
		Movie m3 = new Movie("매트릭스3", "워쇼스키", 
				new String[]{"키아누 리브스",
						"캐리앤 모스",
						"로런스 피시번",
						"휴고 위빙",
						"제이다 핑킷 스미스"});
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 22);
		
		Movie m4 = new Movie("매트릭스4", "워쇼스키", 
				new String[]{"키아누 리브스2",
						"캐리앤 모스2",
						"프리양카 쵸프라",
						"제시카 헤닉",
		"제이다 핑킷 스미스2"}, cal);
		
		System.out.println("===========1==========");
		System.out.println(m1.information());
		System.out.println();
		
		System.out.println("===========2==========");
		System.out.println(m2.information());
		System.out.println();
		
		System.out.println("===========3==========");
		System.out.println(m3.information());
		System.out.println();
		
		System.out.println("===========4==========");
		System.out.println(m4.information());
		
		
	}

}
