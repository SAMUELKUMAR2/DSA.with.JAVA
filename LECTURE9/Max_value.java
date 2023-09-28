package LECTURE9;

import java.util.Scanner;

public class Max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
		int []arr = {2,1,5,6,7,-8,11,9,7};
		System.out.println(max(arr));
	}
	public static int max(int []arr) {
//		int max =arr[0];
			int max = Integer.MIN_VALUE;
		for(int i =1;i<arr.length; i++) {
//			if(max<arr[i]) {
//				max = arr[i];
//			
//	
		 max = Math.max(max, arr[i]);
		
		}
		return max;
	}
	

}
