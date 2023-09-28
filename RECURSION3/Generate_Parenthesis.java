package RECURSION3;
import java.util.*;
public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		List<String> ll = new ArrayList<>();
		GenerateParenthesis(n, 0,0 ,"",ll);
		System.out.println(ll);
	}
	public static void GenerateParenthesis(int n ,int open, int close,String ans,List<String>ll) {
		if(open==n && close==n) {
//			System.out.print(ans+" ");
			ll.add(ans);
			return;
		}
		if(open<n) {
			GenerateParenthesis(n,open+1,close,ans+"(",ll);
		}
		if(close<open) {
			GenerateParenthesis(n,open,close+1,ans+")",ll);
		} 
	}

}
