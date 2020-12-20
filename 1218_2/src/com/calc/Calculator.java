package com.calc;

/**
 * 문제 main의 argument로 1자리 정수형(1부터 9까지만) 값을 2개 입력받아 4칙연산 결과를 출력한다 입력값은 모두 int형으로
 * 처리한다
 * 
 * @author kimYS
 *
 */
public class Calculator {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if ((a >= 1 && a <= 9) && (b >= 1 && b <= 9)) {
			System.out.println("정수1 : " + a + ", 정수2 : " + b);
			// 합
			System.out.println("합 : " + a + "+" + b + "=" + (a + b));
			// 차
			System.out.println("차 : " + a + "-" + b + "=" + (a - b));
			// 곱
			System.out.println("곱 : " + a + "*" + b + "=" + (a * b));
			// 나누기 (단, 나누는 수(분모)가 0이거나 0보다 작으면 결과는 0처리한다)
			if (b <= 0) {
				System.out.println("나누기 : 0(분모가 " + b + "라서)");
			} else {
				System.out.println("나누기 : " + a + "/" + b + "=" + (a / b));
			}
		}else {
			System.out.println("정수의 입력 범위가 잘못 되었습니다.");
			return;
		}
	}
}
