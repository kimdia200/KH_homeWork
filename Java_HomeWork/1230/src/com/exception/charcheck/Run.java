package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Run r = new Run();
		r.test1();
	}

	public void test1() {
		System.out.print("문자열을 입력하세요 : ");
		try {
			CharacterProcess cp = new CharacterProcess();
			Scanner sc = new Scanner(System.in);
			int x = cp.countAlpha(sc.nextLine());
			System.out.println("알파벳의 갯수 : " + x);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
