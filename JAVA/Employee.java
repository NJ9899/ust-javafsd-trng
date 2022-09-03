package com.ust;
import java.util.Scanner;

public class Employee {
	int id,salary1;
	byte age;
	String name,department,designation;
	float salary;
	Scanner sc= new Scanner(System.in);
	void getDetails() {
		System.out.println("Enter employee id: ");
		id = sc.nextInt();
		System.out.println("Enter employee name: ");
		name = sc.next();
		System.out.println("Enter employee age: ");
		age = sc.nextByte();
		System.out.println("Enter employee department: ");
		department = sc.next();
		System.out.println("Enter employee designation: ");
		designation = sc.next();
		//System.out.println("Enter employee salary: ");
		//salary = sc.nextFloat();
	}
	
	void display() {
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee age: "+age);
		System.out.println("Employee department: "+department);
		System.out.println("Employee designation: "+designation);
		//System.out.println("Employee salary: "+salary);
	}
	
	void salary(int hra,int ta,int ba) {
		salary1=hra+ta+ba;
		System.out.println("Salary(int type in Super class): "+salary1);
	}
	
	void salary(float hra,float ta,float ba) {
		salary=hra+ta+ba;
		System.out.println("Salary(float type in Super class): "+salary);
	}

	public static void main(String[] args) {
		Employee e = new Employee();                                    
		System.out.println("Question 1");
		e.getDetails();
		System.out.println();
		System.out.println("Question 2");
		e.display();
		System.out.println();
		System.out.println("Question 3");
		System.out.println("Method overloading");
		e.salary(1000,1000,10000);
		e.salary(1000.7f,1000.6f,10000.3f);
		System.out.println();
		System.out.println("Method overriding");
		Salary s=new Salary();
		s.salary(10,20,30);
		//System.out.println("Question 4 - Super");
		//s.salary(1000,1000,34000);
		//System.out.println();
		//Salary s1=new Salary();
		//s1.salary(1,2,3);
		
	}

}

class Salary extends Employee{
	
	
	void salary(int hra,int ta,int ba) {
		
		float salary;
		
		salary=hra+ta+ba;
		System.out.println("Salary(In subclass): "+salary);
		//super.salary(hra,ta,ba);
	}
	
}
