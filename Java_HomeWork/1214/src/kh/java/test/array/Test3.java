package kh.java.test.array;

import java.util.Scanner;

/**
 * [문제3]
- 클래스 : kh.java.test.array.Test3.java
- 메소드명 : public void test()
    문자열을 하나 입력 받아 문자배열에 넣고 검색할 문자를 하나 입력 받아 검색 문자가 문자열에 몇 개인지 개수를 출력하는 프로그램을 작성하세요.
    
    예) 입력값 : helloworld
    검색값 :ㅣ
    출력 : 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
 *
 */
public class Test3 {
	public static void main(String[] args) {
		
		String input1;
		char input2;
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력값 : ");
		
		input1 = sc.nextLine();
		
		char[] arr = new char[input1.length()];
		
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = input1.charAt(i);
		}
		
		System.out.print("검색값 : ");
		input2 = sc.nextLine().charAt(0);
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]==input2)
				count++;
		}
		System.out.println("입력하신 문자열 "+input1+"에서 찾으시는 문자 " + input2 +"은 "+ count+"개 입니다.");
		
		
	}
}
