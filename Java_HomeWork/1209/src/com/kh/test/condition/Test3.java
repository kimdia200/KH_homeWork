package com.kh.test.condition;

import java.util.Scanner;

/**
 * - �޼ҵ�� : public void test()
    ���� �ΰ��� �Է� �ް�, ������(+,-,*,/)�� �Է¹��� ���� ����� ��  ����� ����ϴ� ���� ���α׷��� ��������.      
    ��� ��) �Է� 5, 6, +
           5+6=11
    ������ �Էµǰų� +,-,*,/ �̿��� ���ڰ� �ԷµǸ� ���߸� �Է� �ϼ̽��ϴ�.  ���α׷��� �����մϴ�.�� ��� ������ ��µǰ� �ϼ���.

 * @author family
 *
 */
public class Test3 {
	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	public void test() {
		int a, b;
		char c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ΰ��� �Է��ϼ��� : ");
		a = sc.nextInt();
		b = sc.nextInt();

		
		System.out.print("�����ڸ� �Է��ϼ��� (+, -, *, /) : ");
		c= sc.next().charAt(0);
		
		if(a<0 || b<0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.(�����Է�)");
		}else if(c=='+') {
			System.out.println(a + " + " + b + " = " + (a+b));
		}else if(c=='-') {
			System.out.println(a + " - " + b + " = " + (a-b));
		}else if(c=='*') {
			System.out.println(a + " * " + b + " = " + (a*b));
		}else if(c=='/') {
			System.out.println(a + " / " + b + " = " + (a/b));
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.(�߸��� �������Է�)");
		}
	}
}
