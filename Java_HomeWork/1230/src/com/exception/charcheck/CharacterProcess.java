package com.exception.charcheck;

public class CharacterProcess{
	//기본생성자 생략
	public int countAlpha(String s) throws Exception {
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				throw new Exception("체크할 문자열 안에 공백 포함할 수 없습니다.");
			}
			else if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')) {
				count++;
			}
		}
		return count;
	}
}
