package RECURSION2;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a= 129;
		Integer b =129;
		
		System.out.println(a==b);
		String ques = "abc";
		printSub(ques,"");
	}
	public static void printSub(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		printSub(ques.substring(1),ans);	
		printSub(ques.substring(1),ans+ch);
		
	}
}
