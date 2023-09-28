package Two_D_array;

public class hard_code_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{4,5,6,9},
						{11,3,7,8},
						{8,1,5,6}};
	for(int row = 0;row<arr.length;row++) {
		for(int col = 0;col<arr[0].length;col++) {
			System.out.print(arr[row][col]+" ");
		}
		System.out.println();
	}
//		expected-- 4 11 8 1 3 5 6 7 5 6 8 9
		wave(arr);
		
		}
	public static void wave(int [][]arr) {
		for(int col = 0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row = 0;row<arr.length;row++) {
					System.out.print(arr[row][col]+ " ");
				}
			}
			else {
				for(int row = arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col]+" ");
				}
			}
		}
	}
	
	}


