package Two_D_array;

public class transpose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = {{4,5,6,9},{11,3,7,8},{8,1,5,6},{110,1112,167,89}};
		
		transpose(arr);
		for(int i = 0;i<arr.length;i++) {
			for(int j= 0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}   
			System.out.println();
		}
		
		
		//Jack Array - whose column is not fixed, it varied
		int a[][] = new int [3][];
		a[0] = new int [2];
		 a[1] = new int [5];
		 a[2] = new int [6];
		
	}
	public static void transpose(int [][]arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j= i+1;j<arr[0].length;j++) {
				int temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i] = temp;
			}
		}
		
	}

}
