package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test2();
	}
	
	/**
	 *   - �޼ҵ�� : public void test1()
    	1) ���� �� ���� �Է� �޾�, 1���� �Է� ���� ���������� Ȧ���� ���� ����ϼ���.
	 */
	public void test1() {
		int sum=1;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Ѱ��� �Է��ϼ��� : ");
		num = sc.nextInt();
		for(int i = 1;i<=num;i++) {
			if(i%2==0) {
				continue;
			}
			sum*=i;
		}
		
		//while�� 
//		int i = 0;
//		while(++i<=num) {
//			if(i%2==0) {
//				continue;
//			}
//			sum*=i;
//		}
		System.out.print("1 ~ "+num+" ������ Ȧ���� �� : "+sum);
	}
/**
 * - �޼ҵ�� : public void test2()
    2) ����ڷκ��� ������ �ΰ� �Է� �޾Ƽ�, ���� �������� ū �������� Ȧ���� ���� ���ϼ���.
        Tip. ū��/�������� �ش��ϴ� ������ ����� ��.
     
        ���:
        ������ �ϳ� �Է��ϼ���. => 100
        �ٸ� ������ �ϳ� �Է��ϼ���. => 1
        ====================
        1���� 100������ Ȧ���� ���� 2500�Դϴ�
 */
	public void test2() {
		int big, small, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ��� => ");
		big = sc.nextInt();
		System.out.print("�ٸ� ������ �ϳ� �Է��ϼ��� => ");
		small = sc.nextInt();
		
		if(big<small) {
			int temp = big;
			big = small;
			small = temp;
		}
		
		//for��
		for(int i = small ; i<=big; i++) {
			if(i%2==0)
				continue;
			sum+=i;
		}
		//while��
//		int i = small-1;
//		while(++i<=big) {
//			if(i%2==0)
//				continue;
//			sum+=i;
//		}
		
		
		System.out.println("=====================");
		System.out.println(small+"���� "+big+"������ Ȧ���� ���� " + sum + "�Դϴ�.");
	}
}
