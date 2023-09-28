package RECURSION3;
// there should not be two continues head
public class coin_toss_2 {

	public static void main(String[] args) {
		int n = 3;
		Toss(n,"");
	}
	public static void Toss(int n, String ans) {
		if(n==0) {
			System.out.println(ans+" ");
			return;
		}	
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			Toss(n-1,ans+"H");
	}
		Toss(n-1,ans+"T");

	}

}
