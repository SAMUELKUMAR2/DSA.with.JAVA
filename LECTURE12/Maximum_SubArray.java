package LECTURE12;

import java.util.Scanner;

public class Maximum_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []arr= {2,3,-6,7,-1,5};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for(int i = 0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println(Subarray(arr));
	}
	public static int Subarray(int []arr) {
	
		int ans =Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
		
				sum=sum+arr[i];
				ans =Math.max(sum, ans);
				//for neglecting negative sum
				if(sum<0) {
					sum=0;
				}
				
		}
		return ans;
	}

}

/*Kadane's Algorithm.:- is use to find the sum of
contiguous subarray with maximum sum.*/