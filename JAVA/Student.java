package com.ust;
//firstName,billOfThePatient
public class Student {
int sID;
String name;
int age;
String course;
static int count;


//public Student() {
	//constructor don't have return type
//}

{
	int z=7;
	System.out.println(z);
	z++;
	System.out.println(z);
}

public static void main(String args[]) {
	int x=5;
	String str;
	Student s=new Student(); //default constructor/zero argument constructor
	Student s1=new Student();
	Student s2=new Student();
	s.age=22;
	System.out.println(s.age);
	System.out.println(x);
	s.count=10;
	s1.age=25;
	System.out.println(s1.age);
	System.out.println(s.count);
	System.out.println(s1.count);
	float f=12.45f;
	
}
}
