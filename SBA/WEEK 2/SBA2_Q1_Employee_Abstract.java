package collections;

abstract class Employee{
	
	abstract void calculateSalary(int hra,int ta, int ba);
	abstract void fetchDepartment();
}

class Engineer extends Employee{
	
	public void calculateSalary(int hra,int ta, int ba) {
		float salary=hra+ta+ba;
		System.out.println("Salary: "+salary);
	}
	
	public void fetchDepartment() {
		
		System.out.println("Department: Mechanical");
	}
}

class Doctor extends Employee{
	
	public void calculateSalary(int hra,int ta, int ba) {
		float salary=hra+ta+ba;
		System.out.println("Salary: "+salary);
	}
	
	public void fetchDepartment() {
		
		System.out.println("Department: Dental");
	}
}

public class SBA2_Q1_Employee_Abstract {

	public static void main(String[] args) {
		
		Engineer e = new Engineer();
		System.out.println("Engineer");
		System.out.println("----------------------");
		e.calculateSalary(1000, 1000, 3000);
		e.fetchDepartment();
		
		Doctor d = new Doctor();
		System.out.println("\nDoctor");
		System.out.println("----------------------");
		d.calculateSalary(1000, 1000, 5000);
		d.fetchDepartment();

	}

}
