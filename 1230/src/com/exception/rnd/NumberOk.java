package com.exception.rnd;

import java.util.Scanner;

//난수를 발생시켜 키보드로 입력된 값과 비교하여 임의의 정수를 맞히는 프로그램
public class NumberOk {
	private int ran;

	public static void main(String[] args) {
		NumberOk n = new NumberOk();
		n.gameStart();
	}

	public void gameStart() {
		int count = 0;
		ran = (int) (Math.random() * 100) + 1;
		Outter:
		while(true) {
			Scanner sc = new Scanner(System.in);
//			System.out.println(ran); //현재 난수 확인
			while(true) {
				System.out.print("정수 입력 : ");
				int temp;
				try {
					temp = getNumber();
					temp=checkNumber(temp);
					count++;
					if(temp==0) {
						System.out.println("정답입니다 !!!   count = "+count);
						break;
					}else if(temp==-1) {
						System.out.println("난수보다 큽니다.");
					}else if(temp==1) {
						System.out.println("난수 보다 작습니다.");
					}
				} catch (Exception e) {
					System.out.println("오류로 인한 재경기 시작~!");
					continue Outter;
				}
				
			}
			System.out.print("게임을 계속 할까요?!  (입력 y) : ");
			String s = sc.nextLine();
			if(s.equals("y")) {
				count=0;
				ran = (int) (Math.random() * 100) + 1;
				System.out.println("게임을 다시 시작합니다~!");
			}else {
				System.out.println("게임을 중단합니다.");
				break;
			}
		}
	}

	public int checkNumber(int temp) {
		if (ran == temp)
			return 0;
		else if (ran < temp)
			return -1;
		else
			return 1;
	}

	public int getNumber() throws Exception {
		int input;
		try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			if(input>=1&&input<=100)
				return input;
			else
				throw new Exception("정수의 범위가 잘못되었습니다.");
		} catch (Exception e) {
			throw new Exception("숫자가 아닙니다.");
		}
	}
}
