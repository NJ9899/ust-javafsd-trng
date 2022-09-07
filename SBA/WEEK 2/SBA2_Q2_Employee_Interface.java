package collections;

interface Employee1{
	
	abstract void calculateSalary(int hra,int ta, int ba);
	abstract void fetchDepartment();
}

class Engineer1 implements Employee1{
	
	public void calculateSalary(int hra,int ta, int ba) {
		float salary=hra+ta+ba;
		System.out.println("Salary: "+salary);
	}
	
	public void fetchDepartment() {
		
		System.out.println("Department: Mechanical");
	}
}

class Doctor1 implements Employee1{
	
	public void calculateSalary(int hra,int ta, int ba) {
		float salary=hra+ta+ba;
		System.out.println("Salary: "+salary);
	}
	
	public void fetchDepartment() {
		
		System.out.println("Department: Dental");
	}
}

public class SBA2_Q2_Employee_Interface {

	public static void main(String[] args) {

		Engineer1 e = new Engineer1();
		System.out.println("Engineer");
		System.out.println("----------------------");
		e.calculateSalary(1000, 1000, 3000);
		e.fetchDepartment();
		
		Doctor1 d = new Doctor1();
		System.out.println("\nDoctor");
		System.out.println("----------------------");
		d.calculateSalary(1000, 1000, 5000);
		d.fetchDepartment();
	}

}

