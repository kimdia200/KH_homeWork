package com.kh.test.condition;

import java.util.Scanner;

/**
 * - 메소드명 : public void test()
    정수 두개를 입력 받고, 연산자(+,-,*,/)를 입력받은 다음 계산한 뒤  결과를 출력하는 계산기 프로그램을 만들어보세요.      
    출력 예) 입력 5, 6, +
           5+6=11
    음수가 입력되거나 +,-,*,/ 이외의 문자가 입력되면 “잘못 입력 하셨습니다.  프로그램을 종료합니다.” 라는 문구가 출력되게 하세요.

 * @author family
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	public void test() {
		int a, b;
		char c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 두개를 입력하세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();

		
		System.out.print("연산자를 입력하세요 (+, -, *, /) : ");
		c= sc.next().charAt(0);
		
		if(a<0 || b<0) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.(음수입력)");
		}else if(c=='+') {
			System.out.println(a + " + " + b + " = " + (a+b));
		}else if(c=='-') {
			System.out.println(a + " - " + b + " = " + (a-b));
		}else if(c=='*') {
			System.out.println(a + " * " + b + " = " + (a*b));
		}else if(c=='/') {
			System.out.println(a + " / " + b + " = " + (a/b));
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.(잘못된 연산자입력)");
		}
	}
}
