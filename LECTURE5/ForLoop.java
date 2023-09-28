package LECTURE5;
import java.util.*;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		for (int i=2; i<=n-1; i++) {
			if(n%i==0) {
				count++;
//				break;
			}
			
		}
		System.out.println(count);
		 if(count>=1){
				System.out.println(n+" not prime number");
			}
			else {
				System.out.println( n+" is prime number");
			}
	}

}
