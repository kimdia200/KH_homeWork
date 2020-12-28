package com.oop.body.model;

public class Leg extends Body{

	public Leg() {
		super();
	}

	public void run() {
		System.out.println("¼ºÅ­¼ºÅ­ ¶Ù¾î°©´Ï´Ù.");
	}	
	@Override
	public void action() {
		run();
	}
}
