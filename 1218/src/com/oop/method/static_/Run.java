package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		//1
		String a = "abcdef";
		System.out.println("기존 String 값 : "+a);
		System.out.println();
		
		//2
		a=StaticMethod.toUpper(a);
		System.out.println("upper적용후 String 값 : "+a);
		System.out.println();
		
		//3
		System.out.println("기존 String 의 알파벳의 갯수 : "+StaticMethod.getAlphabetLength(a));
		System.out.println("setchar("+a+", 1, '2')메소드 실행");
		a=StaticMethod.setChar(a, 1, '2');
//		StaticMethod.setChar(a, 1, '2'); //String 은 immutable class라서 원본 값이 변경 될 수 없음....
										//그래서 return 있는 메소드로 만들어서 처리함
		System.out.println("setChar적용 : "+a);
		System.out.println();
		
		//4
		System.out.println("변경 후 String 의 알파벳의 갯수알파벳의 갯수 : "+StaticMethod.getAlphabetLength(a));
		
	}

}
