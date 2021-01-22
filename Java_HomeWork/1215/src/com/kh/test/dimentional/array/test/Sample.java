package com.kh.test.dimentional.array.test;

public class Sample {

	public static void main(String[] args) {
		new Sample().exercise1();
	}
/**
 * [���� 1]
 - �޼ҵ�� : public void exercise1()
 - �������� : 
    1. 3��¥��5�� 2�����迭 ���� �� ����
    2. 1~100������ ������ ������ ��� �濡 �����
    3. �� �ະ ���� �հ谡 5�� ����� �࿭���� �����
 */
	
	//����� ������
	public void exercise1() {
		int[][] arr = new int[3][5];
		int[] sum = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(int)(Math.random()*100)+1;
				sum[i] += arr[i][j];
			}
		}
		//������ �����ֱ�
		System.out.println("������");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				//���ڸ� ������������ �̻ڰ� �����ַ��� �ۼ�
				if(arr[i][j]>=10)
					System.out.print("["+arr[i][j]+"]");
				else 
					System.out.print("[ "+arr[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		//�����ذ� �ѵ� �� �����ֱ�
		System.out.println("���� �ذ�� ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(sum[i]%5!=0) {
					System.out.print("[  ]");
					continue;
				}				
				else if(sum[i]%5==0&&arr[i][j]>=10)
					System.out.print("["+arr[i][j]+"]");
				else //���ڸ� ������������ �̻ڰ� �����ַ��� �ۼ�
					System.out.print("[ "+arr[i][j]+"]");
			}
			System.out.println(" ==> sum : "+sum[i] );
		}
	}
	
	//�̰� �߸� �����ؼ� 5�� ����� �����....
	public void exercise0() {
		int[][] arr = new int[3][5];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(int)(Math.random()*100)+1;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==0)
					continue;
				else if(arr[i][j]%5!=0)
					System.out.print("[  ]");
				else if(arr[i][j]>=10)
					System.out.print("["+arr[i][j]+"]");
				else 
					//5���������� �̻ڰ� �����ַ��� �ۼ�
					System.out.print("[ "+arr[i][j]+"]");
			}
			System.out.println();
		}
	}
	
	

}
