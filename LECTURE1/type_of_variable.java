package LECTURE1;

public class type_of_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 32;
		System.out.println(a+" is type of "+ ((Object)a+" ").getClass().getSimpleName());
		
		char c = 'g';
		System.out.println(c+" is type of "+ ((Object)c).getClass().getSimpleName());
		
		String s ="aman";
		System.out.println(s+ " is tye of "+ s+" ".getClass().getSimpleName());
	}

}
