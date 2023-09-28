package LECTURE4;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		 int row = n;
		 int star = n;
		 int space = 2*n -2;
		 while(row<=2*n-1) {
			 int i = 1;
			 while(i<=star) {
				 System.out.print("* ");
				 i++;
			 }
			 int j = 1;
			 while(i<space) {
				 System.out.print("  ");
				 j++;
				 
			 }
			 if(row<n) {
				 star--;
				 
			 }
			 else {
				 star--;
				 space-=2;
			 }
			 
		 }
	}

}
