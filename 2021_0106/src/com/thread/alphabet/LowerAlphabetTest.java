package com.thread.alphabet;

public class LowerAlphabetTest implements Runnable {
	
	@Override
	public void run() {
		char ch = 'a';
		while(true) {
			if(ch>='a'&&ch<='z') {
				System.out.print(ch+" ");
				ch++;
			}else {
				break;
			}
		}
	}

}
