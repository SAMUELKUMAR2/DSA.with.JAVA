package LECTURE8;

import java.util.Scanner;

public class Is_Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		System.out.println(count(n));
		System.out.println(Armstrong(n));
		
	}
	public static boolean Armstrong(int n) {
		int c = count(n);
		int sum = 0;
		int p = n;
		while(n>0) {
			int rem = n%10;
			sum = (int)(sum+Math.pow(rem,c));
			n = n/10;		
		}
		return sum ==p;
		
	}
	public static int count(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count; 
	}

}
