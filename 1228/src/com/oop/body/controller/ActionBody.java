package com.oop.body.controller;

import com.oop.body.model.Arm;
import com.oop.body.model.Body;
import com.oop.body.model.Head;
import com.oop.body.model.Leg;

public class ActionBody {
	public static void main(String[] args) {
		Body[] b = new Body[5];
		
		b[0] = new Arm();
		b[1] = new Head("red");
		b[2] = new Leg();
		b[3] = new Head("blue");
		b[4] = new Arm();
		
		for(Body bo : b)
			bo.action();
	}
}