package LECTURE3;
import java.util.*;
public class tringle_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of term....");
		int n = sc.nextInt();
//		for( int i = 1; i<=n; i++) {
//			for (int j = 1; j<=i; j++) {
//				System.out.print( " * ");
//			}
//			System.out.println();
//		}
//	}
		
//		While loop
		int row=1;
		while(row<=n) {
			int star =1;
			while(star<=row) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			row++;
		}
		
	}
}
