package com.ust;

public class Constructors {

	int x;
	int y;
	
	Constructors(){
		System.out.println("zero arg constructor");
	}
	
	Constructors(int x){
		this(x,5); //c1(x,5)
		System.out.println(x);
	}
	
	Constructors(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println(x+" "+y);
	}
	
	Constructors check(Constructors c){
		System.out.println("in check");
		return this;
	}
	
	void test() {
		Constructors c3=check(this);
		System.out.println("Object returned");	//check(c)
	}
	
	public static void main(String[] args) {
		Constructors c  = new Constructors();
		Constructors c1  = new Constructors(2);
		Constructors c2  = new Constructors(2,3);
		c.test();
	}

}
