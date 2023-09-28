package LECTURE12;

public class All_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // The array elements
	      int arr[] = { 10, 2, 3, 99, 12, 0 };
	      System.out.println("The subarrays are-");
	      
	      // For loop for start index
	      for (int i = 0; i < arr.length; i++)
	      
	      // For loop for end index
	      for (int j = i; j < arr.length; j++) {
	      
	         // For loop to print subarray elements
	         for (int k = i; k <=j; k++)
	            System.out.print(arr[k] + " ");
	            System.out.println("");
	      }
	   }
	

	}

