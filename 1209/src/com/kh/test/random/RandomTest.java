package com.kh.test.random;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		
		RandomTest rt = new RandomTest();
		rt.game();
		
	}
	public void game() {
		Scanner sc = new Scanner(System.in);
		int temp;
		int random = (int)(Math.random()*3)+1;
		
		System.out.println("=== ���� ���� �� ���� ===");
		System.out.print("���ڸ� �����ϼ��� (1.���� / 2.����/ 3.��) : ");
		temp = sc.nextInt();
		
		System.out.println("========= ��� =========");
		if(temp == 1 ) {
			System.out.println("����� ������ �½��ϴ�.");
		}else if(temp == 2) {
			System.out.println("����� ������ �½��ϴ�.");
		}else if(temp == 3) {
			System.out.println("����� ���� �½��ϴ�.");
		}
		if(random == 1 ) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		}else if(random == 2) {
			System.out.println("��ǻ�ʹ� ������ �½��ϴ�.");
		}else if(random == 3) {
			System.out.println("��ǻ�ʹ� ���� �½��ϴ�.");
		}
		System.out.println("======================");
		
		//�������
		if(temp == random) {
			System.out.println("�����ϴ�.");
		}
		//�̰�����
		if((temp==1&&random==3)||(temp==2&&random==1)||(temp==3&&random==2)) {
			System.out.println("����� �¸��Դϴ�~~~~~~!");
		}
		//������ 12 23 31
		if((temp==1&&random==2)||(temp==2&&random==3)||(temp==3&&random==1)) {
			System.out.println("����� �й��Դϴ� ��������");
		}
		
	}

}
