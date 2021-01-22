package com.kh.test.condition;

import java.util.Scanner;

/**
 * 수도세를 구하는 프로그램을 작성하세요. 
사용자에게 사용용도와 물사용량을 입력받고, 이에따른 수도세를 계산해 출력하세요.(switch문 사용할 것.)
* 사용요금: 용도별 가격(1liter)  * 사용량
* 수도세: 사용요금의 5%
* 총사용요금: 사용요금 + 수도세
* 사용용도메뉴에서 1,2,3번이외를 선택시에는 "메뉴번호는 1,2,3만 가능합니다."를 출력하고, 프로그램을 종료할 수 합니다.
사용자입력예시)
        ----------menu----------
        1. 가정용 (50원/liter)
        2. 상업용 (45원/liter)
        3. 공업용 (30원/liter)
        -------------------------
        메뉴번호를 선택하세요. ==> 2
        물 사용량을 입력하세요. ==> 250
출력예시)
        ----------<<수도세>>-----------
        선택메뉴번호 :  2. 상업용(업소에서 사용하실 경우)를 선택하셨습니다. 
        사용요금 : 11250
        수도세 : 562
        총수도요금 : 11812원
 *
 */
public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 t1 = new SwitchTest1();
		t1.test();
	}
	public void test() {
		int select, num, per=0, charge=0,tax=0;
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"----------menu----------\n"+
				"1. 가정용 (50원/liter)\n"+
				"2. 상업용 (45원/liter)\n"+
				"3. 공업용 (30원/liter)\n"+
				"-------------------------\n"+
				"메뉴번호를 선택하세요. ==> ");
		select = sc.nextInt();
		if(select < 1 || select > 3) {
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
			return;
		}
		System.out.print("물 사용량을 입력하세요. ==> ");
		num = sc.nextInt();
		System.out.println("----------<<수도세>>-----------");
		switch(select) {
		case 1 : 
			per = 50;
			System.out.println("선택메뉴번호 :  1. 가정용(50원/liter)을 선택하셨습니다.");
			break;
		case 2 : 
			per = 45;
			System.out.println("선택메뉴번호 : 2. 상업용(45원/liter)을 선택하셨습니다.");
			break;
		case 3 : 
			per = 30;
			System.out.println("선택메뉴번호 : 3. 공업용(30원/liter)을 선택하셨습니다.");
			break;
		}

		System.out.print("사용요금 : "+ (charge+=num*per)
					+ "\n수도세 : " + (tax+=charge*0.05)
					+"\n총 수도요금 : " +(charge+tax));
		
	}
	
	

}
