package com.ust;

public class VariableTypesExample {
	static int x=1;
	private int y=3;
	
	public void method1(int x) {
		
		VariableTypesExample t=new VariableTypesExample();
		this.x=2;
		y=4;
		
		System.out.println("Test.x: "+VariableTypesExample.x);
		System.out.println("t.x: "+t.x);
		System.out.println("t.y: "+t.y);
		System.out.println("y: "+y);
	}
	
	public static void main(String args[]) {
		VariableTypesExample t=new VariableTypesExample();
		t.method1(15);
	}

}
