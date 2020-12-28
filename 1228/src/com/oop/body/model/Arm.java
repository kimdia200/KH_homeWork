package com.oop.body.model;

public class Arm extends Body {

	public Arm() {
		super();
	}
	public void armSwing() {
		System.out.println("∆»¿ª ª∏Ω¿¥œ¥Ÿ.");
	}
	@Override
	public void action() {
		armSwing();
	}
}
