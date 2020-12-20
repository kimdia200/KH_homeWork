package test.controller;

import java.util.Scanner;

/**
 * 키보드로 2개의 정수형 데이터를 입력 받아, 
 * 두 수가 모두 1부터 9까지의 수일 때만 두 수 의 곱이 한자리 수인지 두자리 수인지를 출력한다
 * 
 * ex)
 * 입력 예1 : 2 3
 * 한자리 수입니다.
 * 입력 예2 : 4 5
 * @author kimYS
 *
 */
public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("정수를 두개 입력하세요(1~9) : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if((a>=1 && a<=9) && (b>=1 && b<=9))
			if(a*b>=10)
				System.out.println((a*b)+"는 두자리 수 입니다.");
			else 
				System.out.println((a*b)+"는 한자리 수 입니다.");
		else
			System.out.println("올바른 범위가 아닙니다.");
		
	}

}
