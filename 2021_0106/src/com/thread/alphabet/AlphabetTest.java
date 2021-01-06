package com.thread.alphabet;
/**
 * <문제 2>
- 실행용 클래스 : com.thread.alphabet.AlphabetTest.java
- 쓰레드 클래스 : com.thread.alphabet.UpperAlphbetThread.java
               com.thread.alphabet.LowerAlphbetThread.java  
두개의 멀티쓰레드를 만들고, 각각 알파벳대문자, 알파벳 소문자를 출력하세요.
 *
 */
public class AlphabetTest {
	public static void main(String[] args) {
		Thread lo = new Thread(new LowerAlphabetTest());
		Thread up = new Thread(new UpperAlphabetTest());
		
		lo.start();
		up.start();
	}
}
