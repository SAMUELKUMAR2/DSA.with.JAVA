package LECTURE3;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int row = 1;
		int star = n;
		int space =0;
	while(row<=n) {
		int i = 1;
		while(i<=space) {
			System.out.print("  ");
			i++;
		}
		int j= 1;
		while(j<=star) {
			System.out.print("* ");
			j++;
		}
		System.out.println();
		row++;
		star--;
		space++;
	}
	}

}
