package com.kh.function;

import java.util.Scanner;



public class Example {
/*
 * //[���� 1]
//		 - �޼ҵ�� : public void opSample1(){}
//		 - ���� ���� : 
//		    ����(����), ����(����), ����(����), ����(����), ���(�Ǽ�) ���� �����ϰ�,
//		    �� ������ Ű����� �Է¹ް�,
//		    �հ�(����+����+����)�� ���(�հ�/3.0)�� ����ϰ�,
//		    �� ������ ������ ����� ������ "�հ�" ���
//		    �հ��� ���� : �� ������ ������ ���� 40���̻��̸鼭,
//		                ����� 60�� �̻��̸� �հ�, 
//		                �ƴϸ� "���հ�" ���
//		     
//		@com.kh.function.Example
 */
	public void opSample1() {
		int kor, eng, math, sum;
		double avg;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		kor = input.nextInt();
		
		System.out.print("���� ���� : ");
		eng = input.nextInt();
		
		System.out.print("���� ���� : ");
		math = input.nextInt();
		
		sum = kor + eng + math;
		avg = sum/3.0;
		
		System.out.println(kor>=40 && eng>=40 && math>=40 && avg >= 60 ? "�հ�" : "���հ�");
		System.out.println("���� : " + sum + ", ��� : " + avg);
		
		
	}
	
	/*
	 * //		[���� 2]
//		 - �޼ҵ�� : public void opSample2(){}
//		 - ���� ���� : 
//		    ���� �����ϰ�, Ű����� �Է¹��� ������ ������ ����ϰ�
//		    �������� ȭ�鿡 ��� Ȯ����
//		    ������ 'M'�̸� ���л�, 'M'�� �ƴϸ� ���л����� ���ó����
//		    => ���� ������ �Է¹��� 
//		    �л��̸� (���ڿ�)
//		    �г� (����)
//		    �� (����)
//		    ��ȣ (����)
//		    ����(M/F) (����)    //���ڿ��� �Է¹��� ��, �����ϳ� �и��ؾ� ��
//		    ���� (�Ǽ�)         //�Ҽ��� �Ʒ� ��°�ڸ����� �Է¹���
//		 - ��� ��
//		    3�г� 2�� 24�� ���л� ȫ�浿�� ������ 95.55�̴�.
	 */
	public void opSample2() {
		Scanner input = new Scanner(System.in);
		String name;
		int grade;
		int roomNum;
		int classNum;
		char sex;
		double score;
		
		System.out.print("�л� �̸� : ");
		name = input.nextLine();
		
		System.out.print("�г� : ");
		grade = input.nextInt();
		
		System.out.print("�� : ");
		roomNum = input.nextInt();
		
		System.out.print("��ȣ  : ");
		classNum = input.nextInt();
		input.nextLine();
		
		System.out.print("���� (Male/Female) : ");
		sex = input.nextLine().charAt(0);
				
		System.out.print("���� : ");
		score = input.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� ",grade,roomNum,classNum);
		System.out.printf(sex=='M' ? "���л� " : "���л� ",sex);
		System.out.printf("%s�� ������ %.2f�̴�.",name,score);
	}
	
	
}