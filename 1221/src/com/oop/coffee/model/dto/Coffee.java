package com.oop.coffee.model.dto;
/**
 *  - Coffee 멤버변수 원산지 origin, 지역 location
      기본생성자, 모든필드초기화생성자
      getter, setter
      출력메소드      ()
 *
 */
public class Coffee {
	String origin;
	String location;
	
	
	public Coffee() {
		
	}
	public Coffee(String origin, String location) {
		this.origin = origin;
		this.location = location;
	}
	
	public void printInfo() {
		if(origin!=null)
			System.out.print("원산지 : " + origin+"   ");
		else
			System.out.print("원산지 : 입력되지 않음."+"   ");
		if(location!=null)	
			System.out.println("지역 : " + location+"   ");
		else
			System.out.println("지역 : 입력되지 않음."+"   ");
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
