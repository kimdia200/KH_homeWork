package com.kh.test.loop;

import java.util.Scanner;

/**
 * [���� 1]
- Ŭ���� : com.kh.test.loop.Test1.java
- �޼ҵ�� : public void test()
    1���� ����ڷκ��� �Է� ���� �������� �����ϴ� ¦���� ���� ����ϼ���. 
    (for�� Ȱ��) - > while������ ����

 */
public class Test1 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		t1.test();
		
	}
	
	public void test() {
		int temp, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		temp = sc.nextInt();
		
		int i =0;
		while(++i<=temp) {
			if(i%2 == 0 )
				sum+=i;
		}
		System.out.println("1 ~ " + temp + " ���� �����ϴ� ¦���� �� = " + sum);
	}

}
