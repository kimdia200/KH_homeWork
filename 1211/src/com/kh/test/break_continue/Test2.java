package com.kh.test.break_continue;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
/**
 * 
- Ŭ���� : com.kh.test.break_continue.Test2.java
- �޼ҵ�� : public void test()
    1~100 ������ ������ ������ �߻���Ű��, 
       ���� �� ���� �Է� �޾�, 
       ������ �Է� ���� �������� ������ ���Է��Ͻ� �������� �۽��ϴ�.�� ���, 
       ������ �Է� ���� �������� ũ�� ���Է��Ͻ� �������� Ů�ϴ�.�� ����ϼ���.
       ��, ������ ���� ������ ������ ��� �Է� �޾� ���α׷��� �ݺ��ǵ��� �ϰ�, 
       ������ ��� �������Դϴ�. 5ȸ ���� ������ ���߼̽��ϴ�.���� ���� 
       �� ȸ ���� ������ ���߾����� ����ϵ��� �ۼ��ϼ���.
 */
	public void  test() {
		int r = (int)(Math.random()*100)+1;
		int num, count;
		Scanner sc = new Scanner(System.in);
		
		
		//for�� + break;
		for(count=1; ; count++ ) {
			System.out.print("������ �ϳ� �Է��ϼ��� => ");
			num = sc.nextInt();
			if(r==num) {
				break;
			}else if(r<num) {
				System.out.println("�Է����� �������� �۽��ϴ�.");
			}else {
				System.out.println("�Է��Ͻ� �������� Ů�ϴ�.");
			}
		}
		System.out.println(count+"ȸ ���� ���߼̽��ϴ�!");

//		while + continue
		count =1 ;
		while(true) {
			System.out.print("������ �ϳ� �Է��ϼ��� => ");
			num = sc.nextInt();
			if(r<num) {
				System.out.println("�Է��Ͻ� �������� �۽��ϴ�");
				count++;
				continue;
			}else if(r>num) {
				System.out.println("�Է��Ͻ� �������� Ů�ϴ�");
				count++;
				continue;
			}
			break;
		}
		System.out.println(count+"ȸ ���� ���߼̽��ϴ�!");
	}
}
