package LECTURE6;

import java.util.Scanner;

public class binary_to_decimal {
/*source(binary) to destination(decimal)
	if we are going to base 3 to base 7 then we have to change base 3
	into base 10 and then base 10 to base 7...
	*/ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0; 
		int mult = 1;
		while(n>0) {
			int rem = n%10;
			sum += rem*mult;
			n= n/10;
			mult = mult*2;
			
		}
		System.out.println(sum);
	}

}
