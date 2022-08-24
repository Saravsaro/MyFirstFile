package com.test;

class Employee
{
	int empId;
	String empName;
	double empSalary;
	
	Employee(int empId,String empName,double empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	void display()
	{
		System.out.println(this.empId);
		System.out.println(this.empName);
		System.out.println(this.empSalary);
	}
	}


public class ThisKeyword {

	public static void main(String[] args) {
		
		Employee employee=new Employee(996,"Mr. Rolex",6000);
		employee.display();

	}

}

