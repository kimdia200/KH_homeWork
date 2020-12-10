package com.kh.test.condition;

import java.util.Scanner;

/**
 * - 메소드명 : public void test()
    
       *********주메뉴*********
       a. 불고기버거 ------------5000
       b. 새우버거 --------------4000
       c. 치킨버거 --------------4500
       d. 한우버거 -------------10000
       e. 디버거 ----------------7000
       ***********************  
       
       *******사이드메뉴********
        1. 콜라 -------------------1500
        2. 사이다 -----------------1500
        3. 밀크쉐이크-------------2500
        4. 레드불------------------3000
        ***********************
       두메뉴를 순서대로 제시하고, 각각 사용자선택번호를 받으세요.
    예) 주메뉴에서 a, 선택후 사이드메뉴에서 4 선택시
    “불고기버거, 레드불은 총 8000원입니다“출력.
    
    각메뉴선택시 다른문자를  입력하면 “번호를 잘못 누르셨습니다. 영업을 종료합니다.”
 */
public class Test9 {

	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.test();
	}
	public void test() {
		char ch;
		int num, sum=0;
		Scanner sc = new Scanner(System.in);
		String menu =
				"*********주메뉴*********\n"+
				"a. 불고기버거 ------------5000\n"+
				"b. 새우버거 --------------4000\n"+
				"c. 치킨버거 --------------4500\n"+
				"d. 한우버거 -------------10000\n"+
				"e. 디버거 ----------------7000\n"+
				"***********************";
		System.out.println(menu);
		
		System.out.print("주메뉴를 입력하세요 : ");
		ch = sc.nextLine().charAt(0);
		menu = 
				"*******사이드메뉴********\n"+
				"1. 콜라 -------------------1500\n"+
				"2. 사이다 -----------------1500\n"+
				"3. 밀크쉐이크-------------2500\n"+
				"4. 레드불------------------3000\n"+
				"***********************";
		System.out.println(menu);
		System.out.print("드링크를 입력하세요 : ");
		num = sc.nextInt();
		if(ch<'a'||ch>'e'||num<1||num>4) {
			System.out.println("번호를 잘못 누르셨습니다. 영업을 종료합니다.");
			return;
		}
		
		switch(ch) {
		case 'a' :
			System.out.print("불고기버거, ");
			sum+=5000;
			break;
		case 'b' :
			System.out.print("새우버거, ");
			sum+=4000;
			break;
		case 'c' :
			System.out.print("치킨버거, ");
			sum+=4500;
			break;
		case 'd' :
			System.out.print("한우버거, ");
			sum+=10000;
			break;
		case 'e' :
			System.out.print("디버거, ");
			sum+=7000;
			break;
		}
		
		switch(num) {
		case 1 :
			sum+=1500;
			System.out.println("콜라는 총 "+sum+"원 입니다.!");
			break;
		case 2:
			sum+=1500;
			System.out.println("사이다는 총 "+sum+"원 입니다.!");
			break;
		case 3 :
			sum+=2500;
			System.out.println("밀크쉐이크는 총 "+sum+"원 입니다.!");
			break;
		case 4 :
			sum+=3000;
			System.out.println("레드불은 총 "+sum+"원 입니다.!");
			break;
		}
	}

}
