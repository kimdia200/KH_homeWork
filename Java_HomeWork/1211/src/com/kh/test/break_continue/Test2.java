package com.kh.test.break_continue;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
/**
 * 
- 클래스 : com.kh.test.break_continue.Test2.java
- 메소드명 : public void test()
    1~100 사이의 임의의 난수를 발생시키고, 
       정수 한 개를 입력 받아, 
       난수가 입력 받은 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력, 
       난수가 입력 받은 정수보다 크면 “입력하신 정수보다 큽니다.” 출력하세요.
       단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복되도록 하고, 
       정답인 경우 “정답입니다. 5회 만에 정답을 맞추셨습니다.”와 같이 
       몇 회 만에 정답을 맞추었는지 출력하도록 작성하세요.
 */
	public void  test() {
		int r = (int)(Math.random()*100)+1;
		int num, count;
		Scanner sc = new Scanner(System.in);
		
		
		//for문 + break;
		for(count=1; ; count++ ) {
			System.out.print("정수를 하나 입력하세요 => ");
			num = sc.nextInt();
			if(r==num) {
				break;
			}else if(r<num) {
				System.out.println("입력하진 정수보다 작습니다.");
			}else {
				System.out.println("입력하신 정수보다 큽니다.");
			}
		}
		System.out.println(count+"회 만에 맞추셨습니다!");

//		while + continue
		count =1 ;
		while(true) {
			System.out.print("정수를 하나 입력하세요 => ");
			num = sc.nextInt();
			if(r<num) {
				System.out.println("입력하신 정수보다 작습니다");
				count++;
				continue;
			}else if(r>num) {
				System.out.println("입력하신 정수보다 큽니다");
				count++;
				continue;
			}
			break;
		}
		System.out.println(count+"회 만에 맞추셨습니다!");
	}
}
