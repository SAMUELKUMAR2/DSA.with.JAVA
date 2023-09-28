package LECTURE4;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row = 1;
		int space= n-1;
		int star = 1;
		while(row<=2*n-1) {
			int i = 1;
			//Space
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			//Star
			int j = 1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//Mirroring
			if(row<n) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			System.out.println();
			row++;
		}
	}

}
