package com.kh.test.condition;

import java.util.Scanner;

/**
 * [문제 1] - 클래스 : com.kh.test.condition.Test1.java 1.메소드명 : public void test1()
 * - 국어, 영어, 수학 점수를 입력 받아 합계를 계산하고 합계가 250점 이상이면 “우수생입니다.”를 출력하는 코드를 작성하세요.
 * 2.메소드명 : public void test2() - A, B, C연봉을 입력하고 각 연봉을 입력하고 연 봉이 5000이상이면 “0은
 * 고액연봉자입니다” 라고 출력하는 프로그램을 작성하세요. 3.메소드명 : public void test3() - 정수 한 개를 입력 받아
 * 짝수면 “짝수다” 홀수면 “홀수다라고 출력하세요.
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
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();

		System.out.print("영어 점수 : ");
		eng = sc.nextInt();

		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		if ((kor + eng + math) >= 250) {
			System.out.println("우수생입니다.");
		}
	}

	public void test2() {
		int a, b , c;

		Scanner sc = new Scanner(System.in);
		System.out.print("a 연봉 : ");
		a = sc.nextInt();

		System.out.print("b 연봉 : ");
		b = sc.nextInt();

		System.out.print("c 연봉 : ");
		c = sc.nextInt();
		if ( a >= 5000) {
			System.out.println("a는 고액연봉자 입니다.");
		}
		if ( b >= 5000) {
			System.out.println("b는 고액연봉자 입니다.");
		}
		if ( c >= 5000) {
			System.out.println("c는 고액연봉자 입니다.");
		}
	}
	/*
	 * 3.메소드명 : public void test3() - 정수 한 개를 입력 받아
 * 짝수면 “짝수다” 홀수면 “홀수다라고 출력하세요.
	 */
	public void test3() {
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
	}
	

}
