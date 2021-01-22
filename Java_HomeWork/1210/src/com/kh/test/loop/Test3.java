package com.kh.test.loop;

import java.util.Scanner;

/**
 * [���� 3]
- Ŭ���� : com.kh.test.loop.Test3.java
- �޼ҵ�� : public void test()
    ������ �Է� �޾� �Էµ� ���� ������ ���α׷��� ��������.  
 
    ��) 5�Է� 
        5X1=5
        5X2=10
        5X3=15
         .
         .
        5X9=45
    ��, 1~9������ �����ϰ� �̿ܿ� ���� ������ ���߸��Է��ϼ̽��ϴ�. ���α׷������մϴ١����
 */
public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	public void test() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ����ұ��? (1~9���� ����) : ");
		int temp = sc.nextInt();
		if(!(temp>=1 && temp<=9)){
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		
		for(int i = 1; i<10; i++) {
			System.out.println(temp + "X"+i +" = "+(temp*i));
		}
	}
}