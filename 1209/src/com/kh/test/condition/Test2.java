package com.kh.test.condition;

import java.util.Scanner;

/**
 * - �޼ҵ�� : public void test()
    ����(int), ����(int), ����(int) ������ ���������� �Է� �޾� 
    ����(int)�� ���(double)�� ����ϰ� 
    �� ������ ������ ����� ������ �հݿ��� ó��, 
    �� ���� ������ ���� 40�� �̻��̸鼭, ����� 60�� �̻��̸� �հ�,
    �ƴϸ� ���հ��� ����ϴ� ���α׷��� �ۼ��ϼ���. 
 * @author family
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.test();
	}
	
	public void test() {
		int kor, eng, math;
		int sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� : ");
		math = sc.nextInt();
		
		sum = kor+eng+math;
		avg = sum/3.0;
		
		System.out.println("���� : "+sum + ", ���� : "+avg);
		
		if(kor>=40 && eng>=40 && math>=40 && avg>=60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
	}
}
