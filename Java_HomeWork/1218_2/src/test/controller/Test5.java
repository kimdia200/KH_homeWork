package test.controller;

import java.util.Scanner;

/**
 * Ű����� 2���� ������ �����͸� �Է� �޾�, 
 * �� ���� ��� 1���� 9������ ���� ���� �� �� �� ���� ���ڸ� ������ ���ڸ� �������� ����Ѵ�
 * 
 * ex)
 * �Է� ��1 : 2 3
 * ���ڸ� ���Դϴ�.
 * �Է� ��2 : 4 5
 * @author kimYS
 *
 */
public class Test5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.print("������ �ΰ� �Է��ϼ���(1~9) : ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		if((a>=1 && a<=9) && (b>=1 && b<=9))
			if(a*b>=10)
				System.out.println((a*b)+"�� ���ڸ� �� �Դϴ�.");
			else 
				System.out.println((a*b)+"�� ���ڸ� �� �Դϴ�.");
		else
			System.out.println("�ùٸ� ������ �ƴմϴ�.");
		
	}

}
