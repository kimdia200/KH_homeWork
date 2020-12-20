package test.controller;

import java.util.Scanner;

/**
 * 입력 : 3
 * 출력 : 2의 배수가 아닙니다
 * 
 * 입력 : 80
 * 출력 : 2의 배수입니다
 * @author kimYS
 *
 */
public class Test1 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		
		num=sc.nextInt();
		
		if(num%2==0)
			System.out.println("2의 배수 입니다.");
		else
			System.out.println("2의 배수가 아닙니다.");
	}

}
