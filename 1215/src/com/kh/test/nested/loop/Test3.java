package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		new Test3().test();
	}
	/**
	 * 
	 * �����ϳ� �Է¹޾�, �� ���� ����϶��� �Էµ� 
    ���� �� ���� �����Ͽ� ������ ���� ��µǰ� �ϴ� 
    ���α׷��� ������.
        ��¿�)
      ���� �Է� : 5
    
         *
         **
         ***
         ****
         *****
          ****
           ***
            **
             *

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
		
		for(int i=0; i<temp*2-1;i++) {
			for(int j=0; j<temp;j++) {
				if(i<temp && j<=i) {
					System.out.print("*");
				}
				else if(i>=temp && j<=i-temp) {
					System.out.print(" ");
				}else if(i>=temp)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}