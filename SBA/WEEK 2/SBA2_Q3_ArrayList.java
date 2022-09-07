package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Employees{
	
	int empID;
	String name; 
	Scanner sc = new Scanner(System.in);
	
	void getDetails() {
		System.out.println("Enter id: ");
		empID = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
	}
	
	void display() {
		System.out.println("\nid: "+empID);
		System.out.println("Name: "+name);
	}
}

public class SBA2_Q3_ArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		
		//Employees e[]= new Employees[20];
		List <Employees> e =new ArrayList<>();
		
		System.out.println("Enter the no of employees: ");
		int n=sc.nextInt();
		
		Employees e1[]=new Employees[n+1];
		
		for(int i=1;i<=n;i++) {
			e1[i]=new Employees();
			e1[i].getDetails();
			e.add(e1[i]);
		}
		
		Iterator<Employees> itr = e.iterator();
		while(itr.hasNext()) {
			count++;
			itr.next().display();
		}
		
		
		
	}

}
