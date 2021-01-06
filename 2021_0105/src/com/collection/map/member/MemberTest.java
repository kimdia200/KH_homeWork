package com.collection.map.member;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MemberTest {
	Map<String, Member> map = new HashMap<String, Member>();
	public static void main(String[] args) {
		MemberTest mt = new MemberTest();
		mt.test1();
		mt.test2();
		mt.test3();
		mt.test1();
		mt.test4();
		mt.test1();
	}
	public MemberTest() {
		map.put("honggd", new Member("honggd","1234","홍길동",35,"01012341234"));
		map.put("sinsa", new Member("sinsa","1234","신사임당",50,"01012341234"));
		map.put("leess", new Member("leess","1234","이순신",43,"01012341234"));
		map.put("yooon", new Member("yooon","1234","윤봉길",37,"01012341234"));
		map.put("jangbg", new Member("jangbg","1234","장보고",29,"01012341234"));
	}
	
	//객체의 모든 정보 출력
	public void test1() {
		System.out.println("==================================================\r\n" + 
						   "		아이디   비밀번호    이름      나이  전화번호\r\n" + 
						   "--------------------------------------------------");
		Set<Entry<String, Member>> entrySet = map.entrySet();
		for(Entry<String,Member> entry : entrySet) {
			Member member = entry.getValue();
			System.out.println(member);
		}
	}
	
	public boolean isUserExist(String userID) {
		Set<Entry<String, Member>> entrySet = map.entrySet();
		for(Entry<String,Member> entry : entrySet) {
			Member member = entry.getValue();
			if(member.getUserId()==userID)
				return true;
		}
		return false;
	}
	
	public void test2() {
		System.out.println("jangbg 라는 id를 가진 사람이 있습니까? : " +isUserExist("jangbg"));
		System.out.println("sejong 라는 id를 가진 사람이 있습니까? : "+isUserExist("sejong"));
	}
	
//	3. yooon 아이디 조회후 해당객체를 다음과 같이 수정하세요.
	public void test3() {
		String key;
		Member mm;
		Set<Entry<String, Member>> entrySet = map.entrySet();
		for(Entry<String,Member> entry : entrySet) {
			Member member = entry.getValue();
			if(member.getUserId().equals("yooon")) {
				key=entry.getKey();
				mm = entry.getValue();
//				- 비밀번호 : 5678
//				- 이름 : 윤동주
//				- 나이 : 27
//				- 전화번호 : 01034563456
				mm.setUserPwd("5678");
				mm.setUserName("윤동주");
				mm.setAge(27);
				mm.setPhoneNumber("01034563456");
//				newM = new Member(oldM.getUserId(),oldM.getUserPwd(),oldM.getUserName(),oldM.getAge(),oldM.getPhoneNumber());
				map.put(key,mm);
				break;
			}
		}
		
	}
	public void test4() {
		Set<Entry<String, Member>> entrySet = map.entrySet();
		for(Entry<String,Member> entry : entrySet) {
			Member member = entry.getValue();
			String key = entry.getKey();
			if(member.getUserId().equals("sinsa"))
				map.remove(key);
			break;
		}
	}
}
