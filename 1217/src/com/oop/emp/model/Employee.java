package com.oop.emp.model;

import java.util.Scanner;

/**
 * 
 * @author ������ - ������� ������ Ŭ���� - Field �ۼ� : ĸ��ȭ �ݵ�� ������ ��� : - empNo:int �̸� : -
 *         empName:String �ҼӺμ� : - dept:String ���� : - job:String ���� : - age:int
 *         ���� : - gender:char �޿� : - salary:int ���ʽ�����Ʈ : - bonusPoint:double �ڵ���
 *         : - phone:String �ּ� : - address:String
 * 
 *         Employee Ŭ������ �޼ҵ� �ۼ� 1. Ű�����Է¿� �޼ҵ� : empInput() 2. emp��ü ��� �ʵ� ��¿�
 *         �޼ҵ� : empOutput() 3. getter/setter�޼ҵ�
 */
public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;

	public void empInput() {
		Scanner sc = new Scanner(System.in);

		System.out.print("��� ��ȣ : ");
		setEmpNo(sc.nextInt());
		sc.nextLine();

		System.out.print("��� �̸� : ");
		setEmpName(sc.nextLine());

		System.out.print("�Ҽ� �μ� : ");
		setDept(sc.nextLine());

		System.out.print("����  : ");
		setJob(sc.nextLine());

		System.out.print("����  : "); // int
		setAge(sc.nextInt());
		sc.nextLine();

		System.out.print("����(�ѱ���)  : "); // char
		setGender(sc.nextLine().charAt(0));

		System.out.print("�޿�  : "); // int
		setSalary(sc.nextInt());
		sc.nextLine();

		System.out.print("���ʽ� ����Ʈ  : "); // double
		setBonusPoint(sc.nextDouble());
		sc.nextLine();

		System.out.print("�ڵ���  : ");
		setPhone(sc.nextLine());

		System.out.print("�ּ�  : ");
		setAddress(sc.nextLine());
	}

	public void empOutPut() {
		System.out.println("��� ��ȣ : " + getEmpNo()+
				"\n��� �̸� : " + getEmpName()+
				"\n�Ҽ� �μ� : " + getDept()+
				"\n���� : " + getJob()+
				"\n���� : " + getAge()+
				"\n���� : " + getGender()+
				"\n���� : " + getSalary()+
				"\n���ʽ� ����Ʈ : " + getBonusPoint()+
				"\n�ּ� : " +getAddress());
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}