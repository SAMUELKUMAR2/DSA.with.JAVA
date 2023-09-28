package LECTURE5;

import java.util.Scanner;

public class fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a= 1;
		int b =2;
		
		
		for (int i=1; i<=n; i++) {
			System.out.println(a+" ");
			 int c = a+b;
			a=b;
			b=c;
			
		}
	}

}
