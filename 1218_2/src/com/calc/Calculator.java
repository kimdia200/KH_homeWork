package com.calc;

/**
 * ���� main�� argument�� 1�ڸ� ������(1���� 9������) ���� 2�� �Է¹޾� 4Ģ���� ����� ����Ѵ� �Է°��� ��� int������
 * ó���Ѵ�
 * 
 * @author kimYS
 *
 */
public class Calculator {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		if ((a >= 1 && a <= 9) && (b >= 1 && b <= 9)) {
			System.out.println("����1 : " + a + ", ����2 : " + b);
			// ��
			System.out.println("�� : " + a + "+" + b + "=" + (a + b));
			// ��
			System.out.println("�� : " + a + "-" + b + "=" + (a - b));
			// ��
			System.out.println("�� : " + a + "*" + b + "=" + (a * b));
			// ������ (��, ������ ��(�и�)�� 0�̰ų� 0���� ������ ����� 0ó���Ѵ�)
			if (b <= 0) {
				System.out.println("������ : 0(�и� " + b + "��)");
			} else {
				System.out.println("������ : " + a + "/" + b + "=" + (a / b));
			}
		}else {
			System.out.println("������ �Է� ������ �߸� �Ǿ����ϴ�.");
			return;
		}
	}
}
