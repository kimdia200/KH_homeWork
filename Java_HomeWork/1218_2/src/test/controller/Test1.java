package test.controller;

import java.util.Scanner;

/**
 * �Է� : 3
 * ��� : 2�� ����� �ƴմϴ�
 * 
 * �Է� : 80
 * ��� : 2�� ����Դϴ�
 * @author kimYS
 *
 */
public class Test1 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		
		num=sc.nextInt();
		
		if(num%2==0)
			System.out.println("2�� ��� �Դϴ�.");
		else
			System.out.println("2�� ����� �ƴմϴ�.");
	}

}
