package com.kh.test.condition;

import java.util.Scanner;

/**
 * - Ŭ���� : com.kh.test.condition.Test8.java
- �޼ҵ�� : public void test()
    **********��  ��*********
       1. ������ ----------------1000
       2. ��� ------------------ 2000
       3. ���� ------------------ 1000
       4. ���� ------------------ 2000
       5. Ƣ�� ------------------ 3000
       6. ��Ƣ�� ---------------- 8000
    *************************
     �޴���ȣ �Է� : ����ȣ�Է¡�
    ������ ���ý� �������̴� 1000���Դϴ�.�� ���
    ��� ���ý� ������� 2000���Դϴ�.�� ���
    ���� ���ý� �������� 1000���Դϴ�.�� ���
    ���� ���ý� ������� 2000���Դϴ�.�� ���
    Ƣ�� ���ý� ��Ƣ���� 3000���Դϴ�.�� ���
    ��Ƣ�� ���ý� ����Ƣ���� 8000���Դϴ�.�����
    �ٸ����ڿ� �Է½� ����ȣ�� �߸� �ԷµǾ����ϴ�. ������ �����մϴ�.��
 * @author family
 *
 */
public class Test8 {

	public static void main(String[] args) {
		Test8 t8 = new Test8();
		t8.test();
	}
	
	public void test() {
		int num;
		String menu = 
			    "**********��  ��*********\n"+
			       "1. ������ ----------------1000\n"+
			      "2. ��� ------------------ 2000\n"+
			       "3. ���� ------------------ 1000\n"+
			       "4. ���� ------------------ 2000\n"+
			       "5. Ƣ�� ------------------ 3000\n"+
			       "6. ��Ƣ�� ---------------- 8000\n"+
			    "*************************";
		System.out.println(menu);
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴���ȣ �Է� : ");
		num = sc.nextInt();
		
		switch(num) {
		case 1 : System.out.println("�����̴� 1000���Դϴ�.");break;
		case 2 : System.out.println("����� 2000���Դϴ�.");break;
		case 3 : System.out.println("������ 1000���Դϴ�.");break;
		case 4 : System.out.println("����� 2000���Դϴ�.");break;
		case 5 : System.out.println("Ƣ���� 3000���Դϴ�.");break;
		case 6 : System.out.println("��Ƣ���� 8000���Դϴ�.");break;
		default : System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. ������ �����մϴ�.");
		}
	}

}
