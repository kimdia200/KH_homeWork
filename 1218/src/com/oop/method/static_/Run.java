package com.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		//1
		String a = "abcdef";
		System.out.println("���� String �� : "+a);
		System.out.println();
		
		//2
		a=StaticMethod.toUpper(a);
		System.out.println("upper������ String �� : "+a);
		System.out.println();
		
		//3
		System.out.println("���� String �� ���ĺ��� ���� : "+StaticMethod.getAlphabetLength(a));
		System.out.println("setchar("+a+", 1, '2')�޼ҵ� ����");
		a=StaticMethod.setChar(a, 1, '2');
//		StaticMethod.setChar(a, 1, '2'); //String �� immutable class�� ���� ���� ���� �� �� ����....
										//�׷��� return �ִ� �޼ҵ�� ���� ó����
		System.out.println("setChar���� : "+a);
		System.out.println();
		
		//4
		System.out.println("���� �� String �� ���ĺ��� �������ĺ��� ���� : "+StaticMethod.getAlphabetLength(a));
		
	}

}
