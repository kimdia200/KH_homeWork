package kh.java.test.array;

import java.util.Scanner;

/**
 * [����3]
- Ŭ���� : kh.java.test.array.Test3.java
- �޼ҵ�� : public void test()
    ���ڿ��� �ϳ� �Է� �޾� ���ڹ迭�� �ְ� �˻��� ���ڸ� �ϳ� �Է� �޾� �˻� ���ڰ� ���ڿ��� �� ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
    
    ��) �Է°� : helloworld
    �˻��� :��
    ��� : �Է��Ͻ� ���ڿ� helloworld���� ã���ô� ���� l�� 3�� �Դϴ�.
 *
 */
public class Test3 {
	public static void main(String[] args) {
		
		String input1;
		char input2;
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է°� : ");
		
		input1 = sc.nextLine();
		
		char[] arr = new char[input1.length()];
		
		for(int i = 0 ; i<arr.length;i++) {
			arr[i] = input1.charAt(i);
		}
		
		System.out.print("�˻��� : ");
		input2 = sc.nextLine().charAt(0);
		
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i]==input2)
				count++;
		}
		System.out.println("�Է��Ͻ� ���ڿ� "+input1+"���� ã���ô� ���� " + input2 +"�� "+ count+"�� �Դϴ�.");
		
		
	}
}