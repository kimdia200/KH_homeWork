package com.thread.alphabet;

public class UpperAlphabetTest implements Runnable {

	@Override
	public void run() {
		char ch = 'A';
		while(true) {
			if(ch>='A'&&ch<='Z') {
				System.out.print(ch+" ");
				ch++;
			}else {
				break;
			}
		}
	}

}
