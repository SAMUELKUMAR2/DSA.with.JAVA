package Two_D_array;

import java.util.Scanner;

public class Take_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [][]arr = new int[n][m];
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
	}
		input(arr);
}
	public static void input(int arr[][]) {
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}