package RECURSION4;

public class permutation_remove_dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCA";
		permutation(str,"");

	}
	public static void permutation(String str, String ans) {
		if(str.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		for(int i =0;i<str.length();i++) {
			boolean val = true;
			char ch = str.charAt(i);
			for(int j = i+1;j<str.length();j++) {
				if(str.charAt(j)==ch) {
					val = false;
					break;
				}
			}
			if(val==true) {
		String s1 =str.substring(0,i);
		String s2 = str.substring(i+1);
		permutation(s1+s2,ans+ch);
	}
		}
	}

}
