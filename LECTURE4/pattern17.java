package LECTURE4;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int row = 1;
		int star = n/2;
		int space = 1;
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
		 
			 i = 1;
			 while(i<=star) {
			 System.out.print("* ");
			 i++;
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