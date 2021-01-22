package com.exception.number;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Run r = new Run();
		r.test();
	}
	public void test() {
		System.out.println("두개의 정수를 입력하세요");
		try{
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			NumberProcess np = new NumberProcess();
			boolean flag = np.checkDouble(a, b);
			if(flag) {
				System.out.println("첫번째수는 두번째수의 배수가 맞습니다.");
			}else {
				System.out.println("첫번째수는 두번째수의 배수가 아닙니다.");
			}
		}catch (NumberRangeException e){
			e.printStackTrace();
		}
	}
}
