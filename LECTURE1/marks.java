package LECTURE1;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=88;
		if(m>=75) {
			System.out.println("A Grade");
			
		}else if(m>=65 && m<75) {
			System.out.println("B grade");
		}
		else if(m>=55 && m<65) {
			System.out.println("C grade");
		}
		else if(m>=45 && m<55) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAIL");
		}

		
		int n=36;
		if(n%2==0 && n%3==0) {
			System.out.println("heyy");
		}
		else if(n%7==0) {
			System.out.println("byy");
		}
		else {
			System.out.println("OKK");
		}
	}
	

}
