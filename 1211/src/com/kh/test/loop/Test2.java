package com.kh.test.loop;

import java.util.Scanner;

/**
 * [���� 2]
- Ŭ���� : com.kh.test.loop.Test2.java
- �޼ҵ�� : public void test()
    ������ �Է� �޾� 1���� �Է� ���� �������� ���� 
    Ȧ���� ¦���� ������ Ȧ���� ������, ¦���� ���ڡ��� 
    ��� �ϼ���.
  
    ��) 4�Է� : ���ڼ��� / 5�Է� : ���ڼ��ڼ� ���
 * @author family
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
	public void test() {
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
//		for(int i=1 ; i<=temp;i++) {
//			if(i%2==0)
//				System.out.print("��");
//			else
//				System.out.print("��");
//		}
//		
		int i =0;
		while(++i<=temp) {
			if(i%2==0)
				System.out.print("��");
			else
				System.out.print("��");
		}
	}

}
