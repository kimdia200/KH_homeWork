package com.oop.coffee.controller;

import java.util.Scanner;

/**
 * controlŬ���� ��������.
    1. Coffee Ŭ������ ���� ��ü �迭(����3��Ŀ������) ������. �迭ũ�� 3.
    2. ����ڿ��� Ű����� ����3�� Ŀ�������� �Է¹޾�, �� ��ü�� �����
    3. ��� Ȯ����
 *
 */
import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	Coffee[] coffee = new Coffee[3];
	Scanner sc = new Scanner(System.in);

	public CoffeeManager() {
		for (int i = 0; i < coffee.length; i++) {
			System.out.print("������ : ");
			String temp1, temp2;
			temp1 = sc.next();
			System.out.print("���� : ");
			temp2 = sc.next();
			coffee[i]=new Coffee(temp1,temp2);
		}
		System.out.println("====<<����3�� Ŀ��>>====");
		System.out.println("=====================");
		System.out.println("������=============���� ");
		for(int i=0; i<coffee.length; i++) {
			coffee[i].printInfo();
		}
		System.out.println("=====================");
	}
}
