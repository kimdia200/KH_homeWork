package com.kh.test.loop;

import java.util.Scanner;

/**
 * [���� 4]
- Ŭ���� : com.kh.test.loop.Test4.java
- �޼ҵ�� : public void test()
(���ڿ��� ���̸� �����ϴ� String�� �޼ҵ带 api���� ã�� ����� ��)
    ���ڿ��� ���ڿ����� �˻��� ���ڸ� �Է� �޾� �� 
    �ڿ��� �� ���ڰ� �� ���̾����� ������ Ȯ���ϴ� 
    ���α׷��� �ۼ��ϼ���. 
    ��, �˻��� ���ڰ� �����ڰ� �ƴϸ� "�����ڰ� �ƴմϴ�." �����
    ���α׷��� �����ϼ���. 
    
    ��� ��)
    ���ڿ� �Է� : application
    �˻��� ���� �Է� : p
    'p'�� ���Ե� ���� : 2 ��
    
    
    ���ڿ� �Է� : apple_test123
    ���� �Է� : ��
    �����ڰ� �ƴմϴ�.

 *
 */
public class Test4 {

	public static void main(String[] args) {
		Test4 t4 = new Test4();
		t4.test();
	}
	public void test() {
		String temp;
		char ch;
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է� : ");
		temp = sc.nextLine().toLowerCase();
		System.out.print("�˻��� ���� �Է� : ");
		ch = sc.nextLine().toLowerCase().charAt(0);
		
		if(ch>='a'&&ch<='z') {
			
			int i = (-1);
			while(++i<temp.length()) {
				if(temp.charAt(i)==ch)
					count++;
			}
			System.out.println("'"+ch+"' �����Ե� ���� : "+ count);
			
		}else {
			System.out.println("�����ڰ� �ƴմϴ�.");
			return;
		}
		
		
		
	}

}
