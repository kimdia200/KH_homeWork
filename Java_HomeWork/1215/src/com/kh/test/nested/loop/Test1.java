package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		new Test1().test();
		
	}
/**
 *     �����ϳ� �Է¹޾�, �� ���� ����϶��� �Էµ� 
    ���� �� ���� �����Ͽ� ������ ���� ��µǰ� �ϴ� ���α׷��� ������.
    ��¿�)
    ���� �ϳ� �Է� : 5
    1
    12
    123
    1234
    12345
    ��¿�)
    ���� �ϳ� �Է� : -5
    ����� �ƴմϴ�
 */
	public void test() {
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		while(true) {
			temp = sc.nextInt();
			if(temp>0) break;
			System.out.print("�ٽ� ������ �ϳ� �Է��ϼ��� : ");
		}
		
		for(int i=0; i<temp;i++) {
			for(int j=0; j<temp;j++) {
				System.out.print(j+1);
				if(i==j) break;
			}
			System.out.println();
		}
		
	}
}