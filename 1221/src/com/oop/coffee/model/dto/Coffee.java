package com.oop.coffee.model.dto;
/**
 *  - Coffee ������� ������ origin, ���� location
      �⺻������, ����ʵ��ʱ�ȭ������
      getter, setter
      ��¸޼ҵ�      ()
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
			System.out.print("������ : " + origin+"   ");
		else
			System.out.print("������ : �Էµ��� ����."+"   ");
		if(location!=null)	
			System.out.println("���� : " + location+"   ");
		else
			System.out.println("���� : �Էµ��� ����."+"   ");
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
