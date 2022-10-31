package com.ust;

public class Final1 extends Super1{

	final int x=5;
	int y;
		

	public static void main(String[] args) {
		Final1 s=new Final1();
		//s.x=7;
		s.y=10;
		System.out.println(s.z);
		//System.out.println(s.display());
		s.display();
	}

}

class Super1{
	final int z=10;
	final void display() {
		System.out.println("In Display updated");
	}
	void display(int x) {
		System.out.println("*");
	}
}
