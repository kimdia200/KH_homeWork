package com.thread.sleep;

public class SleepTest {

	public static void main(String[] args) {
		SleepTest s = new SleepTest();
		s.sendAphorism();
	}

	/**
	 * - 좋아하는 속담, 경구 10개를 문자열배열에 담고, 3초마다 랜덤하게 출력하세요.
	 	- 10번 출력후 종료하세요.
	 */
	public void sendAphorism() {
		String[] s = new String[10];
		s[0]="가는 날이 장날이다.";
		s[1]="가는 말이 고와야 오는 말이 곱다.";
		s[2]="가랑비에 옷 젖는 줄 모른다.";
		s[3]="가랑잎이 솔잎더러 바스락거린다고 한다.";
		s[4]="가재는 게 편이라.";
		s[5]="가지 많은 나무에 바람 잘 날 없다.";
		s[6]="간에 붙었다 쓸개에 붙었다 한다.";
		s[7]="간에 기별도 안간다";
		s[8]="간이 콩알만해지다.";
		s[9]="갈수록 태산";
		
		for(int i=0; i<10; i++) {
			int ran=(int)(Math.random()*10);
			System.out.println(s[ran]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
