 package lecture11;
// sorting last element in sorted array
public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = { 9, 5, 1, 4, 3};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");       
		}

	}
	public static void sort(int[]arr) {
		for(int i = 1; i<arr.length;i++) {
		inserted(arr,i);
		}
	}
	public static void inserted(int []arr, int i) {
		int j = i-1;
		int item = arr[i];
		while(j>=0 && arr[j]>item ) {
			arr[j+1] = arr[j];
			arr[j]= item;
			j--;
		}
	}

}
