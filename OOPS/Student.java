package OOPS;

public class Student {					//1- memory allocation of name and age	
	String name="Raj";					// 2- name= Raj 3- name = abhay
	int age = 32;						// 4- name = Himanshu
	int dob_month;
	String village;
	String course;
	public void info() {
		String name="Ajay"; //local variable
		int age = 33;
		System.out.println("Your name is "+this.name);
		System.out.println("You are "+ this.age + " old.");
		
	}
	
	public void info2(int dob,String course) {
		System.out.println("Your dob month is " + dob);
		System.out.println("course = " + course);
	}
	
	//Constructor in java
	//1- default constructor
	Student(){
	this.name="abhay";
	this.age = 22;
	}
	// Parameterized constructor
	Student(String v, String name){
		this.village=v;
		this.name= name;
		System.out.println("name = " + name);
		System.out.println("village = "+v);
	}
	
		
	}
  
