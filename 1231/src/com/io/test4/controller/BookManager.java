package com.io.test4.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);
	public BookManager() {
		super();
	}
	public void fileSave() {
		//1.객체배열 선언 5개 초기화함 , 샘플데이터 임의작성
		Book[] b = new Book[5];
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		Calendar cal4 = Calendar.getInstance();
		Calendar cal5 = Calendar.getInstance();
		cal1.set(1900, 0,1);
		cal2.set(2010, 8,6);
		cal3.set(1990, 0,20);
		cal4.set(2018, 5,18);
		cal5.set(1800, 3,1);
		b[0] = new Book("아기돼지 삼형제", "모름", 12_000, cal1, 10.0);
		b[1] = new Book("겨울왕국", "디즈니", 20_000, cal2, 5.0);
		b[2] = new Book("부자아빠", "기요사키 로버트", 15_800, cal3, 15.0);
		b[3] = new Book("부의 추월차선", "엠제이 드마코", 13_500, cal4, 8.0);
		b[4] = new Book("집에있던 낡은책", "몰라몰라", 1_000, cal5, 50.0);
		
		File f = new File("books.dat");
		try(
			ObjectOutputStream oos = 
				new ObjectOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(f))); 
		){	//2.books.dat파일에 객체 기록 저장함
			//3.try with resource문 사용할것
			oos.writeObject(b);
			//4.book.dat에 저장완료 출력	
			System.out.println("book.dat에 저장완료!");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void fileRead() {
//		  1. Book 객체 배열 선언 : 10개
		Book[] b = new Book[10];

		File f = new File("books.dat");
		try(//FileOutputStream = 대상을 가르키는 기본스트림, BufferedOutputStream, ObjectOutputStream = 보조스트림
				ObjectInputStream ois = 
					new ObjectInputStream(
							new BufferedInputStream(
									new FileInputStream(f))); 
			){
				int i=0;
				while(true) {//다 읽어오면 EOFException발생 하니까 예외처리해줌
					Object[] temp = new Object[10];
					temp = (Object[]) ois.readObject();

//			        2. "books.dat" 파일에서 데이터 읽어서 배열에 저장함
//			        3. 객체 정보를 화면에 출력함
//			        4. try with resource 문 사용할 것
					if(temp instanceof Book[])
						b=(Book[]) temp;
					else 
						System.out.println("저장실패");
					for(Book bt : b)
						System.out.println(bt);
				}
			}catch (EOFException e) {
//				5. "books.dat 읽기 완료!" 출력
				System.out.println("파일 읽어오기 완료");
			}catch (IOException | ClassNotFoundException e) {//멀티 캐치절 버티컬바 하나인거 메모
				e.printStackTrace();
			}
	}
}
