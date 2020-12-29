package com.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String s = "J a v a P r o g r a m";
		StringTokenizer token = new StringTokenizer(s);
		
		System.out.println("토큰 처리전 글자 :"+s);
		System.out.println("토큰 처리전 글자갯수 : "+s.length());
		
		char[] ch = new char[token.countTokens()];
		int i=0;
		while(token.hasMoreTokens()) {
			ch[i] = token.nextToken().charAt(0);
			i++;
		}
		System.out.println("====================================================");
		System.out.println("토큰 처리후 글자 갯수 : "+ch.length);
		System.out.println("char[] 값 출력 : "+Arrays.toString(ch));
		System.out.println("====================================================");
		
		StringBuilder sb = new StringBuilder();
		sb.append(ch);
		String temp = sb.toString().toUpperCase();
		System.out.println("↓↓↓cahr[]을 다시 String으로 바꾼뒤 모두 대문자로 변환하여 출력한값 ↓↓↓");
		System.out.printf("%30s",temp);
	}

}
