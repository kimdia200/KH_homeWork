package com.oop.method.nonstatic;
/**
 * 
 * @author 김윤수
 *
 * 과정이 잘 진행되고있나 확인 하기위해
 * 조금 불필요한 프린트문들도 많이 넣었음....
 */
public class NonStaticSample {

	// 1. 반환값 없고 매개변수 없는 메소드
	// 실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	// 메소드명 : printLottoNumbers
	public void printLottoNumbers() {
		int[] ran = new int[6];
		int temp;
		int err=0;
		for (int i = 0; i < ran.length; i++) {
			temp = (int) (Math.random() * 45) + 1;
			// 첫번째 자리는 값 비교할 필요가 없다
			if (i == 0) {
				ran[i] = temp;
			}
			// 첫번째 자리가 아닐경우 값을 비교해서 중복값 없게해야함
			else {
				// 무한반복으로 제대로 중복값이 없을 경우 까지 뽑기
				Outter :
				while (true) {
					// 현재 값을 넣을 인덱스의 바로 전 자리 까지만 검사함
					for (int j = 0; j < i; j++) {
						// 만약 중복값을 발견하면
						if (ran[j] == temp) {
							// 새로운 난수를 부여 
							temp = (int) (Math.random() * 45) + 1;
							//중복이 몇번있었나 확인해보려고 넣었음
							err++;
							// 0번~(i-1)번 인덱스 까지 검사하는 반복문을 종료
							break;
						}
						
						//j == (i-1)일 때 break 되지 않아 아래 조건문이 실행된다 = 중복값이 없음
						if(j==(i-1)) {
							//난수 부여
							ran[i]=temp;
							//라벨 Outter 반복문 종료
							break Outter;
						}
					}
				}
			}
		}
		System.out.println("printLottoNumbers 메소드 작동!");
		for(int i=0; i<ran.length;i++) {
			System.out.print(ran[i]);
			System.out.print(i!=ran.length-1 ? ", ": "");
		}
		System.out.println("\n중복은 "+err+"번 있었습니다");
	}

	
	// 2. 반환값 없고 매개변수 있는 메소드
	// 실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	// 메소드명 : outputChar
	public void outPutChar(int num, char ch) {
		System.out.println("outPutChar 메소드작동!");
		for(int i=0; i<num; i++) {
			System.out.print(ch);
			System.out.print(i!=num-1 ? ", ": "");
		}
		System.out.println("\n문자열 "+ch+", 총 "+num+"번 출력했습니다.");
	}
	
	
	// 3. 반환값 있고 매개변수 없는 메소드
	// 실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	// 메소드명 : alphabet
	//65 90
	//97 122
	public char alphabet() {
		int ran;
		System.out.println("alphabet 메소드작동!");
		while(true) {
			ran = (int)(Math.random()*122)+1;
			if((ran>='a'&&ran<='z') || (ran>='A'&&ran<='Z')) {
				break;
			}
			//그냥 실패 확인 해보려고 넣었음
			else 
				System.out.println("실패" + (char)ran);
		}
		return (char)ran;
	}
	
	
	// 4. 반환값 있고 매개변수 있는 메소드
	// 실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	// 추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	// 메소드명 : mySubstring
	public String mySubString(String s, int start_Index, int end_Index) {
		System.out.println("mySubString 메소드작동!");
		if(s==null) {
			System.out.println("입력하신 문자열은 값이 없습니다.");
			return null;
		}
		if(start_Index<0) {
			System.out.println("start_Index가 잘못 되었습니다.");
			return null;
		}
		if(end_Index+1>s.length()) {
			System.out.println("end_Index가 잘못 되었습니다.");
			return null;
		}
					
		return s.substring(start_Index,end_Index+1);
	}
}