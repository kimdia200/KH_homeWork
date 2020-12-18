package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

/**
 * * 실행용 클래스 : com.oop.emp.run.EmpTest
메뉴작성 : 메소드 작성
=>메뉴 화면의 예
public void mainMenu(){}
******* 사원 정보 관리 프로그램 ************
    1. 새 사원 정보 입력  => empInput() 메소드 실행
    2. 사원 정보 삭제 => 참조변수에 null대입할  것.
    3. 사원정보 출력 =>  empOutput() 메소드 실행
    9. 끝내기
********************************************

 * @author family
 *
 */
public class EmpTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		Employee e = null;

		while(true) {
			System.out.println("************* 사원 정보 관리 프로그램 ************");
			System.out.println("1. 새 사원 정보 입력  => empInput() 메소드 실행");
			System.out.println("2. 사원 정보 삭제 => 참조변수에 null대입할  것.");
			System.out.println("3. 사원정보 출력 =>  empOutput() 메소드 실행");
			System.out.println("9. 끝내기");
			System.out.println("********************************************");
			System.out.print("메뉴 번호 입력 : ");
			
			input = sc.nextInt();
			
			if(input==1) {
				e=new Employee();
				e.empInput();
				continue;
			}else if(input ==2) {
				if(e==null) System.out.println("지울 정보가 없습니다.");
				else e=null;
				continue;
			}else if(input ==3) {
				if(e == null) System.out.println("출력할 정보가 없습니다.");
				else e.empOutPut();
				continue;
			}else if(input ==9) {
				System.out.println(".프로그램 종료.");
				break;
			}
			System.out.println("잘못 입력 하셨습니다.");
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

}
