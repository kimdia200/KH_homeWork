package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

/**
 * * ����� Ŭ���� : com.oop.emp.run.EmpTest
�޴��ۼ� : �޼ҵ� �ۼ�
=>�޴� ȭ���� ��
public void mainMenu(){}
******* ��� ���� ���� ���α׷� ************
    1. �� ��� ���� �Է�  => empInput() �޼ҵ� ����
    2. ��� ���� ���� => ���������� null������  ��.
    3. ������� ��� =>  empOutput() �޼ҵ� ����
    9. ������
********************************************

 * @author family
 *
 */
public class EmpTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		Employee e = null;

		while(true) {
			System.out.println("************* ��� ���� ���� ���α׷� ************");
			System.out.println("1. �� ��� ���� �Է�  => empInput() �޼ҵ� ����");
			System.out.println("2. ��� ���� ���� => ���������� null������  ��.");
			System.out.println("3. ������� ��� =>  empOutput() �޼ҵ� ����");
			System.out.println("9. ������");
			System.out.println("********************************************");
			System.out.print("�޴� ��ȣ �Է� : ");
			
			input = sc.nextInt();
			
			if(input==1) {
				e=new Employee();
				e.empInput();
				continue;
			}else if(input ==2) {
				if(e==null) System.out.println("���� ������ �����ϴ�.");
				else e=null;
				continue;
			}else if(input ==3) {
				if(e == null) System.out.println("����� ������ �����ϴ�.");
				else e.empOutPut();
				continue;
			}else if(input ==9) {
				System.out.println(".���α׷� ����.");
				break;
			}
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

}