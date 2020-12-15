package kh.java.test.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * [����4]
- Ŭ���� : kh.java.test.array.Test4.java
 *
 */
public class Test4 {

	public static void main(String[] args) {
		new Test4().test1();
		new Test4().test2();
	}
/**
 * - �޼ҵ�� : public void test1()
    ������� ��ȭ��ȣ�� �Է¹ް�, 11�ڸ��� �������迭�� ��������,  ��� 4�ڸ��� *�� ������.  
    ��, ���� �迭���� ���� ���� �迭 ���纻���� �����ϼ���
     
        ��Ʈ) ������
       - for���̿� 1:1����
       - System.arraycopy() �żҵ� �̿�
       - clone() �żҵ� �̿�
 */
	public void test1() {
		String temp;
		char[] inputArr = new char[11];
		char[] outputArr;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȭ��ȣ11�ڸ��� �Է��ϼ��� : ");
		temp = sc.nextLine();
		
		for(int i=0;i<temp.length();i++) {
			inputArr[i]=temp.charAt(i);
		}
		
		outputArr = inputArr.clone();

		for(int i=3;i<7;i++) {
			outputArr[i]='*';
		}
		System.out.println("���� : "+Arrays.toString(inputArr));
		System.out.println("��¿� : "+Arrays.toString(outputArr));
		
		
	}
/**
 * - �޼ҵ�� : public void test2()
    �������� �迭������� ���ڿ������� ��� 4�ڸ��� ��ü�غ���.
    * java.lang.String.substring(beginIndex, endIndex) �޼ҵ� ã�ƺ���!
    * ���ڿ��� ���� ������ �Ұ��ϹǷ�, Ư���ڸ��� ���ڿ��� ������ ó���ؾ��Ѵ�.
 */
	public void test2() {
		String temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȭ��ȣ11�ڸ��� �Է��ϼ��� : ");
		temp = sc.nextLine();
		
		System.out.println(temp.substring(0,3)+"****"+temp.substring(7,11));
	}
}