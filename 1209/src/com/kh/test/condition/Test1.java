package com.kh.test.condition;

import java.util.Scanner;

/**
 * [���� 1] - Ŭ���� : com.kh.test.condition.Test1.java 1.�޼ҵ�� : public void test1()
 * - ����, ����, ���� ������ �Է� �޾� �հ踦 ����ϰ� �հ谡 250�� �̻��̸� ��������Դϴ�.���� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * 2.�޼ҵ�� : public void test2() - A, B, C������ �Է��ϰ� �� ������ �Է��ϰ� �� ���� 5000�̻��̸� ��0��
 * ��׿������Դϴ١� ��� ����ϴ� ���α׷��� �ۼ��ϼ���. 3.�޼ҵ�� : public void test3() - ���� �� ���� �Է� �޾�
 * ¦���� ��¦���١� Ȧ���� ��Ȧ���ٶ�� ����ϼ���.
 *
 */
public class Test1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		t1.test1();
		t1.test2();
		t1.test3();

	}

	public void test1() {
		int kor, eng, math;

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		kor = sc.nextInt();

		System.out.print("���� ���� : ");
		eng = sc.nextInt();

		System.out.print("���� ���� : ");
		math = sc.nextInt();
		if ((kor + eng + math) >= 250) {
			System.out.println("������Դϴ�.");
		}
	}

	public void test2() {
		int a, b , c;

		Scanner sc = new Scanner(System.in);
		System.out.print("a ���� : ");
		a = sc.nextInt();

		System.out.print("b ���� : ");
		b = sc.nextInt();

		System.out.print("c ���� : ");
		c = sc.nextInt();
		if ( a >= 5000) {
			System.out.println("a�� ��׿����� �Դϴ�.");
		}
		if ( b >= 5000) {
			System.out.println("b�� ��׿����� �Դϴ�.");
		}
		if ( c >= 5000) {
			System.out.println("c�� ��׿����� �Դϴ�.");
		}
	}
	/*
	 * 3.�޼ҵ�� : public void test3() - ���� �� ���� �Է� �޾�
 * ¦���� ��¦���١� Ȧ���� ��Ȧ���ٶ�� ����ϼ���.
	 */
	public void test3() {
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("¦����");
		}else {
			System.out.println("Ȧ����");
		}
	}
	

}
