
//Date : 22-july-2023(Saturday)

package LECTURE4;
import java.util.*;
public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n/2+1;
		int space = -1;
		 while(row<=n) {
			 // for first star loop
			 int i = 1;
			 while(i<=star) {
			 System.out.print("* ");
			 i++;
		 }
			 //for space
		 int j = 1;
		 while(j<=space) {

			 System.out.print("  ");
			 j++;
			 }
//		 for second star loop
		 
			 int k = 1;
			 if(row==1 || row==7) {
				 k=2;
			 }
			 while(k<=star) {
			 System.out.print("* ");
			 k++;
		 }
			 // mirroring
		 if(row<=n/2) {
			 star--;
			 space+=2;
		 }
		 else {
			 star++;
			 space-=2;
		 }
		 System.out.println();
		 row++;
	}

}
}