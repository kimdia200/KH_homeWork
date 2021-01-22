package com.oop.employee.model.vo;

public class Employee {
	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonusPct;
	
	public Employee() {
	}
	public Employee(int empNo, String name, char gender, String phone) {
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}
	public Employee(int empNo, String name, char gender, String phone, String dept, int salary, double bonusPct) {
		this(empNo, name, gender, phone);
		this.dept = dept;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	public void printEmployee() {
		System.out.println(empNo+", "+name+", "+gender+", "+phone+", "+dept+", "+salary+", "+bonusPct);
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPct() {
		return bonusPct;
	}
	public void setBonusPct(double bonusPct) {
		this.bonusPct = bonusPct;
	}
	
}
