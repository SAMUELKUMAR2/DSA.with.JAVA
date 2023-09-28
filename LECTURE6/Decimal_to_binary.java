package LECTURE6;
import java.util.*;
public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int mult = 1;
		
		while(n>0) {
			int rem = n%2;
			 sum = sum+rem*mult;
			 n =n/2;
			mult = mult*10;
		}
		System.out.println(sum);
		
		
	}

}
