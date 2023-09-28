package LECTURE3;
import java.util.*;

public class patter5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
//		****** Using for loop *****
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
//		****Using while loop***
		
//		int row = 1;
//		while(row<=n) {
//			int star=1;
//			while(star<=n) {
//				if()
//			}
//		}
	}

}
