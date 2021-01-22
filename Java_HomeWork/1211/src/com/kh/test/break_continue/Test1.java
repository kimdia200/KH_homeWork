package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test2();
	}
	
	/**
	 *   - 메소드명 : public void test1()
    	1) 정수 한 개를 입력 받아, 1부터 입력 받은 정수까지의 홀수의 곱을 출력하세요.
	 */
	public void test1() {
		int sum=1;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한개를 입력하세요 : ");
		num = sc.nextInt();
		for(int i = 1;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			sum*=i;
		}
		
		//while문 
//		int i = 0;
//		while(++i<=num) {
//			if(i%2==0) {
//				continue;
//			}
//			sum*=i;
//		}
		System.out.print("1 ~ "+num+" 까지의 홀수의 곱 : "+sum);
	}
/**
 * - 메소드명 : public void test2()
    2) 사용자로부터 정수를 두개 입력 받아서, 작은 정수에서 큰 정수까지 홀수의 합을 구하세요.
        Tip. 큰수/작은수에 해당하는 변수를 사용할 것.
     
        결과:
        정수를 하나 입력하세요. => 100
        다른 정수를 하나 입력하세요. => 1
        ====================
        1부터 100까지의 홀수의 합은 2500입니다
 */
	public void test2() {
		int big, small, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 => ");
		big = sc.nextInt();
		System.out.print("다른 정수를 하나 입력하세요 => ");
		small = sc.nextInt();
		
		if(big<small) {
			int temp = big;
			big = small;
			small = temp;
		}
		
		//for문
		for(int i = small ; i<=big; i++) {
			if(i%2==0)
				continue;
			sum+=i;
		}
		//while문
//		int i = small-1;
//		while(++i<=big) {
//			if(i%2==0)
//				continue;
//			sum+=i;
//		}
		
		
		System.out.println("=====================");
		System.out.println(small+"부터 "+big+"까지의 홀수의 합은 " + sum + "입니다.");
	}
}
