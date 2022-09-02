package com.ust;
import com.ust.InstanceofDemo;


public class InstanceofDemoCompileTimeError {

	public static void main(String[] args) {
		Fruit apple=new Fruit();
		Vehicle car=new Vehicle();
		
		//System.out.println("car IS A Fruit: "+(car instanceof Fruit));	//it throws a compile time error
		System.out.println("car IS A Fruit: "+(car instanceof Vehicle));

	}

}
