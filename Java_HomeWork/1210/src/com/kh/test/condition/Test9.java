package com.kh.test.condition;

import java.util.Scanner;

/**
 * - �޼ҵ�� : public void test()
    
       *********�ָ޴�*********
       a. �Ұ����� ------------5000
       b. ������� --------------4000
       c. ġŲ���� --------------4500
       d. �ѿ���� -------------10000
       e. ����� ----------------7000
       ***********************  
       
       *******���̵�޴�********
        1. �ݶ� -------------------1500
        2. ���̴� -----------------1500
        3. ��ũ����ũ-------------2500
        4. �����------------------3000
        ***********************
       �θ޴��� ������� �����ϰ�, ���� ����ڼ��ù�ȣ�� ��������.
    ��) �ָ޴����� a, ������ ���̵�޴����� 4 ���ý�
    ���Ұ�����, ������� �� 8000���Դϴ١����.
    
    ���޴����ý� �ٸ����ڸ�  �Է��ϸ� ����ȣ�� �߸� �����̽��ϴ�. ������ �����մϴ�.��
 */
public class Test9 {

	public static void main(String[] args) {
		Test9 t9 = new Test9();
		t9.test();
	}
	public void test() {
		char ch;
		int num, sum=0;
		Scanner sc = new Scanner(System.in);
		String menu =
				"*********�ָ޴�*********\n"+
				"a. �Ұ����� ------------5000\n"+
				"b. ������� --------------4000\n"+
				"c. ġŲ���� --------------4500\n"+
				"d. �ѿ���� -------------10000\n"+
				"e. ����� ----------------7000\n"+
				"***********************";
		System.out.println(menu);
		
		System.out.print("�ָ޴��� �Է��ϼ��� : ");
		ch = sc.nextLine().charAt(0);
		menu = 
				"*******���̵�޴�********\n"+
				"1. �ݶ� -------------------1500\n"+
				"2. ���̴� -----------------1500\n"+
				"3. ��ũ����ũ-------------2500\n"+
				"4. �����------------------3000\n"+
				"***********************";
		System.out.println(menu);
		System.out.print("�帵ũ�� �Է��ϼ��� : ");
		num = sc.nextInt();
		if(ch<'a'||ch>'e'||num<1||num>4) {
			System.out.println("��ȣ�� �߸� �����̽��ϴ�. ������ �����մϴ�.");
			return;
		}
		
		switch(ch) {
		case 'a' :
			System.out.print("�Ұ�����, ");
			sum+=5000;
			break;
		case 'b' :
			System.out.print("�������, ");
			sum+=4000;
			break;
		case 'c' :
			System.out.print("ġŲ����, ");
			sum+=4500;
			break;
		case 'd' :
			System.out.print("�ѿ����, ");
			sum+=10000;
			break;
		case 'e' :
			System.out.print("�����, ");
			sum+=7000;
			break;
		}
		
		switch(num) {
		case 1 :
			sum+=1500;
			System.out.println("�ݶ�� �� "+sum+"�� �Դϴ�.!");
			break;
		case 2:
			sum+=1500;
			System.out.println("���̴ٴ� �� "+sum+"�� �Դϴ�.!");
			break;
		case 3 :
			sum+=2500;
			System.out.println("��ũ����ũ�� �� "+sum+"�� �Դϴ�.!");
			break;
		case 4 :
			sum+=3000;
			System.out.println("������� �� "+sum+"�� �Դϴ�.!");
			break;
		}
	}

}
