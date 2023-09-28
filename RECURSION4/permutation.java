package RECURSION4;

public class permutation {

	public static void main(String[] args) {
		String str = "ABC";
		permutation(str,"");

	}
	public static void permutation(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i =0;i<str.length();i++) {
		String s1 =str.substring(0,i);
		String s2 = str.substring(i+1);
		char ch = str.charAt(i);
		permutation(s1+s2,ans+ch);
	}
	}

}
