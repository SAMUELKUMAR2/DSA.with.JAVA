package LECTURE9;

public class Reverse_of_arr_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {5,6,3,8,9};
//		Reverse(arr,0,arr.length-1);
		Reverse(arr);
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
//	public static void Reverse(int []arr,int i, int j)
	public static  void Reverse(int []arr)
	{
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
		}
	}

}
