package com.oop.body.model;

public class Leg extends Body{

	public Leg() {
		super();
	}

	public void run() {
		System.out.println("��ŭ��ŭ �پ�ϴ�.");
	}	
	@Override
	public void action() {
		run();
	}
}
