package com.oop.body.model;

public class Arm extends Body {

	public Arm() {
		super();
	}
	public void armSwing() {
		System.out.println("���� �����ϴ�.");
	}
	@Override
	public void action() {
		armSwing();
	}
}
