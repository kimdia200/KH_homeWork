package com.kh.test.condition;

import java.util.Scanner;

/**
 * - �޼ҵ�� : public void test()
    Ű(cm)�� ������(kg)�� �Է� �ް�, 
   BMI(ü��������)�� ����Ͽ� ���� ���� ���� 
   ��ü��(18.5�̸�), ����ü��(18.5�̻� 23�̸�), ��ü��(23�̻� 25�̸�), ��(25�̻� 30�̸�), ����(30�̻�)�� ����ϼ���. 
   BMI ���� = ü��(kg) / (����(m) * ����(m) ) 
   ��) BMI = 67 / (1.7 * 1.7)
 * @author family
 *
 */
public class Test5 {

	public static void main(String[] args) {

		Test5 t5 = new Test5();
		t5.test();
		
	}
	public void test(){
		
		double height, weight;
		double bmi;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(cm)�� �Է��ϼ��� : ");
		height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��ϼ��� : ");
		weight = sc.nextDouble();
		
		bmi = weight / ((height/100) * (height/100));
		
		if(bmi<18.5) {
			System.out.println("��ü�� (18.5�̸�)");
		}else if(bmi<23) {
			System.out.println("����ü�� (18.5�̻� 23�̸�)");
		}else if(bmi<25) {
			System.out.println("��ü�� (23�̻� 25�̸�)");
		}else if(bmi<30) {
			System.out.println("�� (25�̻� 30�̸�)");
		}else {
			System.out.println("����(30�̻�)");
		}
		
	}

}
