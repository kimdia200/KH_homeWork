package com.oop.method.nonstatic;

public class Test {

	public static void main(String[] args) {
		NonStaticSample s = new NonStaticSample();
		
//		�ζǹ�ȣ 6�� ������ִ� �޼ҵ� �۵�!
		s.printLottoNumbers();
		System.out.println();
		
		//�Է¸� ���ڸ�ŭ �Է��� ���ڿ��� ������ִ� �޼ҵ� �۵�!
		s.outPutChar(5, 'A');
		System.out.println();

		//������ ���ĺ��� �����ؼ� �����ϴ� �޼ҵ� �۵�!
		System.out.println("�������ĺ� : "+s.alphabet());
		System.out.println();
		
		//mySubString �޼ҵ� �۵�!
		System.out.println(s.mySubString("������", 0, 2));
	}

}