package RECURSION2;

public class Coin_toss {
	static int count = 0; //global_variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Toss(n,"");
		System.out.println("global_count= "+ count); // output for global
		System.out.println("Local_count= "+Toss_count(n,""));   
		//output from Toss_count function
		}
	public static void Toss(int n, String ans) {
		if(n==0) {
			System.out.println(ans+" ");
			count++;
			return;
		}	 
			Toss(n-1,ans+"H");
		
		Toss(n-1,ans+"T");
	}
	public static int Toss_count(int n, String ans) {
		int count = 0;
		if(n==0) {
			
			count++;
			return 1;
		}	 
			int a= Toss_count(n-1,ans+"H");
			int b = Toss_count(n-1,ans+"T");
			
			return a+b;
	}
}
