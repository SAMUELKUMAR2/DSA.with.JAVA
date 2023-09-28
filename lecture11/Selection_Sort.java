package lecture11;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {6,3,8,2,1,-8};
		Selection(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Selection(int []arr) {
		for(int i = 0; i<arr.length-1;i++) {
			int min = i;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i]= arr[min];
			arr[min]= temp;
		}
	}

}
