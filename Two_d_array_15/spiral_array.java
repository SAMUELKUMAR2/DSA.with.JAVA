package Two_d_array_15;
import java.util.*;
public class spiral_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int arr[][] = new int [4][4];
//		for(int i = 0;i<arr.length;i++) {
//			for(int j = 0;j<arr[0].length;j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		Spiral(arr);
	}
	public static void Spiral(int arr[][]) {
		int minR = 0;
		int minC = 0;
		int maxC = arr[0].length-1;
		int maxR = arr.length-1;
		int totalelement = arr.length*arr[0].length;
		int count = 0;
		while(count<totalelement) {
		for(int i =minC;i<=maxC && count<totalelement;i++) {
			System.out.print(arr[minR][i]+" ");
			count++;
		}
	
		minR++;
		for(int i = minR;i<=maxR && count<totalelement;i++) {
			System.out.print(arr[i][maxC]+" ");
			count++;
		}
		maxC--;
		for(int i = maxC;i>=minC && count<totalelement;i--) {
			System.out.print(arr[maxR][i]+" ");
			count++;
		}
		maxR--;
		for(int i = maxR;i>=minR && count<totalelement;i--) {
			System.out.print(arr[i][minC]+" ");
			count++;
		}
		minC++;
		}
		System.out.println();
		System.out.print("count = "+count);
	}

}
