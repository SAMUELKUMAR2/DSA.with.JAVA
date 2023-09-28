//Board Path
package RECURSION3;
public class Roll_Dise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		printPath(n,0,"");
		
	}
	public static void printPath(int end, int curr, String ans) {
		if(curr==end) {
			System.out.println(ans);
			return;
		}
		if(curr>end) {
			return;
		}
//		printPath(end,curr+1,ans+1);
//		printPath(end,curr+2,ans+2);
//		printPath(end,curr+3,ans+3);
//		using loop
		for(int dice = 1;dice<=3;dice++) {
			printPath(end,curr+dice,ans+dice);
		}
	}

}
