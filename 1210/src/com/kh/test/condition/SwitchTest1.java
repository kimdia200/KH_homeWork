package com.kh.test.condition;

import java.util.Scanner;

/**
 * �������� ���ϴ� ���α׷��� �ۼ��ϼ���. 
����ڿ��� ���뵵�� ����뷮�� �Է¹ް�, �̿����� �������� ����� ����ϼ���.(switch�� ����� ��.)
* �����: �뵵�� ����(1liter)  * ��뷮
* ������: ������� 5%
* �ѻ����: ����� + ������
* ���뵵�޴����� 1,2,3���ܸ̿� ���ýÿ��� "�޴���ȣ�� 1,2,3�� �����մϴ�."�� ����ϰ�, ���α׷��� ������ �� �մϴ�.
������Է¿���)
        ----------menu----------
        1. ������ (50��/liter)
        2. ����� (45��/liter)
        3. ������ (30��/liter)
        -------------------------
        �޴���ȣ�� �����ϼ���. ==> 2
        �� ��뷮�� �Է��ϼ���. ==> 250
��¿���)
        ----------<<������>>-----------
        ���ø޴���ȣ :  2. �����(���ҿ��� ����Ͻ� ���)�� �����ϼ̽��ϴ�. 
        ����� : 11250
        ������ : 562
        �Ѽ������ : 11812��
 *
 */
public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 t1 = new SwitchTest1();
		t1.test();
	}
	public void test() {
		int select, num, per=0, charge=0,tax=0;
		Scanner sc = new Scanner(System.in);
		System.out.print(
				"----------menu----------\n"+
				"1. ������ (50��/liter)\n"+
				"2. ����� (45��/liter)\n"+
				"3. ������ (30��/liter)\n"+
				"-------------------------\n"+
				"�޴���ȣ�� �����ϼ���. ==> ");
		select = sc.nextInt();
		if(select < 1 || select > 3) {
			System.out.println("�޴���ȣ�� 1,2,3�� �����մϴ�.");
			return;
		}
		System.out.print("�� ��뷮�� �Է��ϼ���. ==> ");
		num = sc.nextInt();
		System.out.println("----------<<������>>-----------");
		switch(select) {
		case 1 : 
			per = 50;
			System.out.println("���ø޴���ȣ :  1. ������(50��/liter)�� �����ϼ̽��ϴ�.");
			break;
		case 2 : 
			per = 45;
			System.out.println("���ø޴���ȣ : 2. �����(45��/liter)�� �����ϼ̽��ϴ�.");
			break;
		case 3 : 
			per = 30;
			System.out.println("���ø޴���ȣ : 3. ������(30��/liter)�� �����ϼ̽��ϴ�.");
			break;
		}

		System.out.print("����� : "+ (charge+=num*per)
					+ "\n������ : " + (tax+=charge*0.05)
					+"\n�� ������� : " +(charge+tax));
		
	}
	
	

}
