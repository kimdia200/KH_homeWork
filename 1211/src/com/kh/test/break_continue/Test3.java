package com.kh.test.break_continue;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 t3 = new Test3();
		t3.test();
	}
	
	
/**
- �޼ҵ�� : public void test()
2���� ū ������ �Է� �ް�, �Է� ���� ������ �Ҽ��̸� ���Ҽ��١�, �Ҽ��� �ƴϸ� ���Ҽ��� �ƴϴ�.�� ����ϰ� ���α׷��� �����ϴ� �ڵ带 �ۼ��ϼ���.
��, �Է� ���� ������ 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.�� ��� �� �ٽ� ������ �Է� �޵��� �ϼ���.
?
** �Ҽ���? : ��� ������ 1���� �ڱ� �ڽű����� �������� ��, ������ �������� ���� 1�� �ڱ� �ڽ� ���� ���� �Ҽ���� �Ѵ�.
*/
	public void test() {
		Scanner sc = new Scanner(System.in);
		int num;
		int a=0;
		//do~while��
		do {
			System.out.println("========�Ҽ��ǵ���========");
			System.out.print("2����ū ������ �Է��ϼ���! => ");
			num = sc.nextInt();
			if(num<2) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���");
				continue;
			}
			//for��
			for(int i = 2 ; i<num ; i++) {
				if(num%i != 0) {
					continue;
				}else {
					a++;
					break;
				}
			}
			//while��
//			int i =1;
//			while(++i<num) {
//				if(num%i != 0) {
//					continue;
//				}else {
//					a++;
//					break;
//				}
//			}
			break;
		}while(true);
		if(a==0)
			System.out.println("���� "+num +"�� �Ҽ� �Դϴ�");
		else
			System.out.println("���� "+num +"�� �Ҽ��� �ƴմϴ�.");
		
	}

}
