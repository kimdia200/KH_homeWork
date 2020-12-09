package com.kh.test;

//각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.
//- 정수형 100, 9999억, 
//- 실수 486.520(float), 567.890123
//- 문자 A
//- 문자열 Hello world, 
//- 논리 true
// 
// 단, 변수를 이용하여 출력하시오 .
//com.kh.test.Test1 에 작성

public class Test1 {

	public static void main(String[] args) {
		
		int iA=100;
		Long lA=999900000000L;
		
		float fA = 486.520f;
		double dA = 567.890123;
		
		char cA = 'A';
		String sA = "Hello world";
		
		boolean bA = true;
		
		System.out.println(iA);
		System.out.println(lA);
		
		System.out.println(fA);
		System.out.println(dA);
		
		System.out.println(cA);
		System.out.println(sA);
		
		System.out.println(bA);

	}

}
