package com.io.test2;

import java.util.Scanner;

public class TestMyNote {

	public static void main(String[] args) {
		//1.menu메서드 실행함
		TestMyNote.menu();
		System.out.println("메인 메서드 종료");
	}
	
	//2.public static void menu()작성
	public static void menu() {
		//2.1 MyNote클래스 객체 생성함
		MyNote note = new MyNote();
		//2.2 키보드 입력용 객체 생성함, 아래 내용이 콘솔에 출력되게함
		Scanner sc = new Scanner(System.in);
		
		
		Outter:
		do {
			System.out.print("\n*****   MyNote   *****"+
								"\n1. 노트 새로 만들기"+
								"\n2. 노트 열기"+
								"\n3. 노트 열어서 수정하기"+
								"\n4. 끝내기"+
								"\n입력 : ");
			int num=sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : note.fileSave(); break;
			case 2 : note.fileOpen(); break;
			case 3 : note.fileAppend(); break;
			case 4 : break Outter;
			}
		}while(true);
	}

}
