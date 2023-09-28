package LECTURE13;

import java.util.Scanner;

public class KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		int k = sc.nextInt();
		kth_root(n,k);
	}
	public static void kth_root(int n,int k) {
		int start = 1;
		int end = n;
		int ans = 0;
		while(start<=end) {
			int mid = (start+end)/2;
			if(Math.pow(mid, k)<=n) {
				ans = mid;
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		System.out.print(ans);
	}
	}

