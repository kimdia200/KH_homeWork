package com.oop.coffee.controller;

import java.util.Scanner;

/**
 * control클래스 구현내용.
    1. Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3.
    2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각 객체에 기록함
    3. 출력 확인함
 *
 */
import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	Coffee[] coffee = new Coffee[3];
	Scanner sc = new Scanner(System.in);

	public CoffeeManager() {
		for (int i = 0; i < coffee.length; i++) {
			System.out.print("원산지 : ");
			String temp1, temp2;
			temp1 = sc.next();
			System.out.print("지역 : ");
			temp2 = sc.next();
			coffee[i]=new Coffee(temp1,temp2);
		}
		System.out.println("====<<세계3대 커피>>====");
		System.out.println("=====================");
		System.out.println("원산지=============지역 ");
		for(int i=0; i<coffee.length; i++) {
			coffee[i].printInfo();
		}
		System.out.println("=====================");
	}
}
