package OOPS;

import java.util.Scanner;

public class student_Client {

	public static void main(String[] args) {
		// Object without parameter....
		Student st = new Student();
		st.age=12;
		st.name="Rahul";
		
		Student st2 = new Student();
		st2.name="Himanshu";
		st2.age=44;
		st2.info();
		st.info();
		System.out.println(".................");
		Student st3 = new Student();
		st3.info2(3, "Civil");
		
		// parameterized constructor
		Student st4 = new Student("lucknow","Raju");
		
	}
	

	

}
