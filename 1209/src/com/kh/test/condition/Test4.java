package com.kh.test.condition;

import java.util.Scanner;

/**
 * - �޼ҵ�� : public void test()
   1~10 ������ ���� �Ѱ��� �Է¹޾�  Ȧ������ 
    ¦������ Ȯ���ϰ�, Ȧ���� ��Ȧ����.��, ¦���� 
   ��¦����.����� �ϼ���. 
   ��, 1~10������ ������ �ƴ� ��� �� �ݵ�� 1~10������ ������ �Է��ؾ� �մϴ�.���� ����ϼ���.

 * @author family
 *
 */
public class Test4 {
	
	public static void main(String[] args) {
		
		Test4 t4 = new Test4();
		t4.test();
		
	}
	public void test() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 ������ ���� �Ѱ��� �Է��ϼ��� : ");
		num = sc.nextInt();
		if(num<1 || num>10) {
			System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
		}else if(num%2 == 0) {
			System.out.println("¦����");
		}else {
			System.out.println("Ȧ����");
		}
	}

}
