package LECTURE3;

public class inverse_tringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 10;
		int row=1;
		while(row<=n) {
			int star =1;
			while(star<=n+1-row) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			row++;
		}
	}

}
