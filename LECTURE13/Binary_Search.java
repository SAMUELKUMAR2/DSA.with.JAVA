package LECTURE13;
//leetcode 704
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		int item = 91;
		System.out.println(Search(arr,item));
	
		
	}
	public static int Search(int []arr, int item) {
		int start = 0;
		int end = arr.length;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
		
				}

}
