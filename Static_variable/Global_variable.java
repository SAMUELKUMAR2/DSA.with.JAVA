package Static_variable;

public class Global_variable {
	static int val = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first");
		System.out.println(val);
		System.out.println("next");
		fun();
		System.out.println(val);
	}
	public static void fun() {
		int val = 90;
		val = val+2;
		System.out.println("function value = "+val);
//		Changing Global variable 
		Global_variable.val = Global_variable.val+3;
	}

}
