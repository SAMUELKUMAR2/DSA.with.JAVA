package LECTURE13;

public class Binary_Search_cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//x^k<=N; k=3 N=149;
		
		int n = 149;
		int k = 3;
		System.out.println(cubeRoot(n,k));
		
	}
	public static int cubeRoot(int n, int k) {
		int s = 1;
		int end = n;
		int ans =0;
		while(s<=end) {
			int mid = (s+end)/2;
			if(Math.pow(mid, k)<=n) {
				ans = mid;
				s = mid+1;
				
			}else {
				end = mid-1;
			}
		}
		return ans;
		
	}

}
