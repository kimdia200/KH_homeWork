package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		new Test2().test();
	}
	/**
	 * �޼ҵ��: public void test()
    �����ϳ� �Է¹޾�, �� ���� ����϶��� �Էµ� ����  ����� �����Ͽ� ������ ���� ��µǰ� �ϴ� ���α׷��� ������.
    
    ��¿�)
    ���� �Է� : 5
    *****
    ****
    ***
    **
    *
    ��¿�)
    ���� �Է� : 0
    ����� �ƴմϴ�.
	 */
	public void test() {
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		while(true) {
			temp = sc.nextInt();
			if(temp>0) break;
			System.out.print("�ٽ� ������ �ϳ� �Է��ϼ��� : ");
		}
		
		for(int i=0; i<temp;i++) {
			for(int j=0; j<temp-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
