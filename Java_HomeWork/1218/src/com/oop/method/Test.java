package com.oop.method;

public class Test {
	int a = 100;
	static int s = 99;
	int b=0;

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.test1();
		//100
		//99

		t1.test2();
		//100

		Test t3 = new Test();
		//t1.a=200, t3.a = 10 ���� ���� �����
		t1.test3(t3);
		//10
		System.out.println(t3.a);
		//10

		t1.test4(t1);
		//1000
	}
	
	//parameter ����
	public void test1() {
		int a = 1000; 
		int s = 999;
		System.out.println("----test1----");
		System.out.println(this.a); //100(this.a = ȣ���� Ŭ������ a�� = t.a)
		System.out.println(Test.s); //99(static ��)
	}
	
	//parameter����
	public void test2() {
		System.out.println("----test2----");
		Test t = new Test();
		t.a = 1000; //���� ������ Ŭ���� t�� a�� 1000
		System.out.println(a);//100(a=this.a�μ� ȣ���� Ŭ����(t1)�� field a��)
	}
	
	//call by reference method
	//main������ parameter  = t3
	public void test3(Test t) {
		System.out.println("----test3----");
		t.a = 10; //(call by reference�� �޼ҵ带 Ż���ص� ����� ���� ����)
				//���ڷ� Test t3�� ��� �Ǿ����Ƿ� t3.a = 10�� �ȴ�
		this.a = 200; // this.a = ȣ���� Ŭ������ a�� = t1.a = 200���� ����
		System.out.println(t.a);//10(t3.a)
	}
	
	//call by reference method
	//main������ parameter = t1
	public void test4(Test t) {
		System.out.println("----test4----");
		t.a = 1000;  //t.a = t1.a = (200 -> 1000) (call by reference�� �޼ҵ带 Ż���ص� ����� ���� ����)
		System.out.println(this.a);//1000(this.a = ȣ���� Ŭ������ a�� = t1.a)
	}
}