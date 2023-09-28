package LECTURE9;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
		int []arr = {2,1,5,6,7,8,11,9,7};
		int item = 11;
		System.out.println(Search(arr,item));
	}	
	public static int Search(int []arr,int item) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
		
	}

}
